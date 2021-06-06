package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.code.kaptcha.Constants;
import com.ssm.common.MyConstant;
import com.ssm.po.User;
import com.ssm.po.UserExample;
import com.ssm.service.UserService;
import com.ssm.util.MD5Utils;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	 @Autowired
	 private UserService userService;  
	 @RequestMapping(value="/toRegister",method=RequestMethod.GET)
	    public String toRegister(Model model){
	        //model.addAttribute("msg", "你好spring mvc");
	        return "register";
	    }
	 
	 
	 @ResponseBody
	 @RequestMapping(value="/register")
	    public String register(HttpServletRequest request,Model model){
		 String name = request.getParameter("name");
	       String username = request.getParameter("username");
	       String password = request.getParameter("password");
	       
	       String code = request.getParameter("code");
	       
	       String codeSession = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
	       if(codeSession!=null&&!"".equals(codeSession)&&"1".equals(MyConstant.loginCodeFlag)&&!codeSession.equals(code)){
	    		   return "codeerror";
	       }
	       
	       
	       UserExample example = new UserExample();
	   		example.createCriteria();
	   		
	   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
	   		
	   		int count = userService.countByExample(example);
	   		
	   		if(count>0){
	   			return "error";
	   		}
	       
	       userService.register(request);
	    return "ok";
	      
	    }
	 
	 @RequestMapping(value="/toLogin",method=RequestMethod.GET)
	    public String toLogin(HttpServletRequest request,Model model){
		 
		 request.getSession().setAttribute("sysTitle", MyConstant.sysTitle);
		 request.getSession().setAttribute("userTitle1", MyConstant.userTitle1);
		 request.getSession().setAttribute("userTitle2", MyConstant.userTitle2);
		 request.getSession().setAttribute("userTitle7", MyConstant.userTitle7);
		 
		 request.getSession().setAttribute("userTitle8", MyConstant.userTitle8);
		 request.getSession().setAttribute("userTitle9", MyConstant.userTitle9);
		 request.getSession().setAttribute("userTitle10", MyConstant.userTitle10);
		 
		 
		 request.getSession().setAttribute("loginCodeFlag", MyConstant.loginCodeFlag);
		 request.getSession().setAttribute("xssFlag", MyConstant.xssFlag);
		 request.getSession().setAttribute("pwdMd5Flag", MyConstant.pwdMd5Flag);
		 
		 request.getSession().setAttribute("projectName", MyConstant.projectName);
		 
	     return "login";
	    }
	 
	 @ResponseBody
	 @RequestMapping(value="/login")
	    public String login(HttpServletRequest request,Model model){
		 
	       String username = request.getParameter("username");
	       String password = request.getParameter("password");
	       String type = request.getParameter("type");
	       if("1".equals(MyConstant.pwdMd5Flag)){
		    	password = MD5Utils.stringToMD5(password);
		    }
	       String code = request.getParameter("code");
	       
	       String codeSession = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
	       if(codeSession!=null&&!"".equals(codeSession)&&"1".equals(MyConstant.loginCodeFlag)&&!codeSession.equals(code)){
	    		   return "codeerror";
	       }
	       
	       /*************************************************************************
	       User user = (User) request.getSession().getAttribute("login_user");
	       if(user!=null){
	    	   
	       }
	       */
	       
	       User user = userService.selectByUserNameAndPWD(username,password);
	       if(user!=null&&type.equals(user.getType())){
	    	   request.getSession().setAttribute("login_user", user);
	    	   return "ok";
	       }else{
	    	   return "error";
	       }
	       
	    }
	 
	 @ResponseBody
	 @RequestMapping(value="/logout")
	    public String logout(HttpServletRequest request,Model model){
	    	   request.getSession().removeAttribute("login_user");
	    	   return "ok";
	    }
	 
	 @RequestMapping(value="/toIndex")
	    public String toIndex(HttpServletRequest request,Model model){
		 
		 request.getSession().setAttribute("sysTitle", MyConstant.sysTitle);
		 request.getSession().setAttribute("userTitle1", MyConstant.userTitle1);
		 request.getSession().setAttribute("userTitle2", MyConstant.userTitle2);
		 request.getSession().setAttribute("userTitle7", MyConstant.userTitle7);
		 
		 
		 request.getSession().setAttribute("loginCodeFlag", MyConstant.loginCodeFlag);
		 request.getSession().setAttribute("xssFlag", MyConstant.xssFlag);
		 request.getSession().setAttribute("pwdMd5Flag", MyConstant.pwdMd5Flag);
		 
		 request.getSession().setAttribute("projectName", MyConstant.projectName);
		 
		 
	        return "index";
	    }
	 
	 @RequestMapping(value="/toHead")
	    public String toHead(HttpServletRequest request,Model model){
	        return "head";
	    }
	 
	 @RequestMapping(value="/toLeft")
	    public String toLeft(HttpServletRequest request,Model model){
	        return "left";
	    }
	
}
