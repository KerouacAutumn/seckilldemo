package cn.waqwb.userorder.service.impl;

import cn.waqwb.userorder.dao.UserMapper;
import cn.waqwb.userorder.pojo.User;
import cn.waqwb.userorder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JokerQ
 * @date 2019/12/3 - 10:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(Integer id) {
        return userMapper.queryUserId(id);
    }
}
