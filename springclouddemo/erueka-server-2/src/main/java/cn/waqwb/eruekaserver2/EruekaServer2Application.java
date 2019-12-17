package cn.waqwb.eruekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(EruekaServer2Application.class, args);
    }

}
