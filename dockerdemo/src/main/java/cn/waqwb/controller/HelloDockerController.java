package cn.waqwb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JokerQ
 * @date 2019/10/13 - 11:54
 */
@RestController
public class HelloDockerController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Docker!";
    }

}
