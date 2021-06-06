package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssm.mapper.SongTypeMapper;
import com.ssm.po.SongType;
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
	@Autowired
	private SongTypeMapper songTypeMapper;
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
	public String add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String colname = request.getParameter("colname");
	    String colsinger = request.getParameter("colsinger");
	    String colcomposingwords = request.getParameter("colcomposingwords");
	    String colproductioncompany = request.getParameter("colproductioncompany");
	    String collyric = request.getParameter("collyric");
		String songTypeId = request.getParameter("songTypeId");

	    Tblsong tblsong = new Tblsong();
	    tblsong.setId(id);
	    
	    tblsong.setColname(colname);
	    tblsong.setColsinger(colsinger);
	    tblsong.setColcomposingwords(colcomposingwords);
	    tblsong.setColproductioncompany(colproductioncompany);
	    tblsong.setCollyric(collyric);
	    //歌曲类型
		SongType  songType=songTypeMapper.selectByPrimaryKey(songTypeId);
		if(songType==null){
			return "fail";
		}
		tblsong.setBak1(songTypeId);
		tblsong.setBak2(songType.getName());
	    
	    tblsongMapper.insertSelective(tblsong);
	    return "ok";
		
	}
	public Tblsong getTblsongById(String id) {
		return tblsongMapper.selectByPrimaryKey(id);
	}
	public String updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String colname = request.getParameter("colname");
	    String colsinger = request.getParameter("colsinger");
	    String colcomposingwords = request.getParameter("colcomposingwords");
	    String colproductioncompany = request.getParameter("colproductioncompany");
	    String collyric = request.getParameter("collyric");
		String songTypeId = request.getParameter("songTypeId");

	    
	    Tblsong tblsong = new Tblsong();
	    tblsong.setId(id);
	    
	    tblsong.setColname(colname);
	    tblsong.setColsinger(colsinger);
	    tblsong.setColcomposingwords(colcomposingwords);
	    tblsong.setColproductioncompany(colproductioncompany);
	    tblsong.setCollyric(collyric);
		SongType  songType=songTypeMapper.selectByPrimaryKey(songTypeId);
		if(songType==null){
			return "fail";
		}
		tblsong.setBak1(songTypeId);
		tblsong.setBak2(songType.getName());
	    tblsongMapper.updateByPrimaryKeySelective(tblsong);
	    return  "ok";
	}

}
