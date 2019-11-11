package cn.waqwb.seckilldemo.controller;

import cn.waqwb.seckilldemo.mapper.UserDOMapper;
import cn.waqwb.seckilldemo.po.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JokerQ
 * @date 2019/10/18 - 19:25
 */
@RestController
public class TestController {
    @Autowired
    private UserDOMapper userDOMapper;
    @RequestMapping("/select")
    public String select(){
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (userDO == null) {
            return "用户不存在";
        } else {
            return userDO.getName();
        }
    }
}
