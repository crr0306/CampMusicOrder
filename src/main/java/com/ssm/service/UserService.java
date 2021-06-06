package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.User;
import com.ssm.po.UserExample;






public interface UserService {
	
	List<User> selectByExample(UserExample example);
	
	
	public int deleteByPrimaryKey(String id);
	 
	public void add(HttpServletRequest request);
	
	public void add7(HttpServletRequest request);
	
	public void add8(HttpServletRequest request);
	public void add9(HttpServletRequest request);
	public void add10(HttpServletRequest request);
	
	public void add2(HttpServletRequest request);
	
	public List<User> selectByExamplePage(UserExample example);

	public int countByExample(UserExample example);
	 
	public User getUserById(String id); 
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
	public void updateByPrimaryKeySelective7(HttpServletRequest request);
	
	public void updateByPrimaryKeySelective8(HttpServletRequest request);
	public void updateByPrimaryKeySelective9(HttpServletRequest request);
	public void updateByPrimaryKeySelective10(HttpServletRequest request);
	
	public void updateByPrimaryKeySelective2(HttpServletRequest request);
	
	public void updateByPrimaryKeySelective3(HttpServletRequest request);
	
	public void updateByPrimaryKeySelective5(HttpServletRequest request);
	
	public void updateByDetail(HttpServletRequest request);
	
	public User selectByUserNameAndPWD(String username,String password);
	
	public String updatepwd(HttpServletRequest request);
	
	public void register(HttpServletRequest request);
	
	public void resetPwd(HttpServletRequest request);
}
