package cn.waqwb.userorder.dao;

import cn.waqwb.userorder.pojo.StuTeacher;
import cn.waqwb.userorder.pojo.StuTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuTeacherMapper {
    int countByExample(StuTeacherExample example);

    int deleteByExample(StuTeacherExample example);

    int insert(StuTeacher record);

    int insertSelective(StuTeacher record);

    List<StuTeacher> selectByExample(StuTeacherExample example);

    int updateByExampleSelective(@Param("record") StuTeacher record, @Param("example") StuTeacherExample example);

    int updateByExample(@Param("record") StuTeacher record, @Param("example") StuTeacherExample example);
}