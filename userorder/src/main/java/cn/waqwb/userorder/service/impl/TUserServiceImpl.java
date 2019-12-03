package cn.waqwb.userorder.service.impl;

import cn.waqwb.userorder.dao.TUserMapper;
import cn.waqwb.userorder.pojo.TUser;
import cn.waqwb.userorder.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author JokerQ
 * @date 2019/12/3 - 11:40
 */
@Service
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public TUser findTUser(String userId) {
        return tUserMapper.queryByTUserId(userId);
    }
}
