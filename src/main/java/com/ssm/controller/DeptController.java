package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.Page;
import com.ssm.po.Dept;
import com.ssm.po.DeptExample;
import com.ssm.service.DeptService;

@Controller  
@RequestMapping("/dept")  
public class DeptController {
	@Autowired
    private DeptService deptService;  
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String currentpage = request.getParameter("currentpage");
		
		DeptExample example = new DeptExample();
		example.createCriteria();
		
		if(name!=null&&!name.equals("")){
			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
		}
		
		int count = deptService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Dept> list = deptService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("name", name);
		model.addAttribute("page", page);
		return "deptlist";
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		return "deptadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		deptService.add(request);
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Dept Dept = deptService.getDeptById(id);
		model.addAttribute("o", Dept);
		
		return "deptupdate";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		deptService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		deptService.deleteByPrimaryKey(id);
		return "ok";
	}
}
