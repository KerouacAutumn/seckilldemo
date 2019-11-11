package cn.waqwb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JokerQ
 * @date 2019/10/31 - 21:09
 */
@SpringBootApplication
@RestController
public class ClientStartUp {

    @Value("${name}")
    String name;

    @RequestMapping("/")
    public String sayHello(){
        return "Hello "+name;
    }
    public static void main(String[] args) {
        SpringApplication.run(ClientStartUp.class,args);
    }
//    // 设置@Value注解取值不到忽略（不报错）
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//        c.setIgnoreUnresolvablePlaceholders(true);
//        return c;
//    }

}
