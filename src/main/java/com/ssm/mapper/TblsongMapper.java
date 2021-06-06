package com.ssm.mapper;

import com.ssm.po.Tblsong;
import com.ssm.po.TblsongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblsongMapper {
    int countByExample(TblsongExample example);

    int deleteByExample(TblsongExample example);

    int deleteByPrimaryKey(String id);

    int insert(Tblsong record);

    int insertSelective(Tblsong record);

    List<Tblsong> selectByExample(TblsongExample example);

    Tblsong selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Tblsong record, @Param("example") TblsongExample example);

    int updateByExample(@Param("record") Tblsong record, @Param("example") TblsongExample example);

    int updateByPrimaryKeySelective(Tblsong record);

    int updateByPrimaryKey(Tblsong record);
    
    List<Tblsong> selectByExamplePage(TblsongExample example);
    
}