package cn.waqwb.userorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("cn.waqwb.userorder.dao")
public class UserorderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserorderApplication.class, args);
    }

}
