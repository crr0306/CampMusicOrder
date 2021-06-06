package com.ssm.util;

import java.util.HashMap;

public class ResultUtils{
	
	public static HashMap<String, Object> createSuccess(Object object){
		HashMap<String, Object> hashMap=new HashMap<String, Object>();
		hashMap.put("code", ResulteCode.SUCCESS_CODE);
		hashMap.put("msg", ResulteCode.SUCCESS_STR);
		hashMap.put("data", object);
		return hashMap;
	}
	
	public static HashMap<String, Object> createError(){
		HashMap<String, Object> hashMap=new HashMap<String, Object>();
		hashMap.put("code", ResulteCode.ERROR_CODE);
		hashMap.put("msg", ResulteCode.ERROR_STR);
		hashMap.put("data", new MyObject());
		return hashMap;
	}
	
	
	public static HashMap<String, Object> createError(String msg){
		HashMap<String, Object> hashMap=new HashMap<String, Object>();
		hashMap.put("code", ResulteCode.ERROR_CODE);
		hashMap.put("msg", msg);
		hashMap.put("data", new MyObject());
		return hashMap;
	}
}
