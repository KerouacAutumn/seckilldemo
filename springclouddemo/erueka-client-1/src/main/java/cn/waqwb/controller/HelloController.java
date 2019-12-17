package cn.waqwb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JokerQ
 * @date 2019/12/11 - 17:12
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("sayHi")
    public String hello(@RequestParam String name) {
        return "Hello World " + name + ",I am form" + port;
    }
}
