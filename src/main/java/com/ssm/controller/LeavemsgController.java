package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.Page;
import com.ssm.po.Leavemsg;
import com.ssm.po.LeavemsgExample;
import com.ssm.po.User;
import com.ssm.service.LeavemsgService;

@Controller
@RequestMapping("/leavemsg")
public class LeavemsgController {
	@Autowired
	private LeavemsgService leavemsgService;

	@RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String content = request.getParameter("content");
		String currentpage = request.getParameter("currentpage");

		LeavemsgExample example = new LeavemsgExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();

		if (content != null && !content.equals("")) {
			example.getOredCriteria().get(0).andContentLike("%" + content + "%");
		}

		int count = leavemsgService.countByExample(example);

		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());

		List<Leavemsg> list = leavemsgService.selectByExamplePage(example);

		model.addAttribute("list", list);
		model.addAttribute("content", content);
		model.addAttribute("page", page);
		return "leavemsglist";
	}

	@RequestMapping(value = "/list2")
	public String list2(HttpServletRequest request, Model model) {
		String content = request.getParameter("content");
		String currentpage = request.getParameter("currentpage");

		LeavemsgExample example = new LeavemsgExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();

		if (content != null && !content.equals("")) {
			example.getOredCriteria().get(0).andContentLike("%" + content + "%");
		}

		int count = leavemsgService.countByExample(example);

		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());

		List<Leavemsg> list = leavemsgService.selectByExamplePage(example);

		model.addAttribute("list", list);
		model.addAttribute("content", content);
		model.addAttribute("page", page);
		return "leavemsglist2";
	}

	@RequestMapping(value = "/list3")
	public String list3(HttpServletRequest request, Model model) {
		String content = request.getParameter("content");
		String currentpage = request.getParameter("currentpage");

		LeavemsgExample example = new LeavemsgExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();

		if (content != null && !content.equals("")) {
			example.getOredCriteria().get(0).andContentLike("%" + content + "%");
		}

		User user = (User) request.getSession().getAttribute("login_user");
		if (user != null) {
			example.getOredCriteria().get(0).andCreateuseridEqualTo(user.getId());
		}

		int count = leavemsgService.countByExample(example);

		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());

		List<Leavemsg> list = leavemsgService.selectByExamplePage(example);

		model.addAttribute("list", list);
		model.addAttribute("content", content);
		model.addAttribute("page", page);
		return "leavemsglist3";
	}

	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		return "leavemsgadd";
	}
	
	@RequestMapping(value = "/toAdd3")
	public String toAdd3(HttpServletRequest request, Model model) {
		return "leavemsgadd3";
	}


	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		leavemsgService.add(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add3")
	public String add3(HttpServletRequest request, Model model) {
		leavemsgService.add3(request);
		return "ok";
	}

	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Leavemsg Leavemsg = leavemsgService.getLeavemsgById(id);
		model.addAttribute("o", Leavemsg);

		return "leavemsgupdate";
	}
	
	
	@RequestMapping(value = "/toUpdate2")
	public String toUpdate2(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Leavemsg Leavemsg = leavemsgService.getLeavemsgById(id);
		model.addAttribute("o", Leavemsg);

		return "leavemsgupdate2";
	}
	
	@RequestMapping(value = "/toUpdate3")
	public String toUpdate3(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		Leavemsg Leavemsg = leavemsgService.getLeavemsgById(id);
		model.addAttribute("o", Leavemsg);

		return "leavemsgupdate3";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		leavemsgService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping(value = "/update3")
	public String update3(HttpServletRequest request, Model model) {
		leavemsgService.updateByPrimaryKeySelective3(request);
		return "ok";
	}

	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		leavemsgService.deleteByPrimaryKey(id);
		return "ok";
	}
}
