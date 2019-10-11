package cn.waqwb.springbootcunsumer.consumer;





import cn.waqwb.springbootcunsumer.entity.Order;


import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

/**
 * @author JokerQ
 * @date 2019/7/31 - 15:45
 */
@Component
public class OrderReceiver {
    //配置监听的哪一个队列，同时在没有queue和exchange的情况下会去创建并建立绑定关系

   @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(
                            value = "order-queue",durable = "true"
                    ),
                    exchange = @Exchange(
                            name = "order-exchange",durable = "true",type = "topic"
                    ),
                    key = "order.*"
            )
    )
    @RabbitHandler
    public void onOrderMessage(@Payload Order order, @Headers Map<String,Object> headers, Channel channel) throws IOException {
        //消费者操作
        System.err.println("---------收到消息，开始消费---------");
        System.err.println("订单ID"+order.getId());
        Long deliveryTag = (Long)headers.get(AmqpHeaders.DELIVERY_TAG);
       /**
        *  multiple 取值为 false 时，表示通知 RabbitMQ 当前消息被确认
        *  如果为 true，则额外将比第一个参数指定的 delivery tag 小的消息一并确认
        */
       boolean multiple = false;
       //ACK,确认一条消息已经被消费
       channel.basicAck(deliveryTag,multiple);

    }

}
