package cn.waqwb.seckilldemo.Service;

import cn.waqwb.seckilldemo.Service.model.UserModel;
import cn.waqwb.seckilldemo.error.BusinessException;

/**
 * @author JokerQ
 * @date 2019/10/18 - 19:51
 */
public interface UserService {
    UserModel getUserById(Integer id);
    void register(UserModel userModel) throws BusinessException;
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
