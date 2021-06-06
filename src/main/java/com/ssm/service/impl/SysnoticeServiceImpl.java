package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.SysnoticeMapper;
import com.ssm.po.Sysnotice;
import com.ssm.po.SysnoticeExample;
import com.ssm.service.SysnoticeService;
import com.ssm.util.MyUtil;
@Service 
public class SysnoticeServiceImpl implements SysnoticeService{
	@Autowired
	private SysnoticeMapper sysnoticeMapper;
	public List<Sysnotice> selectByExample(SysnoticeExample example) {
		if(example==null){
			example = new SysnoticeExample();
		}
		example.setOrderByClause(" createdate desc ");
		return sysnoticeMapper.selectByExample(example);
	}
	public List<Sysnotice> selectByExamplePage(SysnoticeExample example) {
		return sysnoticeMapper.selectByExamplePage(example);
	}
	public int countByExample(SysnoticeExample example) {
		return sysnoticeMapper.countByExample(example);
	}
	public int deleteByPrimaryKey(String id) {
		return sysnoticeMapper.deleteByPrimaryKey(id);
	}
	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String title = request.getParameter("title");
	    
	    String content = request.getParameter("content");
	    
	    Sysnotice sysnotice = new Sysnotice();
	    sysnotice.setId(id);
	    
	    sysnotice.setTitle(title);
	    sysnotice.setContent(content);
	    
	    sysnoticeMapper.insertSelective(sysnotice);
		
	}
	public Sysnotice getSysnoticeById(String id) {
		return sysnoticeMapper.selectByPrimaryKey(id);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String title = request.getParameter("title");
	    
	    String content = request.getParameter("content");
	    
	    Sysnotice sysnotice = new Sysnotice();
	    sysnotice.setId(id);
	    
	    sysnotice.setTitle(title);
	    sysnotice.setContent(content);
	    
	    sysnoticeMapper.updateByPrimaryKeySelective(sysnotice);
	}

}
