package com.ssm.mapper;

import com.ssm.po.Leavemsg;
import com.ssm.po.LeavemsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeavemsgMapper {
    int countByExample(LeavemsgExample example);

    int deleteByExample(LeavemsgExample example);

    int deleteByPrimaryKey(String id);

    int insert(Leavemsg record);

    int insertSelective(Leavemsg record);

    List<Leavemsg> selectByExample(LeavemsgExample example);

    Leavemsg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Leavemsg record, @Param("example") LeavemsgExample example);

    int updateByExample(@Param("record") Leavemsg record, @Param("example") LeavemsgExample example);

    int updateByPrimaryKeySelective(Leavemsg record);

    int updateByPrimaryKey(Leavemsg record);
    List<Leavemsg> selectByExamplePage(LeavemsgExample example);
}