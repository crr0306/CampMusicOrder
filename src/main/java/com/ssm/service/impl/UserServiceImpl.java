package com.ssm.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ssm.common.MyConstant;
import com.ssm.mapper.DeptMapper;
import com.ssm.mapper.UserMapper;
import com.ssm.mapper.UsersalaryMapper;
import com.ssm.po.Dept;
import com.ssm.po.User;
import com.ssm.po.UserExample;
import com.ssm.po.Usersalary;
import com.ssm.po.UsersalaryExample;
import com.ssm.service.UserService;
import com.ssm.util.MD5Utils;
import com.ssm.util.MyUtil;

@Service 
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DeptMapper deptMapper;
	@Autowired
	private UsersalaryMapper usersalaryMapper;
	
	public User getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	public User selectByUserNameAndPWD(String username,String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return userMapper.selectByUserNameAndPWD(user);
	}
	
	public int countByExample(UserExample example) {
		return userMapper.countByExample(example);
	}
	
	public List<User> selectByExamplePage(UserExample example) {
		return userMapper.selectByExamplePage(example);
	}

	public void add(HttpServletRequest request) {
	    String id = MyUtil.getUUID();
	    String username = request.getParameter("username");
	    //String password = request.getParameter("password");
	    String password = "1";
	    if("1".equals(MyConstant.pwdMd5Flag)){
	    	password = MD5Utils.stringToMD5(password);
	    }
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    String job = request.getParameter("job");
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("1");
		user.setJob(job);
		
		
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		userMapper.insertSelective(user);
	}
	public void add7(HttpServletRequest request) {
	    String id = MyUtil.getUUID();
	    String username = request.getParameter("username");
	    //String password = request.getParameter("password");
	    String password = "1";
	    if("1".equals(MyConstant.pwdMd5Flag)){
	    	password = MD5Utils.stringToMD5(password);
	    }
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    String job = request.getParameter("job");
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("7");
		user.setJob(job);
		
		
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		userMapper.insertSelective(user);
	}
	public void add8(HttpServletRequest request) {
	    String id = MyUtil.getUUID();
	    String username = request.getParameter("username");
	    //String password = request.getParameter("password");
	    String password = "1";
	    if("1".equals(MyConstant.pwdMd5Flag)){
	    	password = MD5Utils.stringToMD5(password);
	    }
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    String job = request.getParameter("job");
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("8");
		user.setJob(job);
		
		
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		userMapper.insertSelective(user);
	}
	public void add9(HttpServletRequest request) {
	    String id = MyUtil.getUUID();
	    String username = request.getParameter("username");
	    //String password = request.getParameter("password");
	    String password = "1";
	    if("1".equals(MyConstant.pwdMd5Flag)){
	    	password = MD5Utils.stringToMD5(password);
	    }
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    String job = request.getParameter("job");
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("9");
		user.setJob(job);
		
		
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		userMapper.insertSelective(user);
	}
	public void add10(HttpServletRequest request) {
	    String id = MyUtil.getUUID();
	    String username = request.getParameter("username");
	    //String password = request.getParameter("password");
	    String password = "1";
	    if("1".equals(MyConstant.pwdMd5Flag)){
	    	password = MD5Utils.stringToMD5(password);
	    }
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    String job = request.getParameter("job");
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("10");
		user.setJob(job);
		
		
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		userMapper.insertSelective(user);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String username = request.getParameter("username");
	    //String password = request.getParameter("password");
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    String job = request.getParameter("job");
	    User user = new User();
	    user.setId(id);
		user.setUsername(username);
		//user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("1");
		user.setJob(job);
		
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		userMapper.updateByPrimaryKeySelective(user);
	    
	}
public void updateByPrimaryKeySelective7(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String username = request.getParameter("username");
	    //String password = request.getParameter("password");
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    String job = request.getParameter("job");
	    User user = new User();
	    user.setId(id);
		user.setUsername(username);
		//user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("7");
		user.setJob(job);
		
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		userMapper.updateByPrimaryKeySelective(user);
	    
	}
	
