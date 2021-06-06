package com.ssm.service.impl;

import com.ssm.mapper.SongTypeMapper;
import com.ssm.mapper.TblsongMapper;
import com.ssm.po.SongType;
import com.ssm.po.SongTypeExample;
import com.ssm.po.Tblsong;
import com.ssm.po.TblsongExample;
import com.ssm.service.TblsongService;
import com.ssm.service.TblsongTypeService;
import com.ssm.util.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class TblsongTypeServiceImpl implements TblsongTypeService {
	@Autowired
	private SongTypeMapper songTypeMapper;
	public List<SongType> selectByExample(SongTypeExample example) {
		if(example==null){
			example = new SongTypeExample()
			;
		}
		example.setOrderByClause(" createdate desc ");
		return songTypeMapper.selectByExample(example);
	}
	public List<SongType> selectByExamplePage(SongTypeExample example) {
		return songTypeMapper.selectByExamplePage(example);
	}
	public int countByExample(SongTypeExample example) {
		return songTypeMapper.countByExample(example);
	}
	public int deleteByPrimaryKey(String id) {
		return songTypeMapper.deleteByPrimaryKey(id);
	}
	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();
		
	    String colname = request.getParameter("colname");

	    
	    SongType songType = new SongType();
		songType.setId(id);


		songType.setName(colname);

		songTypeMapper.insertSelective(songType);
		
	}
	public SongType getTblsongTypeById(String id) {
		return songTypeMapper.selectByPrimaryKey(id);
	}
	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");
		
	    String colname = request.getParameter("colname");
	    String colsinger = request.getParameter("colsinger");
	    String colcomposingwords = request.getParameter("colcomposingwords");
	    String colproductioncompany = request.getParameter("colproductioncompany");
	    String collyric = request.getParameter("collyric");
	    
	    SongType tblsong = new SongType();
	    tblsong.setId(id);
	    



	}

}
