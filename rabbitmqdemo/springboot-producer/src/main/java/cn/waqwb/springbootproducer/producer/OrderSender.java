package cn.waqwb.springbootproducer.producer;

import cn.waqwb.springbootproducer.entity.Order;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author JokerQ
 * @date 2019/7/31 - 15:04
 */
@Component
public class OrderSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(Order order) throws Exception {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(order.getMessageId());
        rabbitTemplate.convertAndSend(
                "order-exchange",//exchange
                "order.abcd",//routingKey
                order,//消息体内容
                correlationData//correlationData消息唯一ID
        );
    }
}
