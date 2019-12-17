package cn.waqwb.eruekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EruekaServer1Application.class, args);
    }

}
