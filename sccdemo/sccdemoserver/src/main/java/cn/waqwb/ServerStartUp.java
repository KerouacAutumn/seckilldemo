package cn.waqwb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author JokerQ
 * @date 2019/10/31 - 20:03
 */
@SpringBootApplication
@EnableConfigServer
public class ServerStartUp {
    public static void main(String[] args) {
        SpringApplication.run(ServerStartUp.class,args);
    }
}
