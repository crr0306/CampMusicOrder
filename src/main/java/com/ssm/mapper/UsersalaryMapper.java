package com.ssm.mapper;

import com.ssm.po.User;
import com.ssm.po.UserExample;
import com.ssm.po.Usersalary;
import com.ssm.po.UsersalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersalaryMapper {
    int countByExample(UsersalaryExample example);

    int deleteByExample(UsersalaryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Usersalary record);

    int insertSelective(Usersalary record);

    List<Usersalary> selectByExample(UsersalaryExample example);

    Usersalary selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Usersalary record, @Param("example") UsersalaryExample example);

    int updateByExample(@Param("record") Usersalary record, @Param("example") UsersalaryExample example);

    int updateByPrimaryKeySelective(Usersalary record);

    int updateByPrimaryKey(Usersalary record);
    
    List<Usersalary> selectByExamplePage(UsersalaryExample example);
    
}