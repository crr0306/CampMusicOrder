package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.TblbookingsongsMapper;
import com.ssm.mapper.TblsongMapper;
import com.ssm.po.Tblbookingsongs;
import com.ssm.po.TblbookingsongsExample;
import com.ssm.po.Tblsong;
import com.ssm.po.User;
import com.ssm.service.TblbookingsongsService;
import com.ssm.util.MyUtil;
@Service 
public class TblbookingsongsServiceImpl implements TblbookingsongsService{
	@Autowired
	private TblbookingsongsMapper tblbookingsongsMapper;
	@Autowired
	private TblsongMapper tblsongMapper;
	
	public List<Tblbookingsongs> selectByExample(TblbookingsongsExample example) {
		if(example==null){
			example = new TblbookingsongsExample();
		}
		example.setOrderByClause(" createdate desc ");
		return tblbookingsongsMapper.selectByExample(example);
	}
	public List<Tblbookingsongs> selectByExamplePage(TblbookingsongsExample example) {
		return tblbookingsongsMapper.selectByExamplePage(example);
	}
	public int countByExample(TblbookingsongsExample example) {
		return tblbookingsongsMapper.countByExample(example);
	}
	public int deleteByPrimaryKey(String id) {
		return tblbookingsongsMapper.deleteByPrimaryKey(id);
	}
	public String add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		//查询歌曲详情
	    String colsongid = request.getParameter("colsongid");
	    Tblsong Tblsong = tblsongMapper.selectByPrimaryKey(colsongid);
	    
	    
	    //String colsongname = request.getParameter("colsongname");
		//预约时间
	    String colapptime = request.getParameter("colapptime");
	    String coltype = request.getParameter("coltype");
	    String colresult = request.getParameter("colresult");

	    //查询是否存在
		TblbookingsongsExample example =new TblbookingsongsExample();

		TblbookingsongsExample.Criteria criteria1 = example.createCriteria();
		//example.getOredCriteria().get(0).andColsongnameLike("%"+colsongname+"%");
		criteria1.andColapptimeEqualTo(colapptime);
		TblbookingsongsExample.Criteria criteria2 = example.createCriteria();
		criteria2.andColsongnameEqualTo(Tblsong.getColname());
		example.or();
		int flag=tblbookingsongsMapper.countByExample(example);
		if(flag!=0){
			//已存在
			return "exist";
		}

		Tblbookingsongs tblbookingsongs = new Tblbookingsongs();
	    tblbookingsongs.setColapptime(colapptime);
	    tblbookingsongs.setColsongname(Tblsong.getColname());

	    tblbookingsongs.setId(id);
	    
	    tblbookingsongs.setColsongid(colsongid);
	    tblbookingsongs.setColsongname(Tblsong.getColname());
	    tblbookingsongs.setColapptime(colapptime);
	    tblbookingsongs.setColtype("待处理");
	    //tblbookingsongs.setColresult(colresult);
	    
	    
		   
	    User user = (User) request.getSession().getAttribute("login_user");
	       if(user!=null){
	    	   tblbookingsongs.setCreateuserid(user.getId());
	    	   tblbookingsongs.setCreateusername(user.getName());
	       }
	       
	    tblbookingsongsMapper.insertSelective(tblbookingsongs);
	       return  "ok";
		
	}
	public Tblbookingsongs getTblbookingsongsById(String id) {
		return tblbookingsongsMapper.selectByPrimaryKey(id);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String colsongid = request.getParameter("colsongid");
	    
	    Tblsong Tblsong = tblsongMapper.selectByPrimaryKey(colsongid);
	    
	    
	   // String colsongname = request.getParameter("colsongname");
	    String colapptime = request.getParameter("colapptime");
	    String coltype = request.getParameter("coltype");
	    String colresult = request.getParameter("colresult");
	    
	    Tblbookingsongs tblbookingsongs = new Tblbookingsongs();
	    tblbookingsongs.setId(id);
	    
	    tblbookingsongs.setColsongid(colsongid);
	    tblbookingsongs.setColsongname(Tblsong.getColname());
	    tblbookingsongs.setColapptime(colapptime);
	    tblbookingsongs.setColtype("待处理");
	   // tblbookingsongs.setColresult(colresult);
	    
	    
	    User user = (User) request.getSession().getAttribute("login_user");
	       if(user!=null){
	    	   tblbookingsongs.setCreateuserid(user.getId());
	    	   tblbookingsongs.setCreateusername(user.getName());
	       }
	       
	       
	    tblbookingsongsMapper.updateByPrimaryKeySelective(tblbookingsongs);
	}
	public void updateByPrimaryKeySelective2(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	   
	    String coltype = request.getParameter("coltype");
	    String colresult = request.getParameter("colresult");
	    
	    Tblbookingsongs tblbookingsongs = new Tblbookingsongs();
	    tblbookingsongs.setId(id);
	    
	   
	    tblbookingsongs.setColtype(coltype);
	    tblbookingsongs.setColresult(colresult);
	    
	  
	       
	       
	    tblbookingsongsMapper.updateByPrimaryKeySelective(tblbookingsongs);
	}

}
