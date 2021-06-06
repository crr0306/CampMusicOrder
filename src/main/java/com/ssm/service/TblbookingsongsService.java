package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.po.Tblbookingsongs;
import com.ssm.po.TblbookingsongsExample;

public interface TblbookingsongsService {
	List<Tblbookingsongs> selectByExample(TblbookingsongsExample example);
	
	public List<Tblbookingsongs> selectByExamplePage(TblbookingsongsExample example);

	public int countByExample(TblbookingsongsExample example);
	
	public int deleteByPrimaryKey(String id);
	 
	public String add(HttpServletRequest request);
	
	public Tblbookingsongs getTblbookingsongsById(String id); 
	
	public void updateByPrimaryKeySelective(HttpServletRequest request);
	
	
	public void updateByPrimaryKeySelective2(HttpServletRequest request);
	
	
}