public void updateByPrimaryKeySelective8(HttpServletRequest request) {
	
	String id = request.getParameter("id");
	String username = request.getParameter("username");
    //String password = request.getParameter("password");
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String sex = request.getParameter("sex");
    String age = request.getParameter("age");
    String job = request.getParameter("job");
    User user = new User();
    user.setId(id);
	user.setUsername(username);
	//user.setPassword(password);
	user.setName(name);
	user.setPhone(phone);
	user.setSex(sex);
	user.setAge(age);
	user.setType("8");
	user.setJob(job);
	
	String pic = request.getParameter("pic");
	user.setPic(pic);
	
	userMapper.updateByPrimaryKeySelective(user);
    
}
public void updateByPrimaryKeySelective9(HttpServletRequest request) {
	
	String id = request.getParameter("id");
	String username = request.getParameter("username");
    //String password = request.getParameter("password");
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String sex = request.getParameter("sex");
    String age = request.getParameter("age");
    String job = request.getParameter("job");
    User user = new User();
    user.setId(id);
	user.setUsername(username);
	//user.setPassword(password);
	user.setName(name);
	user.setPhone(phone);
	user.setSex(sex);
	user.setAge(age);
	user.setType("9");
	user.setJob(job);
	
	String pic = request.getParameter("pic");
	user.setPic(pic);
	
	userMapper.updateByPrimaryKeySelective(user);
    
}
public void updateByPrimaryKeySelective10(HttpServletRequest request) {
	
	String id = request.getParameter("id");
	String username = request.getParameter("username");
    //String password = request.getParameter("password");
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String sex = request.getParameter("sex");
    String age = request.getParameter("age");
    String job = request.getParameter("job");
    User user = new User();
    user.setId(id);
	user.setUsername(username);
	//user.setPassword(password);
	user.setName(name);
	user.setPhone(phone);
	user.setSex(sex);
	user.setAge(age);
	user.setType("10");
	user.setJob(job);
	
	String pic = request.getParameter("pic");
	user.setPic(pic);
	
	userMapper.updateByPrimaryKeySelective(user);
    
}
	public void add2(HttpServletRequest request) {
	    String id = MyUtil.getUUID();
	    String username = request.getParameter("username");
	    //String password = request.getParameter("password");
	    String password = "1";
	    if("1".equals(MyConstant.pwdMd5Flag)){
	    	password = MD5Utils.stringToMD5(password);
	    }
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("2");
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		
		
		
		
		
		String deptid = request.getParameter("deptid");
		user.setDeptid(deptid);
		Dept Dept = deptMapper.selectByPrimaryKey(deptid);
		user.setDeptname(Dept!=null?Dept.getName():"" );
		String job = request.getParameter("job");
		user.setJob(job);
		String salary = request.getParameter("salary");
		user.setSalary(salary);
		String type2 = request.getParameter("type2");
		user.setType2(type2);
		
		
		
		
		
		
		userMapper.insertSelective(user);
	}

	public void updateByPrimaryKeySelective2(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String username = request.getParameter("username");
	   // String password = request.getParameter("password");
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    User user = new User();
	    user.setId(id);
		user.setUsername(username);
		//user.setPassword(password);
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		user.setType("2");
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		
		
		
		
		
		String deptid = request.getParameter("deptid");
		user.setDeptid(deptid);
		Dept Dept = deptMapper.selectByPrimaryKey(deptid);
		user.setDeptname(Dept!=null?Dept.getName():"" );
		String job = request.getParameter("job");
		user.setJob(job);
		String salary = request.getParameter("salary");
		user.setSalary(salary);
		String type2 = request.getParameter("type2");
		user.setType2(type2);
		
		
		
		
		
		userMapper.updateByPrimaryKeySelective(user);
	    
	}
	
	
