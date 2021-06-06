package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.TblsongMapper;
import com.ssm.po.Tblsong;
import com.ssm.po.TblsongExample;
import com.ssm.service.TblsongService;
import com.ssm.util.MyUtil;
@Service 
public class TblsongServiceImpl implements TblsongService{
	@Autowired
	private TblsongMapper tblsongMapper;
	public List<Tblsong> selectByExample(TblsongExample example) {
		if(example==null){
			example = new TblsongExample();
		}
		example.setOrderByClause(" createdate desc ");
		return tblsongMapper.selectByExample(example);
	}
	public List<Tblsong> selectByExamplePage(TblsongExample example) {
		return tblsongMapper.selectByExamplePage(example);
	}
	public int countByExample(TblsongExample example) {
		return tblsongMapper.countByExample(example);
	}
	public int deleteByPrimaryKey(String id) {
		return tblsongMapper.deleteByPrimaryKey(id);
	}
	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String colname = request.getParameter("colname");
	    String colsinger = request.getParameter("colsinger");
	    String colcomposingwords = request.getParameter("colcomposingwords");
	    String colproductioncompany = request.getParameter("colproductioncompany");
	    String collyric = request.getParameter("collyric");
	    
	    Tblsong tblsong = new Tblsong();
	    tblsong.setId(id);
	    
	    tblsong.setColname(colname);
	    tblsong.setColsinger(colsinger);
	    tblsong.setColcomposingwords(colcomposingwords);
	    tblsong.setColproductioncompany(colproductioncompany);
	    tblsong.setCollyric(collyric);
	    
	    tblsongMapper.insertSelective(tblsong);
		
	}
	public Tblsong getTblsongById(String id) {
		return tblsongMapper.selectByPrimaryKey(id);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String colname = request.getParameter("colname");
	    String colsinger = request.getParameter("colsinger");
	    String colcomposingwords = request.getParameter("colcomposingwords");
	    String colproductioncompany = request.getParameter("colproductioncompany");
	    String collyric = request.getParameter("collyric");
	    
	    Tblsong tblsong = new Tblsong();
	    tblsong.setId(id);
	    
	    tblsong.setColname(colname);
	    tblsong.setColsinger(colsinger);
	    tblsong.setColcomposingwords(colcomposingwords);
	    tblsong.setColproductioncompany(colproductioncompany);
	    tblsong.setCollyric(collyric);
	    
	    tblsongMapper.updateByPrimaryKeySelective(tblsong);
	}

}
