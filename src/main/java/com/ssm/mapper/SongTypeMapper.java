package com.ssm.mapper;

import com.ssm.po.SongType;
import com.ssm.po.SongTypeExample;
import java.util.List;

import com.ssm.po.Tblsong;
import com.ssm.po.TblsongExample;
import org.apache.ibatis.annotations.Param;

public interface SongTypeMapper {
    int countByExample(SongTypeExample example);

    int deleteByExample(SongTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(SongType record);

    int insertSelective(SongType record);

    List<SongType> selectByExample(SongTypeExample example);

    SongType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SongType record, @Param("example") SongTypeExample example);

    int updateByExample(@Param("record") SongType record, @Param("example") SongTypeExample example);

    List<SongType> selectByExamplePage(SongTypeExample example);
}