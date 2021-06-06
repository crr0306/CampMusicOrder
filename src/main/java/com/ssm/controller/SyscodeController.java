package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.Page;
import com.ssm.po.Syscode;
import com.ssm.po.SyscodeExample;
import com.ssm.service.SyscodeService;

@Controller  
@RequestMapping("/syscode")  
public class SyscodeController {
	@Autowired
    private SyscodeService syscodeService;  
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String currentpage = request.getParameter("currentpage");
		
		SyscodeExample example = new SyscodeExample();
		example.setOrderByClause(" type asc,`sort_` asc ");
		example.createCriteria();
		
		if(name!=null&&!name.equals("")){
			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
		}
		
		int count = syscodeService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Syscode> list = syscodeService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("name", name);
		model.addAttribute("page", page);
		return "syscodelist";
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		return "syscodeadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		syscodeService.add(request);
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Syscode Syscode = syscodeService.getSyscodeById(id);
		model.addAttribute("o", Syscode);
		
		return "syscodeupdate";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		syscodeService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		syscodeService.deleteByPrimaryKey(id);
		return "ok";
	}
}
