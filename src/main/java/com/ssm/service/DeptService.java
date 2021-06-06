package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.Dept;
import com.ssm.po.DeptExample;

public interface DeptService {
	List<Dept> selectByExample(DeptExample example);
	
	public List<Dept> selectByExamplePage(DeptExample example);

	public int countByExample(DeptExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public void add(HttpServletRequest request);
	
	public Dept getDeptById(String id); 
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
}
