package cn.waqwb.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

/**
 * @author JokerQ
 * @date 2020/2/13 - 14:02
 */
import cn.waqwb.hello.spring.cloud.alibaba.nacos.consumer.feign.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider",fallback = EchoServiceFallback.class)
public interface NacosProviderService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}