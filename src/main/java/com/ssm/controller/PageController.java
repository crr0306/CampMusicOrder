package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/page")
public class PageController {
	 @RequestMapping(value="/toPageFoot")
	    public String toPageFoot(HttpServletRequest request,Model model){
		 model.addAttribute("currentpage",request.getParameter("currentpage"));
		 model.addAttribute("totalPages",request.getParameter("totalPages"));
	        return "common/pageFoot";
	    }
	 
	
}
