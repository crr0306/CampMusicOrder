package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.DeptMapper;
import com.ssm.po.Dept;
import com.ssm.po.DeptExample;
import com.ssm.service.DeptService;
import com.ssm.util.MyUtil;
@Service 
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptMapper deptMapper;
	public List<Dept> selectByExample(DeptExample example) {
		if(example==null){
			example = new DeptExample();
		}
		example.setOrderByClause(" sort asc ");
		return deptMapper.selectByExample(example);
	}
	public List<Dept> selectByExamplePage(DeptExample example) {
		return deptMapper.selectByExamplePage(example);
	}
	public int countByExample(DeptExample example) {
		return deptMapper.countByExample(example);
	}
	public int deleteByPrimaryKey(String id) {
		return deptMapper.deleteByPrimaryKey(id);
	}
	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String name = request.getParameter("name");
	    
	    Dept dept = new Dept();
	    dept.setId(id);
	    
	    dept.setName(name);
	    
	    
	    String sort = request.getParameter("sort");
	    int s = 0;
	    
	    try{
	    	s = Integer.parseInt(sort);
	    }catch(Exception e){
	    	
	    }
	    dept.setSort(s);
	    
	    
	    deptMapper.insertSelective(dept);
		
	}
	public Dept getDeptById(String id) {
		return deptMapper.selectByPrimaryKey(id);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String name = request.getParameter("name");
	    
	    Dept dept = new Dept();
	    dept.setId(id);
	    
	    dept.setName(name);
	    
	    
	    String sort = request.getParameter("sort");
	    int s = 0;
	    
	    try{
	    	s = Integer.parseInt(sort);
	    }catch(Exception e){
	    	
	    }
	    dept.setSort(s);
	    
	    
	    deptMapper.updateByPrimaryKeySelective(dept);
	}

}
