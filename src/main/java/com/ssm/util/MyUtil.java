package com.ssm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class MyUtil {
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
	
	public static Date parseDate(String s){
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(s) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String formatDate(Date s){
		try {
			return new SimpleDateFormat("yyyy-MM-dd").format(s) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String formatDate2(Date s){
		try {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(s) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
