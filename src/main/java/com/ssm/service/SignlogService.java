package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.Signlog;
import com.ssm.po.SignlogExample;

public interface SignlogService {
	List<Signlog> selectByExample(SignlogExample example);
	
	public List<Signlog> selectByExamplePage(SignlogExample example);

	public int countByExample(SignlogExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public void add(HttpServletRequest request);
	
	public Signlog getSignlogById(String id); 
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
}
