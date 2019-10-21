package cn.waqwb.swaggerdemo.controller;

import cn.waqwb.swaggerdemo.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JokerQ
 * @date 2019/10/18 - 15:30
 */
@RestController
public class TestController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        return userMapper.selectByExample(null);
    }
}
