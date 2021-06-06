package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.*;
import com.ssm.service.TblsongTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.Page;
import com.ssm.service.TblbookingsongsService;
import com.ssm.service.TblsongService;

@Controller  
@RequestMapping("/tblbookingsongs")  
public class TblbookingsongsController {
	@Autowired
    private TblbookingsongsService tblbookingsongsService;  
	
	@Autowired
    private TblsongService tblsongService;
	@Autowired
	private TblsongTypeService tblsongTypeService;
	
	
	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String colsongname = request.getParameter("colsongname");
		String currentpage = request.getParameter("currentpage");
		
		TblbookingsongsExample example = new TblbookingsongsExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		if(colsongname!=null&&!colsongname.equals("")){
			example.getOredCriteria().get(0).andColsongnameLike("%"+colsongname+"%");
		}
		
		  User user = (User) request.getSession().getAttribute("login_user");
	       if(user!=null){
	    	   example.getOredCriteria().get(0).andCreateuseridEqualTo(user.getId());
	       }
	       
		int count = tblbookingsongsService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Tblbookingsongs> list = tblbookingsongsService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("colsongname", colsongname);
		model.addAttribute("page", page);
		return "tblbookingsongslist";
	}

	@RequestMapping(value = "/list2")
	public String list2(HttpServletRequest request, Model model) {
		String colsongname = request.getParameter("colsongname");
		String currentpage = request.getParameter("currentpage");
		
		TblbookingsongsExample example = new TblbookingsongsExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		if(colsongname!=null&&!colsongname.equals("")){
			example.getOredCriteria().get(0).andColsongnameLike("%"+colsongname+"%");
		}
		
	       
		int count = tblbookingsongsService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<Tblbookingsongs> list = tblbookingsongsService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("colsongname", colsongname);
		model.addAttribute("page", page);
		return "tblbookingsongslist2";
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		
		TblsongExample example = new TblsongExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		List<Tblsong> list = tblsongService.selectByExample(example);
		model.addAttribute("list", list);


		SongTypeExample songTypeExample = new SongTypeExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		List<SongType> songTypelist = tblsongTypeService.selectByExample(songTypeExample);
		
		model.addAttribute("songTypelist", songTypelist);

		return "tblbookingsongsadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {

		return tblbookingsongsService.add(request);
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Tblbookingsongs Tblbookingsongs = tblbookingsongsService.getTblbookingsongsById(id);
		model.addAttribute("o", Tblbookingsongs);
		
		

		TblsongExample example = new TblsongExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		List<Tblsong> list = tblsongService.selectByExample(example);
		
		model.addAttribute("list", list);
		
		
		return "tblbookingsongsupdate";
	}

	@RequestMapping(value = "/toUpdate2")
	public String toUpdate2(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Tblbookingsongs Tblbookingsongs = tblbookingsongsService.getTblbookingsongsById(id);
		model.addAttribute("o", Tblbookingsongs);
		
		

		TblsongExample example = new TblsongExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		List<Tblsong> list = tblsongService.selectByExample(example);
		
		model.addAttribute("list", list);
		
		
		return "tblbookingsongsupdate2";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		tblbookingsongsService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	@ResponseBody
	@RequestMapping(value = "/update2")
	public String update2(HttpServletRequest request, Model model) {
		tblbookingsongsService.updateByPrimaryKeySelective2(request);
		return "ok";
	}
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		tblbookingsongsService.deleteByPrimaryKey(id);
		return "ok";
	}
}
