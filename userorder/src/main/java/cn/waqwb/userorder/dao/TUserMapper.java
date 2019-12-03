package cn.waqwb.userorder.dao;

import cn.waqwb.userorder.pojo.TUser;
import cn.waqwb.userorder.pojo.TUserExample;
import java.util.List;

import cn.waqwb.userorder.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(String userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    /**
     *
     * @param userId
     * @return
     */
    TUser queryByTUserId(@Param("id") String userId);

}