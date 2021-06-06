package com.ssm.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.SignlogMapper;
import com.ssm.po.Signlog;
import com.ssm.po.SignlogExample;
import com.ssm.po.User;
import com.ssm.service.SignlogService;
import com.ssm.util.MyUtil;
@Service 
public class SignlogServiceImpl implements SignlogService{
	@Autowired
	private SignlogMapper signlogMapper;
	public List<Signlog> selectByExample(SignlogExample example) {
		if(example==null){
			example = new SignlogExample();
		}
		example.setOrderByClause(" createdate desc ");
		return signlogMapper.selectByExample(example);
	}
	public List<Signlog> selectByExamplePage(SignlogExample example) {
		return signlogMapper.selectByExamplePage(example);
	}
	public int countByExample(SignlogExample example) {
		return signlogMapper.countByExample(example);
	}
	public int deleteByPrimaryKey(String id) {
		return signlogMapper.deleteByPrimaryKey(id);
	}
	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    
	    Signlog signlog = new Signlog();
	    signlog.setId(id);
	    
	    
	    
	    User user = (User) request.getSession().getAttribute("login_user");
       if(user!=null){
    	   signlog.setCreateuserid(user.getId());
	    	signlog.setCreateusername(user.getName());
	    	signlog.setType(request.getParameter("type"));
	    	
	    	
	    	
	    	 SimpleDateFormat format = new SimpleDateFormat("HH:mm");
	         Date ten9 = null;
	         Date ten12 = null;
	         Date ten18 = null;
	         Date now = null;
	         try {
	             ten9 = format.parse("09:00");
	             ten12 = format.parse("12:00");
	             ten18 = format.parse("18:00");
	             now = new Date();
	         } catch (ParseException e) {
	             e.printStackTrace();
	         }
	         if(ten9.before(now)){
	        	 signlog.setType2("0");
	         } else if(ten12.before(now)){
	        	 signlog.setType2("1");
	         }else if(ten18.before(now)){
	        	 signlog.setType2("2");
	         }else{
	        	 signlog.setType2("0");
	         }
	         
	    	
	   	    signlogMapper.insertSelective(signlog);
       }
	    
		
	}
	public Signlog getSignlogById(String id) {
		return signlogMapper.selectByPrimaryKey(id);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String createusername = request.getParameter("createusername");
	    
	    Signlog signlog = new Signlog();
	    signlog.setId(id);
	    
	    signlog.setCreateusername(createusername);
	    
	    signlogMapper.updateByPrimaryKeySelective(signlog);
	}

}
