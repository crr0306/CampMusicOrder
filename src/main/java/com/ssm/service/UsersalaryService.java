package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.Usersalary;
import com.ssm.po.UsersalaryExample;

public interface UsersalaryService {
	List<Usersalary> selectByExample(UsersalaryExample example);
	
	public List<Usersalary> selectByExamplePage(UsersalaryExample example);

	public int countByExample(UsersalaryExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public void add(HttpServletRequest request);
	
	public Usersalary getUsersalaryById(String id); 
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
}
