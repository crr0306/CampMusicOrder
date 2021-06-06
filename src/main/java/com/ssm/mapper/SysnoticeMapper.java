package com.ssm.mapper;

import com.ssm.po.Sysnotice;
import com.ssm.po.SysnoticeExample;
import com.ssm.po.User;
import com.ssm.po.UserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysnoticeMapper {
    int countByExample(SysnoticeExample example);

    int deleteByExample(SysnoticeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Sysnotice record);

    int insertSelective(Sysnotice record);

    List<Sysnotice> selectByExample(SysnoticeExample example);

    Sysnotice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Sysnotice record, @Param("example") SysnoticeExample example);

    int updateByExample(@Param("record") Sysnotice record, @Param("example") SysnoticeExample example);

    int updateByPrimaryKeySelective(Sysnotice record);

    int updateByPrimaryKey(Sysnotice record);
    
    List<Sysnotice> selectByExamplePage(SysnoticeExample example);
    
}