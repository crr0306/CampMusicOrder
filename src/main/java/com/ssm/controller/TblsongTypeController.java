package com.ssm.controller;

import com.ssm.common.Page;
import com.ssm.po.SongType;
import com.ssm.po.SongTypeExample;
import com.ssm.po.Tblsong;
import com.ssm.po.TblsongExample;
import com.ssm.service.TblsongService;
import com.ssm.service.TblsongTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller  
@RequestMapping("/tblsongType")
public class TblsongTypeController {
	@Autowired
		private TblsongTypeService tblsongTypeService;
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String colname = request.getParameter("colname");
		String currentpage = request.getParameter("currentpage");
		
		SongTypeExample example = new SongTypeExample();
//		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		if(colname!=null&&!colname.equals("")){
			example.getOredCriteria().get(0).andColnameLike("%"+colname+"%");
		}
		
		int count = tblsongTypeService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<SongType> list = tblsongTypeService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("colname", colname);
		model.addAttribute("page", page);
		return "tblsonglist";
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		return "tblsongtypeadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		tblsongTypeService.add(request);
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		SongType songType = tblsongTypeService.getTblsongTypeById(id);
		model.addAttribute("o", songType);
		
		return "tblsongupdate";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		tblsongTypeService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		tblsongTypeService.deleteByPrimaryKey(id);
		return "ok";
	}
}