public void updateByPrimaryKeySelective3(HttpServletRequest request) {
	
	String id = request.getParameter("id");
	String info = request.getParameter("info");
	User user = userMapper.selectByPrimaryKey(id);
	
	UsersalaryExample example = new UsersalaryExample();
	example.createCriteria();
	example.getOredCriteria().get(0).andUseridEqualTo(user.getId());
	usersalaryMapper.deleteByExample(example);
	
	JSONArray infoArr = JSONArray.parseArray(info.toString());
	if (infoArr != null && infoArr.size() > 0) {
		for (int i = 0; i < infoArr.size(); i++) {
			JSONObject infoData = (JSONObject) infoArr.get(i);
			String salarymonth = (String) infoData.get("salarymonth");
			String salary1 = (String) infoData.get("salary1");
			String salary2 = (String) infoData.get("salary2");
			String salary3 = (String) infoData.get("salary3");
			
			String id2 = MyUtil.getUUID();
		    
			 Usersalary usersalary = new Usersalary();
			 usersalary.setId(id2);
		    
			 usersalary.setUserid(user.getId());
			 usersalary.setUsername(user.getName());
		    
			 usersalary.setSalarymonth(salarymonth);
			 usersalary.setSalary1(salary1);
			 usersalary.setSalary2(salary2);
			 usersalary.setSalary3(salary3);
			 
		    usersalary.setSort(i+1);
			
			/*if (electricitydate != null && !"".equals(electricitydate)) {
				try {
					electricitypayment.setElectricitydate(new SimpleDateFormat("yyyy-MM-dd").parse(electricitydate));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}*/
			
		    usersalaryMapper.insertSelective(usersalary);
			
		}

	}
	    
	}

	
	public int deleteByPrimaryKey(String id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	public void updateByDetail(HttpServletRequest request) {
		String id = (String) request.getSession().getAttribute("userid");
	    String phone = request.getParameter("phone");
	    User user = new User();
		user.setId(id);
		user.setPhone(phone);
		userMapper.updateByPrimaryKeySelective(user);
	}

	public String updatepwd(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("login_user");
		String flag = "";
		String oldpwd = request.getParameter("oldpwd");
		if("1".equals(MyConstant.pwdMd5Flag)){
			oldpwd = MD5Utils.stringToMD5(oldpwd);
	    }
		String newpwd = request.getParameter("newpwd");
		if("1".equals(MyConstant.pwdMd5Flag)){
			newpwd = MD5Utils.stringToMD5(newpwd);
	    }
		if(!user.getPassword().equals(oldpwd)){
			flag = "error";
		}else{
			User newUser = new User();
			newUser.setId(user.getId());
			newUser.setPassword(newpwd);
			userMapper.updateByPrimaryKeySelective(newUser);
			flag = "ok";
			
			user.setPassword(newpwd);
			
		}
		request.getSession().setAttribute("login_user",user);
		return flag;
		
	}



	public void register(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String name = request.getParameter("name");
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    
	    if("1".equals(MyConstant.pwdMd5Flag)){
	    	password = MD5Utils.stringToMD5(password);
	    }
	    
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    
	    User user = new User();
	    user.setId(id);
	    
	    user.setName(name);
	    user.setUsername(username);
	    user.setPassword(password);
	    user.setPhone(phone);
	    user.setSex(sex);
	    user.setAge(age);
	    user.setType("1");
	   // user.setIntegral(10000);
	    userMapper.insertSelective(user);
	}

	
	
	public void updateByPrimaryKeySelective5(HttpServletRequest request) {
		
	    String name = request.getParameter("name");
	    String phone = request.getParameter("phone");
	    String sex = request.getParameter("sex");
	    String age = request.getParameter("age");
	    User user = new User();
	   
		user.setName(name);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAge(age);
		String pic = request.getParameter("pic");
		user.setPic(pic);
		
		
		
		
		
		
	/*	String deptid = request.getParameter("deptid");
		user.setDeptid(deptid);
		Dept Dept = deptMapper.selectByPrimaryKey(deptid);
		user.setDeptname(Dept!=null?Dept.getName():"" );
		String job = request.getParameter("job");
		user.setJob(job);
		String salary = request.getParameter("salary");
		user.setSalary(salary);
		String type2 = request.getParameter("type2");
		user.setType2(type2);*/
		
		
		
		 User user2 = (User) request.getSession().getAttribute("login_user");
	       if(user2!=null){
	    	   user.setId(user2.getId());
	       }
		
		userMapper.updateByPrimaryKeySelective(user);
	    
	}
	
	public List<User> selectByExample(UserExample example) {
		return userMapper.selectByExample(example);
	}

	public void resetPwd(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = "1";
	    if("1".equals(MyConstant.pwdMd5Flag)){
	    	password = MD5Utils.stringToMD5(password);
	    }
	    User user = new User();
	    user.setId(id);
	    user.setPassword(password);
		userMapper.updateByPrimaryKeySelective(user);
		
	}

}
