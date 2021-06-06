package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.SongType;
import com.ssm.po.SongTypeExample;
import com.ssm.service.TblsongTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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


	@RequestMapping(value = "/getListByTypeId",method = RequestMethod.POST , produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getListByTypeId(HttpServletRequest request, Model model) {
		String songTypeId = request.getParameter("songTypeId");

		TblsongExample example = new TblsongExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();


		if(songTypeId!=null&&!songTypeId.equals("")){
			example.getOredCriteria().get(0).andBak1EqualTo(songTypeId);
		}
		List<Tblsong> list = tblsongService.selectByExample(example);

		model.addAttribute("list", list);
		request.getSession().setAttribute("list",list);

		String options="";
		for(Tblsong tblsong:list){
			options+="<option value="+tblsong.getId()+">"+tblsong.getColname()+"</option>";
		}
		if("".equals(options)){
			options+="<option value=''>此类别无数据</option>";
		}
		return options;
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		//查询歌曲类型

		SongTypeExample example = new SongTypeExample();
     	example.setOrderByClause(" createdate desc ");
		List<SongType> list = tblsongTypeService.selectByExample(example);
		model.addAttribute("songTypelist", list);
		return "tblsongadd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {

		return tblsongService.add(request);
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Tblsong Tblsong = tblsongService.getTblsongById(id);
		model.addAttribute("o", Tblsong);

		//类别
		SongTypeExample example = new SongTypeExample();
		example.setOrderByClause(" createdate desc ");
		List<SongType> list = tblsongTypeService.selectByExample(example);

		List<SongType> newList=new ArrayList<>();
		for(SongType data:list){
			if(data.getId().equals(Tblsong.getBak1())){

			}else {
				newList.add(data);
			}
		}
		model.addAttribute("songTypelist", newList);
		
		return "tblsongupdate";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {

		return tblsongService.updateByPrimaryKeySelective(request);
	}
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		tblsongService.deleteByPrimaryKey(id);
		return "ok";
	}
}
