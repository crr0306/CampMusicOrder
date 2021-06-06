package com.ssm.service.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.LeavemsgMapper;
import com.ssm.po.Leavemsg;
import com.ssm.po.LeavemsgExample;
import com.ssm.po.User;
import com.ssm.service.LeavemsgService;
import com.ssm.util.MyUtil;
@Service 
public class LeavemsgServiceImpl implements LeavemsgService{
	@Autowired
	private LeavemsgMapper leavemsgMapper;
	public List<Leavemsg> selectByExample(LeavemsgExample example) {
		if(example==null){
			example = new LeavemsgExample();
		}
		example.setOrderByClause(" createdate desc ");
		return leavemsgMapper.selectByExample(example);
	}
	public List<Leavemsg> selectByExamplePage(LeavemsgExample example) {
		return leavemsgMapper.selectByExamplePage(example);
	}
	public int countByExample(LeavemsgExample example) {
		return leavemsgMapper.countByExample(example);
	}
	public int deleteByPrimaryKey(String id) {
		return leavemsgMapper.deleteByPrimaryKey(id);
	}
	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String content = request.getParameter("content");
	    String createusername = request.getParameter("createusername");
	    String recontent = request.getParameter("recontent");
	    
	    Leavemsg leavemsg = new Leavemsg();
	    leavemsg.setId(id);
	    
	    leavemsg.setContent(content);
	    leavemsg.setCreateusername(createusername);
	    leavemsg.setRecontent(recontent);
	    
	    leavemsgMapper.insertSelective(leavemsg);
		
	}
	public void add3(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String content = request.getParameter("content");
	    String createusername = request.getParameter("createusername");
	    String recontent = request.getParameter("recontent");
	    
	    Leavemsg leavemsg = new Leavemsg();
	    leavemsg.setId(id);
	    
	    leavemsg.setContent(content);
	    leavemsg.setCreateusername(createusername);
	    leavemsg.setRecontent(recontent);
	    
	    User user = (User) request.getSession().getAttribute("login_user");
	       if(user!=null){
	    	   leavemsg.setCreateuserid(user.getId());
	    	   leavemsg.setCreateusername(user.getName());
	       }
	    
	    leavemsgMapper.insertSelective(leavemsg);
		
	}
	public Leavemsg getLeavemsgById(String id) {
		return leavemsgMapper.selectByPrimaryKey(id);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String recontent = request.getParameter("recontent");
	    
	    Leavemsg leavemsg = new Leavemsg();
	    leavemsg.setId(id);
	    
	    leavemsg.setRecontent(recontent);
	    
	    User user = (User) request.getSession().getAttribute("login_user");
       if(user!=null){
    	   leavemsg.setReuserid(user.getId());
    	   leavemsg.setReusername(user.getName());
    	   
       }
       leavemsg.setRecreatedate(new Date());
       
	    
	    leavemsgMapper.updateByPrimaryKeySelective(leavemsg);
	}
	
	public void updateByPrimaryKeySelective3(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String content = request.getParameter("content");
	    String createusername = request.getParameter("createusername");
	    String recontent = request.getParameter("recontent");
	    
	    Leavemsg leavemsg = new Leavemsg();
	    leavemsg.setId(id);
	    
	    leavemsg.setContent(content);
	    leavemsg.setCreateusername(createusername);
	    leavemsg.setRecontent(recontent);
	    
	    User user = (User) request.getSession().getAttribute("login_user");
	       if(user!=null){
	    	   leavemsg.setCreateuserid(user.getId());
	    	   leavemsg.setCreateusername(user.getName());
	       }
	       
	    
	    leavemsgMapper.updateByPrimaryKeySelective(leavemsg);
	}

}
