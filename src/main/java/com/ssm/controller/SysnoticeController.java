package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.Page;
import com.ssm.po.Sysnotice;
import com.ssm.po.SysnoticeExample;
import com.ssm.service.SysnoticeService;

@Controller  
@RequestMapping("/sysnotice")  
public class SysnoticeController {
	@Autowired
    private SysnoticeService sysnoticeService;  
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String currentpage = request.getParameter("currentpage");
		
		SysnoticeExample example = new SysnoticeExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		if(title!=null&&!title.equals("")){
			example.getOredCriteria().get(0).andTitleLike("%"+title+"%");
		}
		if(content!=null&&!content.equals("")){
			example.getOredCriteria().get(0).andContentLike("%"+content+"%");
		}
		
		int count = sysnoticeService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Sysnotice> list = sysnoticeService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("page", page);
		return "sysnoticelist";
	}
	@RequestMapping(value = "/list2")
	public String list2(HttpServletRequest request, Model model) {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String currentpage = request.getParameter("currentpage");
		
		SysnoticeExample example = new SysnoticeExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		if(title!=null&&!title.equals("")){
			example.getOredCriteria().get(0).andTitleLike("%"+title+"%");
		}
		if(content!=null&&!content.equals("")){
			example.getOredCriteria().get(0).andContentLike("%"+content+"%");
		}
		
		
		int count = sysnoticeService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Sysnotice> list = sysnoticeService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("page", page);
		return "sysnoticelist2";
	}
	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		return "sysnoticeadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		sysnoticeService.add(request);
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Sysnotice Sysnotice = sysnoticeService.getSysnoticeById(id);
		model.addAttribute("o", Sysnotice);
		
		return "sysnoticeupdate";
	}
	

	@RequestMapping(value = "/toUpdate2")
	public String toUpdate2(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Sysnotice Sysnotice = sysnoticeService.getSysnoticeById(id);
		model.addAttribute("o", Sysnotice);
		
		return "sysnoticeupdate2";
	}


	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		sysnoticeService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		sysnoticeService.deleteByPrimaryKey(id);
		return "ok";
	}
}
