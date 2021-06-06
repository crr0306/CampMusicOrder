package com.ssm.mapper;

import com.ssm.po.Signlog;
import com.ssm.po.SignlogExample;
import com.ssm.po.User;
import com.ssm.po.UserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignlogMapper {
    int countByExample(SignlogExample example);

    int deleteByExample(SignlogExample example);

    int deleteByPrimaryKey(String id);

    int insert(Signlog record);

    int insertSelective(Signlog record);

    List<Signlog> selectByExample(SignlogExample example);

    Signlog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Signlog record, @Param("example") SignlogExample example);

    int updateByExample(@Param("record") Signlog record, @Param("example") SignlogExample example);

    int updateByPrimaryKeySelective(Signlog record);

    int updateByPrimaryKey(Signlog record);
    
    List<Signlog> selectByExamplePage(SignlogExample example);
    
}