package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.Page;
import com.ssm.po.Usersalary;
import com.ssm.po.UsersalaryExample;
import com.ssm.service.UsersalaryService;

@Controller  
@RequestMapping("/usersalary")  
public class UsersalaryController {
	@Autowired
    private UsersalaryService usersalaryService;  
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		String currentpage = request.getParameter("currentpage");
		
		UsersalaryExample example = new UsersalaryExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		if(username!=null&&!username.equals("")){
			example.getOredCriteria().get(0).andUsernameLike("%"+username+"%");
		}
		
		int count = usersalaryService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Usersalary> list = usersalaryService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("username", username);
		model.addAttribute("page", page);
		return "usersalarylist";
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		return "usersalaryadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		usersalaryService.add(request);
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Usersalary Usersalary = usersalaryService.getUsersalaryById(id);
		model.addAttribute("o", Usersalary);
		
		return "usersalaryupdate";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		usersalaryService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		usersalaryService.deleteByPrimaryKey(id);
		return "ok";
	}
}
