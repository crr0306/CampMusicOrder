package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.MyConstant;
import com.ssm.common.Page;
import com.ssm.po.Dept;
import com.ssm.po.DeptExample;
import com.ssm.po.User;
import com.ssm.po.UserExample;
import com.ssm.po.Usersalary;
import com.ssm.po.UsersalaryExample;
import com.ssm.service.DeptService;
import com.ssm.service.UserService;
import com.ssm.service.UsersalaryService;


@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Autowired
    private UserService userService;  
    @Autowired
    private DeptService deptService;  
    @Autowired
    private UsersalaryService usersalaryService;  
    
    @RequestMapping(value = "/list")
	public String list(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String currentpage = request.getParameter("currentpage");
		
		UserExample example = new UserExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		example.getOredCriteria().get(0).andTypeEqualTo("1");
		
		if(name!=null&&!name.equals("")){
			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
		}
		int count = userService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<User> list = userService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("name", name);
		model.addAttribute("page", page);
		
		
		return "userlist";
	}

    @RequestMapping(value = "/list7")
   	public String list7(HttpServletRequest request, Model model) {
   		String name = request.getParameter("name");
   		String currentpage = request.getParameter("currentpage");
   		
   		UserExample example = new UserExample();
   		example.setOrderByClause(" createdate desc ");
   		example.createCriteria();
   		
   		example.getOredCriteria().get(0).andTypeEqualTo("7");
   		
   		if(name!=null&&!name.equals("")){
   			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
   		}
   		int count = userService.countByExample(example);
   		
   		Page page = new Page(count, currentpage);
   		example.setPageStart(page.getStart());
   		example.setPageSize(page.getSize());
   		
   		List<User> list = userService.selectByExamplePage(example);
   		
   		model.addAttribute("list", list);
   		model.addAttribute("name", name);
   		model.addAttribute("page", page);
   		
   		
   		return "userlist7";
   	}
    

    @RequestMapping(value = "/list8")
   	public String list8(HttpServletRequest request, Model model) {
   		String name = request.getParameter("name");
   		String currentpage = request.getParameter("currentpage");
   		
   		UserExample example = new UserExample();
   		example.setOrderByClause(" createdate desc ");
   		example.createCriteria();
   		
   		example.getOredCriteria().get(0).andTypeEqualTo("8");
   		
   		if(name!=null&&!name.equals("")){
   			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
   		}
   		int count = userService.countByExample(example);
   		
   		Page page = new Page(count, currentpage);
   		example.setPageStart(page.getStart());
   		example.setPageSize(page.getSize());
   		
   		List<User> list = userService.selectByExamplePage(example);
   		
   		model.addAttribute("list", list);
   		model.addAttribute("name", name);
   		model.addAttribute("page", page);
   		
   		
   		return "userlist8";
   	}

    @RequestMapping(value = "/list9")
   	public String list9(HttpServletRequest request, Model model) {
   		String name = request.getParameter("name");
   		String currentpage = request.getParameter("currentpage");
   		
   		UserExample example = new UserExample();
   		example.setOrderByClause(" createdate desc ");
   		example.createCriteria();
   		
   		example.getOredCriteria().get(0).andTypeEqualTo("9");
   		
   		if(name!=null&&!name.equals("")){
   			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
   		}
   		int count = userService.countByExample(example);
   		
   		Page page = new Page(count, currentpage);
   		example.setPageStart(page.getStart());
   		example.setPageSize(page.getSize());
   		
   		List<User> list = userService.selectByExamplePage(example);
   		
   		model.addAttribute("list", list);
   		model.addAttribute("name", name);
   		model.addAttribute("page", page);
   		
   		
   		return "userlist9";
   	}
    

    @RequestMapping(value = "/list10")
   	public String list10(HttpServletRequest request, Model model) {
   		String name = request.getParameter("name");
   		String currentpage = request.getParameter("currentpage");
   		
   		UserExample example = new UserExample();
   		example.setOrderByClause(" createdate desc ");
   		example.createCriteria();
   		
   		example.getOredCriteria().get(0).andTypeEqualTo("10");
   		
   		if(name!=null&&!name.equals("")){
   			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
   		}
   		int count = userService.countByExample(example);
   		
   		Page page = new Page(count, currentpage);
   		example.setPageStart(page.getStart());
   		example.setPageSize(page.getSize());
   		
   		List<User> list = userService.selectByExamplePage(example);
   		
   		model.addAttribute("list", list);
   		model.addAttribute("name", name);
   		model.addAttribute("page", page);
   		
   		
   		return "userlist10";
   	}
    
    @RequestMapping(value = "/list2")
   	public String list2(HttpServletRequest request, Model model) {
   		String name = request.getParameter("name");
   		String currentpage = request.getParameter("currentpage");
   		
   		UserExample example = new UserExample();
   		example.setOrderByClause(" createdate desc ");
   		example.createCriteria();
   		
   		example.getOredCriteria().get(0).andTypeEqualTo("2");
   		
   		if(name!=null&&!name.equals("")){
   			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
   		}
   		int count = userService.countByExample(example);
   		
   		Page page = new Page(count, currentpage);
   		example.setPageStart(page.getStart());
   		example.setPageSize(page.getSize());
   		
   		List<User> list = userService.selectByExamplePage(example);
   		
   		model.addAttribute("list", list);
   		model.addAttribute("name", name);
   		model.addAttribute("page", page);
   		
   		
   		
   		
   		return "userlist2";
   	}
    
    @RequestMapping(value = "/list3")
	public String list3(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String currentpage = request.getParameter("currentpage");
		
		UserExample example = new UserExample();
		example.setOrderByClause(" createdate desc ");
		example.createCriteria();
		
		example.getOredCriteria().get(0).andTypeEqualTo("2");
		
		if(name!=null&&!name.equals("")){
			example.getOredCriteria().get(0).andNameLike("%"+name+"%");
		}
		int count = userService.countByExample(example);
		
		Page page = new Page(count, currentpage);
		example.setPageStart(page.getStart());
		example.setPageSize(page.getSize());
		
		List<User> list = userService.selectByExamplePage(example);
		
		model.addAttribute("list", list);
		model.addAttribute("name", name);
		model.addAttribute("page", page);
		
		
		return "userlist3";
	}
    
    
    
	@RequestMapping(value = "/toAdd")
	public String toAdd(HttpServletRequest request, Model model) {
		String type=request.getParameter("type");
		model.addAttribute("type", type);
		
		return "useradd";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(HttpServletRequest request, Model model) {
		
		 String username = request.getParameter("username");
		UserExample example = new UserExample();
   		example.createCriteria();
   		
   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
   		
   		int count = userService.countByExample(example);
   		
   		if(count>0){
   			return "error";
   		}
   		
		userService.add(request);
		
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate")
	public String toUpdate(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		User user = userService.getUserById(id);
		model.addAttribute("o", user);
		
		String type=request.getParameter("type");
		model.addAttribute("type", type);
		
		return "userupdate";
	}

	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		User User = userService.getUserById(id);
		
		String username = request.getParameter("username");
		
		if(!User.getUsername().equals(username)){
			UserExample example = new UserExample();
	   		example.createCriteria();
	   		
	   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
	   		
	   		int count = userService.countByExample(example);
	   		
	   		if(count>0){
	   			return "error";
	   		}
		}
   		
		userService.updateByPrimaryKeySelective(request);
		return "ok";
	}
	
	  
		@RequestMapping(value = "/toAdd7")
		public String toAdd7(HttpServletRequest request, Model model) {
			String type=request.getParameter("type");
			model.addAttribute("type", type);
			
			return "useradd7";
		}
		
		@ResponseBody
		@RequestMapping(value = "/add7")
		public String add7(HttpServletRequest request, Model model) {
			
			 String username = request.getParameter("username");
			UserExample example = new UserExample();
	   		example.createCriteria();
	   		
	   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
	   		
	   		int count = userService.countByExample(example);
	   		
	   		if(count>0){
	   			return "error";
	   		}
	   		
			userService.add7(request);
			
			return "ok";
		}
		
		
		@RequestMapping(value = "/toUpdate7")
		public String toUpdate7(HttpServletRequest request, Model model) {
			String id = request.getParameter("id");
			User user = userService.getUserById(id);
			model.addAttribute("o", user);
			
			String type=request.getParameter("type");
			model.addAttribute("type", type);
			
			return "userupdate7";
		}

		@ResponseBody
		@RequestMapping(value = "/update7")
		public String update7(HttpServletRequest request, Model model) {
			
			String id = request.getParameter("id");
			User User = userService.getUserById(id);
			
			String username = request.getParameter("username");
			
			if(!User.getUsername().equals(username)){
				UserExample example = new UserExample();
		   		example.createCriteria();
		   		
		   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
		   		
		   		int count = userService.countByExample(example);
		   		
		   		if(count>0){
		   			return "error";
		   		}
			}
	   		
			userService.updateByPrimaryKeySelective7(request);
			return "ok";
		}
		
		
		@RequestMapping(value = "/toAdd8")
		public String toAdd8(HttpServletRequest request, Model model) {
			String type=request.getParameter("type");
			model.addAttribute("type", type);
			
			return "useradd8";
		}
		
		@ResponseBody
		@RequestMapping(value = "/add8")
		public String add8(HttpServletRequest request, Model model) {
			
			 String username = request.getParameter("username");
			UserExample example = new UserExample();
	   		example.createCriteria();
	   		
	   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
	   		
	   		int count = userService.countByExample(example);
	   		
	   		if(count>0){
	   			return "error";
	   		}
	   		
			userService.add8(request);
			
			return "ok";
		}
		
		
		@RequestMapping(value = "/toUpdate8")
		public String toUpdate8(HttpServletRequest request, Model model) {
			String id = request.getParameter("id");
			User user = userService.getUserById(id);
			model.addAttribute("o", user);
			
			String type=request.getParameter("type");
			model.addAttribute("type", type);
			
			return "userupdate8";
		}

		@ResponseBody
		@RequestMapping(value = "/update8")
		public String update8(HttpServletRequest request, Model model) {
			
			String id = request.getParameter("id");
			User User = userService.getUserById(id);
			
			String username = request.getParameter("username");
			
			if(!User.getUsername().equals(username)){
				UserExample example = new UserExample();
		   		example.createCriteria();
		   		
		   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
		   		
		   		int count = userService.countByExample(example);
		   		
		   		if(count>0){
		   			return "error";
		   		}
			}
	   		
			userService.updateByPrimaryKeySelective8(request);
			return "ok";
		}
		
		@RequestMapping(value = "/toAdd9")
		public String toAdd9(HttpServletRequest request, Model model) {
			String type=request.getParameter("type");
			model.addAttribute("type", type);
			
			return "useradd9";
		}
		
		@ResponseBody
		@RequestMapping(value = "/add9")
		public String add9(HttpServletRequest request, Model model) {
			
			 String username = request.getParameter("username");
			UserExample example = new UserExample();
	   		example.createCriteria();
	   		
	   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
	   		
	   		int count = userService.countByExample(example);
	   		
	   		if(count>0){
	   			return "error";
	   		}
	   		
			userService.add9(request);
			
			return "ok";
		}
		
		
		@RequestMapping(value = "/toUpdate9")
		public String toUpdate9(HttpServletRequest request, Model model) {
			String id = request.getParameter("id");
			User user = userService.getUserById(id);
			model.addAttribute("o", user);
			
			String type=request.getParameter("type");
			model.addAttribute("type", type);
			
			return "userupdate9";
		}

		@ResponseBody
		@RequestMapping(value = "/update9")
		public String update9(HttpServletRequest request, Model model) {
			
			String id = request.getParameter("id");
			User User = userService.getUserById(id);
			
			String username = request.getParameter("username");
			
			if(!User.getUsername().equals(username)){
				UserExample example = new UserExample();
		   		example.createCriteria();
		   		
		   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
		   		
		   		int count = userService.countByExample(example);
		   		
		   		if(count>0){
		   			return "error";
		   		}
			}
	   		
			userService.updateByPrimaryKeySelective9(request);
			return "ok";
		}
		
		
		@RequestMapping(value = "/toAdd10")
		public String toAdd10(HttpServletRequest request, Model model) {
			String type=request.getParameter("type");
			model.addAttribute("type", type);
			
			return "useradd10";
		}
		
		@ResponseBody
		@RequestMapping(value = "/add10")
		public String add10(HttpServletRequest request, Model model) {
			
			 String username = request.getParameter("username");
			UserExample example = new UserExample();
	   		example.createCriteria();
	   		
	   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
	   		
	   		int count = userService.countByExample(example);
	   		
	   		if(count>0){
	   			return "error";
	   		}
	   		
			userService.add10(request);
			
			return "ok";
		}
		
		
		@RequestMapping(value = "/toUpdate10")
		public String toUpdate10(HttpServletRequest request, Model model) {
			String id = request.getParameter("id");
			User user = userService.getUserById(id);
			model.addAttribute("o", user);
			
			String type=request.getParameter("type");
			model.addAttribute("type", type);
			
			return "userupdate10";
		}

		@ResponseBody
		@RequestMapping(value = "/update10")
		public String update10(HttpServletRequest request, Model model) {
			
			String id = request.getParameter("id");
			User User = userService.getUserById(id);
			
			String username = request.getParameter("username");
			
			if(!User.getUsername().equals(username)){
				UserExample example = new UserExample();
		   		example.createCriteria();
		   		
		   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
		   		
		   		int count = userService.countByExample(example);
		   		
		   		if(count>0){
		   			return "error";
		   		}
			}
	   		
			userService.updateByPrimaryKeySelective10(request);
			return "ok";
		}
		
		
	@RequestMapping(value = "/toAdd2")
	public String toAdd2(HttpServletRequest request, Model model) {
		
		DeptExample example2 = new DeptExample();
		example2.createCriteria();
		List<Dept> deptlist = deptService.selectByExample(example2);
		model.addAttribute("deptlist", deptlist);
		
		
		String type=request.getParameter("type");
		model.addAttribute("type", type);
		
		return "useradd2";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add2")
	public String add2(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		UserExample example = new UserExample();
   		example.createCriteria();
   		
   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
   		
   		int count = userService.countByExample(example);
   		
   		if(count>0){
   			return "error";
   		}
   		
   		
		userService.add2(request);
		return "ok";
	}
	
	
	@RequestMapping(value = "/toUpdate2")
	public String toUpdate2(HttpServletRequest request, Model model) {
		

		DeptExample example2 = new DeptExample();
		example2.createCriteria();
		List<Dept> deptlist = deptService.selectByExample(example2);
		model.addAttribute("deptlist", deptlist);
		
		
		
		
		String id = request.getParameter("id");
		User user = userService.getUserById(id);
		model.addAttribute("o", user);
		
		String type=request.getParameter("type");
		model.addAttribute("type", type);
		
		return "userupdate2";
	}

	@ResponseBody
	@RequestMapping(value = "/update2")
	public String update2(HttpServletRequest request, Model model) {
		

		String id = request.getParameter("id");
		User User = userService.getUserById(id);
		
		String username = request.getParameter("username");
		
		if(!User.getUsername().equals(username)){
			UserExample example = new UserExample();
	   		example.createCriteria();
	   		
	   		example.getOredCriteria().get(0).andUsernameEqualTo(username);
	   		
	   		int count = userService.countByExample(example);
	   		
	   		if(count>0){
	   			return "error";
	   		}
		}
   		
   		
		userService.updateByPrimaryKeySelective2(request);
		return "ok";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/toDelete")
	public String toDelete(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		userService.deleteByPrimaryKey(id);
		return "ok";
	}
    
    @RequestMapping(value = "/toupdatepwd")
	public String toupdatepwd(HttpServletRequest request, Model model) {
		return "updatepwd";
	}
    
	@ResponseBody
	@RequestMapping(value = "/updatepwd")
	public String updatepwd(HttpServletRequest request, Model model) {
		String flag = userService.updatepwd(request);
		return flag;
	}
	
	
	
	@RequestMapping(value = "/toUpdate3")
	public String toUpdate3(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		User user = userService.getUserById(id);
		model.addAttribute("o", user);
		
		DeptExample example2 = new DeptExample();
		example2.createCriteria();
		List<Dept> deptlist = deptService.selectByExample(example2);
		model.addAttribute("deptlist", deptlist);
		
		UsersalaryExample example = new UsersalaryExample();
		example.setOrderByClause(" sort asc ");
		example.createCriteria();
		
		/* User user2 = (User) request.getSession().getAttribute("login_user");
       if(user2!=null){*/
    	   example.getOredCriteria().get(0).andUseridEqualTo(user.getId());
     //  }
		List<Usersalary> detaillist = usersalaryService.selectByExample(example);
		model.addAttribute("detaillist", detaillist);
		
		
		return "userupdate3";
	}

	@ResponseBody
	@RequestMapping(value = "/update3")
	public String update3(HttpServletRequest request, Model model) {
		userService.updateByPrimaryKeySelective3(request);
		return "ok";
	}
	
	@RequestMapping(value = "/toUpdate4")
	public String toUpdate4(HttpServletRequest request, Model model) {
		
		User user2 = (User) request.getSession().getAttribute("login_user");
	       if(user2!=null){
	   		User user = userService.getUserById(user2.getId());
	   		model.addAttribute("o", user);
	   		
	   		DeptExample example2 = new DeptExample();
	   		example2.createCriteria();
	   		List<Dept> deptlist = deptService.selectByExample(example2);
	   		model.addAttribute("deptlist", deptlist);
	   		
	   		UsersalaryExample example = new UsersalaryExample();
	   		example.setOrderByClause(" sort asc ");
	   		example.createCriteria();
	   		
	   		/* User user2 = (User) request.getSession().getAttribute("login_user");
	          if(user2!=null){*/
	       	   example.getOredCriteria().get(0).andUseridEqualTo(user.getId());
	        //  }
	   		List<Usersalary> detaillist = usersalaryService.selectByExample(example);
	   		model.addAttribute("detaillist", detaillist);
	       }
		
		
		
		return "userupdate4";
	}
	
	
	@RequestMapping(value = "/toUpdate5")
	public String toUpdate5(HttpServletRequest request, Model model) {
		DeptExample example2 = new DeptExample();
		example2.createCriteria();
		List<Dept> deptlist = deptService.selectByExample(example2);
		model.addAttribute("deptlist", deptlist);
		 User user2 = (User) request.getSession().getAttribute("login_user");
         if(user2!=null){
     		User user = userService.getUserById(user2.getId());
     		model.addAttribute("o", user);
     		
     		String type=request.getParameter("type");
     		model.addAttribute("type", type);
         }
		//if("0".equals(user2.getType())||"1".equals(user2.getType())){
			return "userupdate5";
		//}
		//return "userupdate6";
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/update5")
	public String update5(HttpServletRequest request, Model model) {
		userService.updateByPrimaryKeySelective5(request);
		return "ok";
	}
	@ResponseBody
	@RequestMapping(value = "/resetPwd")
	public String resetPwd(HttpServletRequest request, Model model) {
		userService.resetPwd(request);
		return "ok";
	}
	
}  

