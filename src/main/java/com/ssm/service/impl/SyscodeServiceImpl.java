package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.SyscodeMapper;
import com.ssm.po.Syscode;
import com.ssm.po.SyscodeExample;
import com.ssm.service.SyscodeService;
import com.ssm.util.MyUtil;

@Service
public class SyscodeServiceImpl implements SyscodeService {
	@Autowired
	private SyscodeMapper syscodeMapper;

	public List<Syscode> selectByExample(SyscodeExample example) {
		if (example == null) {
			example = new SyscodeExample();
		}
		example.setOrderByClause(" createdate desc ");
		return syscodeMapper.selectByExample(example);
	}

	public List<Syscode> selectByExamplePage(SyscodeExample example) {
		return syscodeMapper.selectByExamplePage(example);
	}

	public int countByExample(SyscodeExample example) {
		return syscodeMapper.countByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return syscodeMapper.deleteByPrimaryKey(id);
	}

	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();

		String name = request.getParameter("name");
		String code = request.getParameter("code");
		String type = request.getParameter("type");
		String remark = request.getParameter("remark");
		String desc_ = request.getParameter("desc_");
		String sort = request.getParameter("sort");
		Syscode syscode = new Syscode();
		syscode.setId(id);

		syscode.setName(name);
		syscode.setCode(code);
		syscode.setType(type);
		syscode.setRemark(remark);
		syscode.setDesc(desc_);
		syscode.setSort(Integer.parseInt(sort));
		syscodeMapper.insertSelective(syscode);

	}

	public Syscode getSyscodeById(String id) {
		return syscodeMapper.selectByPrimaryKey(id);
	}

	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");

		String name = request.getParameter("name");
		String code = request.getParameter("code");
		String type = request.getParameter("type");
		String remark = request.getParameter("remark");
		String desc_ = request.getParameter("desc_");
		String sort = request.getParameter("sort");

		Syscode syscode = new Syscode();
		syscode.setId(id);

		syscode.setName(name);
		syscode.setCode(code);
		syscode.setType(type);
		syscode.setRemark(remark);
		syscode.setDesc(desc_);
		syscode.setSort(Integer.parseInt(sort));
		syscodeMapper.updateByPrimaryKeySelective(syscode);
	}

	public List<Syscode> selectByType(String type) {

		SyscodeExample example = new SyscodeExample();
		example.setOrderByClause(" sort_ asc ");
		example.createCriteria();
		example.getOredCriteria().get(0).andTypeEqualTo(type);
		return syscodeMapper.selectByExample(example);
	}

}
