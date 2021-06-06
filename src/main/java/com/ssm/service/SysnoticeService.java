package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.Sysnotice;
import com.ssm.po.SysnoticeExample;

public interface SysnoticeService {
	List<Sysnotice> selectByExample(SysnoticeExample example);
	
	public List<Sysnotice> selectByExamplePage(SysnoticeExample example);

	public int countByExample(SysnoticeExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public void add(HttpServletRequest request);
	
	public Sysnotice getSysnoticeById(String id); 
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
}
