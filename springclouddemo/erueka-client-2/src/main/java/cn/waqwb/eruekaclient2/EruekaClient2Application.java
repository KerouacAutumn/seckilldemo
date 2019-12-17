package cn.waqwb.eruekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"cn.waqwb.*"})
public class EruekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EruekaClient2Application.class, args);
    }

}
