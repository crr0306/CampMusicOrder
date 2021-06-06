package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.Leavemsg;
import com.ssm.po.LeavemsgExample;

public interface LeavemsgService {
	List<Leavemsg> selectByExample(LeavemsgExample example);
	
	public List<Leavemsg> selectByExamplePage(LeavemsgExample example);

	public int countByExample(LeavemsgExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public void add(HttpServletRequest request);
	
	public void add3(HttpServletRequest request);
	
	public Leavemsg getLeavemsgById(String id); 
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
	public void updateByPrimaryKeySelective3(HttpServletRequest request);
	
}
