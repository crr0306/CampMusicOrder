package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.Tblsong;
import com.ssm.po.TblsongExample;

public interface TblsongService {
	List<Tblsong> selectByExample(TblsongExample example);
	
	public List<Tblsong> selectByExamplePage(TblsongExample example);

	public int countByExample(TblsongExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public String add(HttpServletRequest request);
	
	public Tblsong getTblsongById(String id); 
	
	public String updateByPrimaryKeySelective(HttpServletRequest request);
	
}
