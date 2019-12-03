package cn.waqwb.userorder.controller;

import cn.waqwb.userorder.pojo.TUser;
import cn.waqwb.userorder.pojo.User;
import cn.waqwb.userorder.service.TUserService;
import cn.waqwb.userorder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JokerQ
 * @date 2019/12/3 - 10:23
 */
@RestController
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @RequestMapping("/findTUser")
    public TUser findUser(String userId){
        return tUserService.findTUser(userId);
    }
}
