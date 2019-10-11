package cn.waqwb.springbootproducer;

import cn.waqwb.springbootproducer.entity.Order;
import cn.waqwb.springbootproducer.producer.OrderSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootProducerApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private OrderSender orderSender;

    @Test
    public void testSend01() throws Exception{
        Order order = new Order();
        order.setId("20190731000000001");
        order.setName("测试订单01");
        order.setMessageId(System.currentTimeMillis()+"@"+UUID.randomUUID().toString());
        orderSender.send(order);
    }
}
