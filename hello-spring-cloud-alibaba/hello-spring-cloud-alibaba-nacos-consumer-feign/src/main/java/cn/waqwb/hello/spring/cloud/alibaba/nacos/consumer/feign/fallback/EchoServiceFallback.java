package cn.waqwb.hello.spring.cloud.alibaba.nacos.consumer.feign.fallback;

import cn.waqwb.hello.spring.cloud.alibaba.nacos.consumer.feign.service.NacosProviderService;
import org.springframework.stereotype.Component;

/**
 * @author JokerQ
 * @date 2020/2/13 - 15:55
 */
@Component
public class EchoServiceFallback implements NacosProviderService {
    @Override
    public String echo(String message) {
        return "echo fallback,请求失败，请检查网络";
    }
}