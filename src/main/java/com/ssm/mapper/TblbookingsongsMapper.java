package com.ssm.mapper;

import com.ssm.po.Tblbookingsongs;
import com.ssm.po.TblbookingsongsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblbookingsongsMapper {
    int countByExample(TblbookingsongsExample example);

    int deleteByExample(TblbookingsongsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Tblbookingsongs record);

    int insertSelective(Tblbookingsongs record);

    List<Tblbookingsongs> selectByExample(TblbookingsongsExample example);

    Tblbookingsongs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Tblbookingsongs record, @Param("example") TblbookingsongsExample example);

    int updateByExample(@Param("record") Tblbookingsongs record, @Param("example") TblbookingsongsExample example);

    int updateByPrimaryKeySelective(Tblbookingsongs record);

    int updateByPrimaryKey(Tblbookingsongs record);
    
    List<Tblbookingsongs> selectByExamplePage(TblbookingsongsExample example);
    
}