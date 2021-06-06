package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.Page;
import com.ssm.po.Signlog;
import com.ssm.po.SignlogExample;
import com.ssm.po.User;
import com.ssm.service.SignlogService;

@Controller  
@RequestMapping("/signlog")  
public class SignlogController {
	@Autowired
    private SignlogService signlogService;  
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String createusername = request.getParameter("createusername");
		String currentpage = request.getParameter("currentpage");
		
		SignlogExample example = new SignlogExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		if(createusername!=null&&!createusername.equals("")){
			example.getOredCriteria().get(0).andCreateusernameLike("%"+createusername+"%");
		}
		
		int count = signlogService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Signlog> list = signlogService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("createusername", createusername);
		model.addAttribute("page", page);
		return "signloglist";
	}

	
	

	@RequestMapping(value = "/list2")
	public String list2(HttpServletRequest request, Model model) {
		String createusername = request.getParameter("createusername");
		String currentpage = request.getParameter("currentpage");
		
		SignlogExample example = new SignlogExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		  User user = (User) request.getSession().getAttribute("login_user");
	       if(user!=null){
	    	   example.getOredCriteria().get(0).andCreateuseridEqualTo(user.getId()); 
	       }
	       
		if(createusername!=null&&!createusername.equals("")){
			example.getOredCriteria().get(0).andCreateusernameLike("%"+createusername+"%");
		}
		
		int count = signlogService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Signlog> list = signlogService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("createusername", createusername);
		model.addAttribute("page", page);
		return "signloglist2";
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		return "signlogadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		signlogService.add(request);
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Signlog Signlog = signlogService.getSignlogById(id);
		model.addAttribute("o", Signlog);
		
		return "signlogupdate";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		signlogService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		signlogService.deleteByPrimaryKey(id);
		return "ok";
	}
}
