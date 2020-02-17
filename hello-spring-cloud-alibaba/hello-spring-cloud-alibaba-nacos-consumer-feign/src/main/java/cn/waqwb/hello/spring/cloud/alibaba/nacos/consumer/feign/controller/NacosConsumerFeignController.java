package cn.waqwb.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

/**
 * @author JokerQ
 * @date 2020/2/13 - 14:06
 */
import cn.waqwb.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConsumerFeignController {

    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping(value = "/echo/hi")
    public String echo() {
        return nacosProviderService.echo("Hi Feign");
    }
}
