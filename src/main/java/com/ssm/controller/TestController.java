package com.ssm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ssm.util.ResultUtils;

@Controller  
@RequestMapping("/test") 
public class TestController {
	
	public static void main(String[] args){
		

	}


	

	@ResponseBody
	@RequestMapping(value = "/json", produces = "text/html; charset=utf-8")
	public  String  frontlist(HttpServletRequest request, Model model) {
	List<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
	HashMap<String, String> map1 = new HashMap<String, String>();
	map1.put("name", "张三");
	map1.put("phone", "117622163416");
	list.add(map1);
	
	HashMap<String, String> map2 = new HashMap<String, String>();
	map2.put("name", "张三");
	map2.put("phone", "117622163416");
	list.add(map2);
	
	return JSONObject.toJSONString(ResultUtils.createSuccess(list));
	}
	
	@RequestMapping(value = "/toTest")
	public String toTest(HttpServletRequest request, Model model) {
		return "test";
	}
	
	@ResponseBody
	@RequestMapping(value = "/sendMsg")
	public String sendMsg(HttpServletRequest request, Model model) {
		
		
		
		return "ok";
	}
	
}
