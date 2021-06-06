package com.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.po.Syscode;
import com.ssm.po.SyscodeExample;

public interface SyscodeMapper {
    int countByExample(SyscodeExample example);

    int deleteByExample(SyscodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Syscode record);

    int insertSelective(Syscode record);

    List<Syscode> selectByExample(SyscodeExample example);

    Syscode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Syscode record, @Param("example") SyscodeExample example);

    int updateByExample(@Param("record") Syscode record, @Param("example") SyscodeExample example);

    int updateByPrimaryKeySelective(Syscode record);

    int updateByPrimaryKey(Syscode record);
    
    List<Syscode> selectByExamplePage(SyscodeExample example);
    
}