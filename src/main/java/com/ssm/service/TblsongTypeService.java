package com.ssm.service;

import com.ssm.po.SongType;
import com.ssm.po.SongTypeExample;
import com.ssm.po.Tblsong;
import com.ssm.po.TblsongExample;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface TblsongTypeService {
	List<SongType> selectByExample(SongTypeExample example);
	
	public List<SongType> selectByExamplePage(SongTypeExample example);

	public int countByExample(SongTypeExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public void add(HttpServletRequest request);
	
	public SongType getTblsongTypeById(String id);
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
}
