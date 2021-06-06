package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.SongType;
import com.ssm.po.SongTypeExample;
import com.ssm.service.TblsongTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.Page;
import com.ssm.po.Tblsong;
import com.ssm.po.TblsongExample;
import com.ssm.service.TblsongService;

@Controller  
@RequestMapping("/tblsong")  
public class TblsongController {
	@Autowired
    private TblsongService tblsongService;
	@Autowired
	private TblsongTypeService tblsongTypeService;
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String colname = request.getParameter("colname");
		String currentpage = request.getParameter("currentpage");

		TblsongExample example = new TblsongExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		if(colname!=null&&!colname.equals("")){
			example.getOredCriteria().get(0).andColnameLike("%"+colname+"%");
		}
		
		int count = tblsongService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Tblsong> list = tblsongService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("colname", colname);
		model.addAttribute("page", page);
		return "tblsonglist";
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		//查询歌曲类型

		SongTypeExample example = new SongTypeExample();
     	example.setOrderByClause(" createdate desc ");
		int count = tblsongTypeService.countByExample(example);
		Page page = new Page(count, "");
		example.setPageStart(page.getStart());
		example.setPageSize(count);
		List<SongType> list = tblsongTypeService.selectByExamplePage(example);
		model.addAttribute("songTypelist", list);
		return "tblsongadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		tblsongService.add(request);
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Tblsong Tblsong = tblsongService.getTblsongById(id);
		model.addAttribute("o", Tblsong);
		
		return "tblsongupdate";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		tblsongService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		tblsongService.deleteByPrimaryKey(id);
		return "ok";
	}
}
