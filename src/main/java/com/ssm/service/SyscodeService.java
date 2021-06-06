package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.Syscode;
import com.ssm.po.SyscodeExample;

public interface SyscodeService {
	
	List<Syscode> selectByType(String type);
	
	List<Syscode> selectByExample(SyscodeExample example);
	
	public List<Syscode> selectByExamplePage(SyscodeExample example);

	public int countByExample(SyscodeExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public void add(HttpServletRequest request);
	
	public Syscode getSyscodeById(String id); 
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
}
