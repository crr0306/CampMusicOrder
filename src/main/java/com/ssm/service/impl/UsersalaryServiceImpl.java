package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UsersalaryMapper;
import com.ssm.po.Usersalary;
import com.ssm.po.UsersalaryExample;
import com.ssm.service.UsersalaryService;
import com.ssm.util.MyUtil;
@Service 
public class UsersalaryServiceImpl implements UsersalaryService{
	@Autowired
	private UsersalaryMapper usersalaryMapper;
	public List<Usersalary> selectByExample(UsersalaryExample example) {
		if(example==null){
			example = new UsersalaryExample();
		}
		return usersalaryMapper.selectByExample(example);
	}
	public List<Usersalary> selectByExamplePage(UsersalaryExample example) {
		return usersalaryMapper.selectByExamplePage(example);
	}
	public int countByExample(UsersalaryExample example) {
		return usersalaryMapper.countByExample(example);
	}
	public int deleteByPrimaryKey(String id) {
		return usersalaryMapper.deleteByPrimaryKey(id);
	}
	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String username = request.getParameter("username");
	    String salary1 = request.getParameter("salary1");
	    
	    Usersalary usersalary = new Usersalary();
	    usersalary.setId(id);
	    
	    usersalary.setUsername(username);
	    usersalary.setSalary1(salary1);
	    
	    usersalaryMapper.insertSelective(usersalary);
		
	}
	public Usersalary getUsersalaryById(String id) {
		return usersalaryMapper.selectByPrimaryKey(id);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String username = request.getParameter("username");
	    String salary1 = request.getParameter("salary1");
	    
	    Usersalary usersalary = new Usersalary();
	    usersalary.setId(id);
	    
	    usersalary.setUsername(username);
	    usersalary.setSalary1(salary1);
	    
	    usersalaryMapper.updateByPrimaryKeySelective(usersalary);
	}

}
