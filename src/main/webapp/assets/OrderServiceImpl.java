package com.ssm.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ssm.mapper.MessageBoardMapper;
import com.ssm.mapper.MessageReadNumMapper;
import com.ssm.mapper.OrderEmpMapper;
import com.ssm.mapper.OrderItemMapper;
import com.ssm.mapper.OrderMapper;
import com.ssm.mapper.OrderTogetherMapper;
import com.ssm.mapper.SyscodeMapper;
import com.ssm.mapper.UserMapper;
import com.ssm.po.MessageReadNum;
import com.ssm.po.Order;
import com.ssm.po.OrderEmp;
import com.ssm.po.OrderEmpExample;
import com.ssm.po.OrderExample;
import com.ssm.po.OrderItem;
import com.ssm.po.OrderItemExample;
import com.ssm.po.OrderTogether;
import com.ssm.po.OrderTogetherExample;
import com.ssm.po.User;
import com.ssm.po.UserExample;
import com.ssm.service.OrderService;
import com.ssm.util.MyUtil;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private OrderItemMapper orderItemMapper;
	@Autowired
	private OrderEmpMapper orderEmpMapper;
	@Autowired
	private OrderTogetherMapper orderTogetherMapper;
	@Autowired
	private MessageBoardMapper messageBoardMapper;
	@Autowired
	private MessageReadNumMapper messageReadNumMapper;
	@Autowired
	private SyscodeMapper syscodeMapper;
	
	@Autowired
	private UserMapper userMapper;

	public List<Order> selectByExample(OrderExample example) {
		if (example == null) {
			example = new OrderExample();
		}
		example.setOrderByClause(" createdate desc ");
		return orderMapper.selectByExample(example);
	}

	public List<Order> selectByExamplePage(OrderExample example) {
		return orderMapper.selectByExamplePage2(example);
	}

	public int countByExample(OrderExample example) {
		return orderMapper.countByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return orderMapper.deleteByPrimaryKey(id);
	}

	public void add(HttpServletRequest request) {
		String id = MyUtil.getUUID();

		String orderno = request.getParameter("orderno");
		String title = request.getParameter("title");
		String major = request.getParameter("major");
		String majortype = request.getParameter("majortype");
		String remark = request.getParameter("remark");
		String paperflag = request.getParameter("paperflag");
		String opentitleflag = request.getParameter("opentitleflag");
		String designflag = request.getParameter("designflag");
		String customflag = request.getParameter("customflag");
		String wordnum = request.getParameter("wordnum");
		String dupcheck = request.getParameter("dupcheck");
		String dupval = request.getParameter("dupval");
		String school = request.getParameter("school");
		String papermoney1 = request.getParameter("papermoney1");
		String papermoney2 = request.getParameter("papermoney2");
		String papermoney3 = request.getParameter("papermoney3");
		String papermoney4 = request.getParameter("papermoney4");
		String papermoney5 = request.getParameter("papermoney5");
		String writemoney1 = request.getParameter("writemoney1");
		String writemoney2 = request.getParameter("writemoney2");
		String writemoney3 = request.getParameter("writemoney3");
		String writemoney5 = request.getParameter("writemoney5");
		String designmoney1 = request.getParameter("designmoney1");
		String designmoney2 = request.getParameter("designmoney2");
		String designmoney3 = request.getParameter("designmoney3");
		String designmoney5 = request.getParameter("designmoney5");
		String fileurl = request.getParameter("fileurl");
		String desc = request.getParameter("desc");

		Order order = new Order();
		order.setId(id);

		order.setOrderno(orderno);
		order.setTitle(title);
		order.setMajor(major);
		order.setMajortype(majortype);
		order.setRemark(remark);
		order.setPaperflag(paperflag);
		order.setOpentitleflag(opentitleflag);
		order.setDesignflag(designflag);
		order.setCustomflag(customflag);
		order.setWordnum(wordnum);
		order.setDupcheck(dupcheck);
		order.setDupval(dupval);
		order.setSchool(school);
		order.setPapermoney1(papermoney1);
		order.setPapermoney2(papermoney2);
		order.setPapermoney3(papermoney3);
		order.setPapermoney4(papermoney4);
		order.setPapermoney5(papermoney5);
		order.setWritemoney1(writemoney1);
		order.setWritemoney2(writemoney2);
		order.setWritemoney3(writemoney3);
		order.setWritemoney5(writemoney5);
		order.setDesignmoney1(designmoney1);
		order.setDesignmoney2(designmoney2);
		order.setDesignmoney3(designmoney3);
		order.setDesignmoney5(designmoney5);
		order.setFileurl(fileurl);
		order.setDesc(desc);

		orderMapper.insertSelective(order);

	}

	public void add2(HttpServletRequest request) {

		String oldid = request.getParameter("id");
		String newid = null;
		Order order = new Order();
		if (oldid == null || "".equals(oldid)) {
			newid = MyUtil.getUUID();
			
			String neworderno = "";
			String orderno = request.getParameter("orderno");
			
			String orderindex = "";
			int ordernum = orderMapper.countOrderIndex() ; 
			if(ordernum==0){
				orderindex = "001";
				orderMapper.insertOrderIndex();
			}else{
				Integer sqlorderindex = orderMapper.selectOrderIndex();
				orderMapper.updateOrderIndex();
				if(sqlorderindex<=9){
					orderindex = "00"+sqlorderindex.toString();
				}
				else if(sqlorderindex<=99){
					orderindex = "0"+sqlorderindex.toString();
				}
			}
			
			String[] ordernoArr = orderno.split("-");
			neworderno = ordernoArr[0]+"-"+ordernoArr[1]+"-"+ordernoArr[2]+"-"+orderindex;
			order.setOrderno(neworderno);
			
		} else {
			order = orderMapper.selectByPrimaryKey(oldid);
			newid = oldid;
		}
		
		String title = request.getParameter("title");
		String major = request.getParameter("major");
		String majortype = request.getParameter("majortype");
		String remark = request.getParameter("remark");
		String paperflag = request.getParameter("paperflag");
		String opentitleflag = request.getParameter("opentitleflag");
		String designflag = request.getParameter("designflag");
		
		//String customflag = request.getParameter("customflag");
		String reduceweightflag = request.getParameter("reduceweightflag");
		String typesetflag = request.getParameter("typesetflag");
		String embellishflag = request.getParameter("embellishflag");
		String foreignflag = request.getParameter("foreignflag");
		String literatureflag = request.getParameter("literatureflag");
		String customdesc = request.getParameter("customdesc");
		
		String wordnum = request.getParameter("wordnum");
		String dupcheck = request.getParameter("dupcheck");
		String dupval = request.getParameter("dupval");
		String school = request.getParameter("school");
		String papermoney1 = request.getParameter("papermoney1");
		String papermoney2 = request.getParameter("papermoney2");
		String papermoney3 = request.getParameter("papermoney3");
		String papermoney4 = request.getParameter("papermoney4");
		String papermoney5 = request.getParameter("papermoney5");
		String papermoney6 = request.getParameter("papermoney6");
		String writemoney1 = request.getParameter("writemoney1");
		String writemoney2 = request.getParameter("writemoney2");
		String writemoney3 = request.getParameter("writemoney3");
		String writemoney5 = request.getParameter("writemoney5");
		String designmoney1 = request.getParameter("designmoney1");
		String designmoney2 = request.getParameter("designmoney2");
		String designmoney3 = request.getParameter("designmoney3");
		String designmoney5 = request.getParameter("designmoney5");
		
		String paperoutflag = request.getParameter("paperoutflag");
		String designoutflag = request.getParameter("designoutflag");
		String orderendflag = request.getParameter("orderendflag");
		
		String orderfirstpaperflag = request.getParameter("orderfirstpaperflag");
		String orderendpaperflag = request.getParameter("orderendpaperflag");
		String ordercodeflag = request.getParameter("ordercodeflag");
		String orderendpayflag = request.getParameter("orderendpayflag");
		String orderstatusflag = request.getParameter("orderstatusflag");
		
		String payfirstflag = request.getParameter("payfirstflag");
		String payendflag = request.getParameter("payendflag");
		String paycodeflag = request.getParameter("paycodeflag");
		String payendpayflag = request.getParameter("payendpayflag");
		String paystatusflag = request.getParameter("paystatusflag");
		
		String paperoutdate = request.getParameter("paperoutdate");
		String designoutdate = request.getParameter("designoutdate");
		
		String fileurl = request.getParameter("fileurl");
		String desc = request.getParameter("desc");

		order.setId(newid);

		
		order.setTitle(title);
		if (major != null && !"".equals(major)) {
			String[] majorarr = major.split(",,,,");
			order.setMajorid(majorarr[0]);
			order.setMajorcode(majorarr[1]);
			order.setMajor(majorarr[2]);
		}
		if (majortype != null && !"".equals(majortype)) {
			String[] majortypearr = majortype.split(",,,,");
			order.setMajortypeid(majortypearr[0]);
			order.setMajortype(majortypearr[2]);
		}

		order.setRemark(remark);
		order.setPaperflag(paperflag);
		order.setOpentitleflag(opentitleflag);
		order.setDesignflag(designflag);
		
		order.setCustomdesc(customdesc);
		order.setReduceweightflag(reduceweightflag);
		order.setTypesetflag(typesetflag);
		order.setEmbellishflag(embellishflag);
		order.setForeignflag(foreignflag);
		order.setLiteratureflag(literatureflag);
		//order.setCustomflag(customflag);
		
		order.setWordnum(wordnum);

		if (dupcheck != null && !"".equals(dupcheck)) {
			String[] dupcheckarr = dupcheck.split(",,,,");
			order.setDupcheckid(dupcheckarr[0]);
			order.setDupcheck(dupcheckarr[1]);
		}

		order.setDupval(dupval);
		order.setSchool(school);
		
		if (oldid == null || "".equals(oldid)) {
		order.setPapermoney1(papermoney1);
		order.setPapermoney2(papermoney2);
		order.setPapermoney3(papermoney3);
		order.setPapermoney4(papermoney4);
		order.setPapermoney5(papermoney5);
		order.setPapermoney6(papermoney6);
		order.setWritemoney1(writemoney1);
		order.setWritemoney2(writemoney2);
		order.setWritemoney3(writemoney3);
		order.setWritemoney5(writemoney5);
		order.setDesignmoney1(designmoney1);
		order.setDesignmoney2(designmoney2);
		order.setDesignmoney3(designmoney3);
		order.setDesignmoney5(designmoney5);
		
		order.setOrderfirstpaperflag(orderfirstpaperflag);
		order.setOrderendpaperflag(orderendpaperflag);
		order.setOrdercodeflag(ordercodeflag);
		order.setOrderendpayflag(orderendpayflag);
		order.setOrderstatusflag(orderstatusflag);
		
		order.setPayfirstflag(payfirstflag);
		order.setPayendflag(payendflag);
		order.setPaycodeflag(paycodeflag);
		order.setPayendpayflag(payendpayflag);
		order.setPaystatusflag(paystatusflag);
		
		}
		
		order.setPaperoutflag(paperoutflag);
		order.setDesignoutflag(designoutflag);
		
		if (paperoutdate != null && !"".equals(paperoutdate)) {
			try {
				order.setPaperoutdate(new SimpleDateFormat("yyyy-MM-dd").parse(paperoutdate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else{
			order.setPaperoutdateflag("123");
		}
		
		if (designoutdate != null && !"".equals(designoutdate)) {
			try {
				order.setDesignoutdate(new SimpleDateFormat("yyyy-MM-dd").parse(designoutdate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else{
			order.setDesignoutdateflag("123");
		}
		
		
		order.setOrderendflag(orderendflag);
		
		order.setFileurl(fileurl);
		order.setDesc(desc);

		Object deliveryInfo2 = request.getParameter("deliveryInfo");
		JSONArray deliveryInfoArr2 = JSONArray.parseArray(deliveryInfo2.toString());
		if (deliveryInfoArr2 != null && deliveryInfoArr2.size() > 0) {
			JSONObject deliveryData2 = (JSONObject) deliveryInfoArr2.get(0);
			String deliverydate2 = (String) deliveryData2.get("deliverydate");
			if (deliverydate2 != null && !"".equals(deliverydate2)) {
				try {
					order.setDeliverydate(new SimpleDateFormat("yyyy-MM-dd").parse(deliverydate2));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		
		Object custInfo2 = request.getParameter("custInfo");
		JSONArray custInfoArr2 = JSONArray.parseArray(custInfo2.toString());
		if (custInfoArr2 != null && custInfoArr2.size() > 0) {
				JSONObject custInfoData2 = (JSONObject) custInfoArr2.get(0);
				String custqq = (String) custInfoData2.get("custqq");
				String custwechat = (String) custInfoData2.get("custwechat");
				String custphone = (String) custInfoData2.get("custphone");
				order.setCustlink(custqq+"<br>"+custwechat+"<br>"+custphone);
		}
		
		Object writeInfo2 = request.getParameter("writeInfo");
		JSONArray writeInfoArr2 = JSONArray.parseArray(writeInfo2.toString());
		if (writeInfoArr2 != null && writeInfoArr2.size() > 0) {
				JSONObject writeInfoData2 = (JSONObject) writeInfoArr2.get(0);
				String writeqq = (String) writeInfoData2.get("writeqq");
				String writewechat = (String) writeInfoData2.get("writewechat");
				String writephone = (String) writeInfoData2.get("writephone");
				String writemoney = (String) writeInfoData2.get("writemoney");
				order.setWritelink(writeqq+"<br>"+writewechat+"<br>"+writephone);
		}
		
		Object designInfo2 = request.getParameter("designInfo");
		JSONArray designInfoArr2 = JSONArray.parseArray(designInfo2.toString());
		if (designInfoArr2 != null && designInfoArr2.size() > 0) {
				JSONObject designInfoData2 = (JSONObject) designInfoArr2.get(0);
				String designqq = (String) designInfoData2.get("designqq");
				String designwechat = (String) designInfoData2.get("designwechat");
				String designphone = (String) designInfoData2.get("designphone");
				String designmoney = (String) designInfoData2.get("designmoney");
				order.setDesignlink(designqq+"<br>"+designwechat+"<br>"+designphone);
		}
		
		

		if (oldid == null || "".equals(oldid)) {
			orderMapper.insertSelective(order);
		} else {
			orderMapper.updateByPrimaryKeySelective(order);
		}

		if (oldid == null || "".equals(oldid)) {

		} else {
			OrderItemExample OrderItemExample = new OrderItemExample();
			OrderItemExample.createCriteria();
			OrderItemExample.getOredCriteria().get(0).andOrderidEqualTo(newid);
			orderItemMapper.deleteByExample(OrderItemExample);

			OrderEmpExample OrderEmpExample = new OrderEmpExample();
			OrderEmpExample.createCriteria();
			OrderEmpExample.getOredCriteria().get(0).andOrderidEqualTo(newid);
			orderEmpMapper.deleteByExample(OrderEmpExample);

			OrderTogetherExample OrderTogetherExample = new OrderTogetherExample();
			OrderTogetherExample.createCriteria();
			OrderTogetherExample.getOredCriteria().get(0).andOrderidEqualTo(newid);
			orderTogetherMapper.deleteByExample(OrderTogetherExample);

		}

		Object deliveryInfo = request.getParameter("deliveryInfo");
		Object custInfo = request.getParameter("custInfo");
		Object writeInfo = request.getParameter("writeInfo");
		Object designInfo = request.getParameter("designInfo");
		Object ordernootherInfo = request.getParameter("ordernootherInfo");

		JSONArray deliveryInfoArr = JSONArray.parseArray(deliveryInfo.toString());
		// Object[] deliveryInfoArr = (Object[]) deliveryInfo;
		if (deliveryInfoArr != null && deliveryInfoArr.size() > 0) {
			for (int i = 0; i < deliveryInfoArr.size(); i++) {
				JSONObject deliveryData = (JSONObject) deliveryInfoArr.get(i);
				String deliverydate = (String) deliveryData.get("deliverydate");
				String deliverycontent = (String) deliveryData.get("deliverycontent");

				OrderItem OrderItem = new OrderItem();
				OrderItem.setId(MyUtil.getUUID());
				OrderItem.setOrderid(newid);
				if (deliverydate != null && !"".equals(deliverydate)) {
					try {
						OrderItem.setDeliverydate(new SimpleDateFormat("yyyy-MM-dd").parse(deliverydate));
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}
				OrderItem.setContent(deliverycontent);
				OrderItem.setSort(i + 1);
				orderItemMapper.insertSelective(OrderItem);
			}

		}

		JSONArray custInfoArr = JSONArray.parseArray(custInfo.toString());
		// Object[] custInfoArr = (Object[]) custInfo;
		if (custInfoArr != null && custInfoArr.size() > 0) {
			for (int i = 0; i < custInfoArr.size(); i++) {
				JSONObject custInfoData = (JSONObject) custInfoArr.get(i);
				String custqq = (String) custInfoData.get("custqq");
				String custwechat = (String) custInfoData.get("custwechat");
				String custphone = (String) custInfoData.get("custphone");
				String custmoney = (String) custInfoData.get("custmoney");
				OrderEmp OrderEmp = new OrderEmp();
				OrderEmp.setId(MyUtil.getUUID());
				OrderEmp.setOrderid(newid);
				OrderEmp.setQq(custqq);
				OrderEmp.setWechat(custwechat);
				OrderEmp.setPhone(custphone);
				OrderEmp.setMoney(custmoney);
				OrderEmp.setType("0");
				OrderEmp.setSort(i + 1);
				orderEmpMapper.insertSelective(OrderEmp);
			}

		}

		JSONArray writeInfoArr = JSONArray.parseArray(writeInfo.toString());
		// Object[] writeInfoArr = (Object[]) writeInfo;
		if (writeInfoArr != null && writeInfoArr.size() > 0) {
			for (int i = 0; i < writeInfoArr.size(); i++) {
				JSONObject writeInfoData = (JSONObject) writeInfoArr.get(i);
				String writeqq = (String) writeInfoData.get("writeqq");
				String writewechat = (String) writeInfoData.get("writewechat");
				String writephone = (String) writeInfoData.get("writephone");
				String writemoney = (String) writeInfoData.get("writemoney");
				OrderEmp OrderEmp = new OrderEmp();
				OrderEmp.setId(MyUtil.getUUID());
				OrderEmp.setOrderid(newid);
				OrderEmp.setQq(writeqq);
				OrderEmp.setWechat(writewechat);
				OrderEmp.setPhone(writephone);
				OrderEmp.setMoney(writemoney);
				OrderEmp.setType("1");
				OrderEmp.setSort(i + 1);
				orderEmpMapper.insertSelective(OrderEmp);
			}

		}

		JSONArray designInfoArr = JSONArray.parseArray(designInfo.toString());
		// Object[] designInfoArr = (Object[]) designInfo;
		if (designInfoArr != null && designInfoArr.size() > 0) {
			for (int i = 0; i < designInfoArr.size(); i++) {
				JSONObject designInfoData = (JSONObject) designInfoArr.get(i);
				String designqq = (String) designInfoData.get("designqq");
				String designwechat = (String) designInfoData.get("designwechat");
				String designphone = (String) designInfoData.get("designphone");
				String designmoney = (String) designInfoData.get("designmoney");
				OrderEmp OrderEmp = new OrderEmp();
				OrderEmp.setId(MyUtil.getUUID());
				OrderEmp.setOrderid(newid);
				OrderEmp.setQq(designqq);
				OrderEmp.setWechat(designwechat);
				OrderEmp.setPhone(designphone);
				OrderEmp.setMoney(designmoney);
				OrderEmp.setType("2");
				OrderEmp.setSort(i + 1);
				orderEmpMapper.insertSelective(OrderEmp);
			}

		}

		JSONArray ordernootherInfoArr = JSONArray.parseArray(ordernootherInfo.toString());
		// Object[] ordernootherInfoArr = (Object[]) ordernootherInfo;
		if (ordernootherInfoArr != null && ordernootherInfoArr.size() > 0) {
			for (int i = 0; i < ordernootherInfoArr.size(); i++) {
				JSONObject ordernootherInfoData = (JSONObject) ordernootherInfoArr.get(i);
				String ordernoother = (String) ordernootherInfoData.get("ordernoother");

				OrderTogether OrderTogether = new OrderTogether();
				OrderTogether.setId(MyUtil.getUUID());
				OrderTogether.setOrderid(newid);
				OrderTogether.setOrdernoOther(ordernoother);
				OrderTogether.setSort(i + 1);
				orderTogetherMapper.insertSelective(OrderTogether);
			}

		}

		
		
		//UserExample UserExample = new UserExample();
		//UserExample.setOrderByClause(" createdate desc ");
		//UserExample.createCriteria();
		//example.getOredCriteria().get(0).andTypeNotEqualTo("0");
		//example.getOredCriteria().get(0).andNameLike("%"+name+"%");
		
		List<User> userlist= userMapper.selectForMessageNum(newid);
		if(userlist!=null&&userlist.size()>0){
			for(int i=0 ;i < userlist.size() ; i ++){
				User user = userlist.get(i);
				MessageReadNum MessageReadNum = new MessageReadNum ();
				MessageReadNum.setId(MyUtil.getUUID());
				MessageReadNum.setUserid(user.getId());
				MessageReadNum.setOrderid(newid);
				MessageReadNum.setUnreadnum(0);
				messageReadNumMapper.insertSelective(MessageReadNum);
			}
		}

		
	}

	public Order getOrderById(String id) {
		return orderMapper.selectByPrimaryKey(id);
	}

	public void updateByPrimaryKeySelective(HttpServletRequest request) {
		String id = request.getParameter("id");

		String orderno = request.getParameter("orderno");
		String title = request.getParameter("title");
		String major = request.getParameter("major");
		String majortype = request.getParameter("majortype");
		String remark = request.getParameter("remark");
		String paperflag = request.getParameter("paperflag");
		String opentitleflag = request.getParameter("opentitleflag");
		String designflag = request.getParameter("designflag");
		String customflag = request.getParameter("customflag");
		String wordnum = request.getParameter("wordnum");
		String dupcheck = request.getParameter("dupcheck");
		String dupval = request.getParameter("dupval");
		String school = request.getParameter("school");
		String papermoney1 = request.getParameter("papermoney1");
		String papermoney2 = request.getParameter("papermoney2");
		String papermoney3 = request.getParameter("papermoney3");
		String papermoney4 = request.getParameter("papermoney4");
		String papermoney5 = request.getParameter("papermoney5");
		String writemoney1 = request.getParameter("writemoney1");
		String writemoney2 = request.getParameter("writemoney2");
		String writemoney3 = request.getParameter("writemoney3");
		String writemoney5 = request.getParameter("writemoney5");
		String designmoney1 = request.getParameter("designmoney1");
		String designmoney2 = request.getParameter("designmoney2");
		String designmoney3 = request.getParameter("designmoney3");
		String designmoney5 = request.getParameter("designmoney5");
		String fileurl = request.getParameter("fileurl");
		String desc = request.getParameter("desc");

		Order order = new Order();
		order.setId(id);

		order.setOrderno(orderno);
		order.setTitle(title);
		order.setMajor(major);
		order.setMajortype(majortype);
		order.setRemark(remark);
		order.setPaperflag(paperflag);
		order.setOpentitleflag(opentitleflag);
		order.setDesignflag(designflag);
		order.setCustomflag(customflag);
		order.setWordnum(wordnum);
		order.setDupcheck(dupcheck);
		order.setDupval(dupval);
		order.setSchool(school);
		order.setPapermoney1(papermoney1);
		order.setPapermoney2(papermoney2);
		order.setPapermoney3(papermoney3);
		order.setPapermoney4(papermoney4);
		order.setPapermoney5(papermoney5);
		order.setWritemoney1(writemoney1);
		order.setWritemoney2(writemoney2);
		order.setWritemoney3(writemoney3);
		order.setWritemoney5(writemoney5);
		order.setDesignmoney1(designmoney1);
		order.setDesignmoney2(designmoney2);
		order.setDesignmoney3(designmoney3);
		order.setDesignmoney5(designmoney5);
		order.setFileurl(fileurl);
		order.setDesc(desc);

		orderMapper.updateByPrimaryKeySelective(order);
	}

	public void updatePartInfo(HttpServletRequest request) {
		String id = request.getParameter("id");
		Order order = new Order();
		order.setId(id);
				//orderMapper.selectByPrimaryKey(oldid);
		String type = request.getParameter("type");
		
		String papermoney1 = request.getParameter("papermoney1");
		String papermoney2 = request.getParameter("papermoney2");
		String papermoney3 = request.getParameter("papermoney3");
		String papermoney4 = request.getParameter("papermoney4");
		String papermoney5 = request.getParameter("papermoney5");
		String papermoney6 = request.getParameter("papermoney6");
		String writemoney1 = request.getParameter("writemoney1");
		String writemoney2 = request.getParameter("writemoney2");
		String writemoney3 = request.getParameter("writemoney3");
		String writemoney5 = request.getParameter("writemoney5");
		String designmoney1 = request.getParameter("designmoney1");
		String designmoney2 = request.getParameter("designmoney2");
		String designmoney3 = request.getParameter("designmoney3");
		String designmoney5 = request.getParameter("designmoney5");
		
		String orderfirstpaperflag = request.getParameter("orderfirstpaperflag");
		String orderendpaperflag = request.getParameter("orderendpaperflag");
		String ordercodeflag = request.getParameter("ordercodeflag");
		String orderendpayflag = request.getParameter("orderendpayflag");
		String orderstatusflag = request.getParameter("orderstatusflag");
		
		String payfirstflag = request.getParameter("payfirstflag");
		String payendflag = request.getParameter("payendflag");
		String paycodeflag = request.getParameter("paycodeflag");
		String payendpayflag = request.getParameter("payendpayflag");
		String paystatusflag = request.getParameter("paystatusflag");
		
		if("1".equals(type)){
			order.setPapermoney1(papermoney1);
			order.setPapermoney2(papermoney2);
			order.setPapermoney3(papermoney3);
			order.setPapermoney4(papermoney4);
			order.setPapermoney5(papermoney5);
			order.setPapermoney6(papermoney6);
		}
		else if("2".equals(type)){
			order.setWritemoney1(writemoney1);
			order.setWritemoney2(writemoney2);
			order.setWritemoney3(writemoney3);
			order.setWritemoney5(writemoney5);
		}
		else if("3".equals(type)){
			order.setDesignmoney1(designmoney1);
			order.setDesignmoney2(designmoney2);
			order.setDesignmoney3(designmoney3);
			order.setDesignmoney5(designmoney5);	
				}
		else if("4".equals(type)){
			order.setOrderfirstpaperflag(orderfirstpaperflag);
			order.setOrderendpaperflag(orderendpaperflag);
			order.setOrdercodeflag(ordercodeflag);
			order.setOrderendpayflag(orderendpayflag);
		}
		else if("5".equals(type)){
			order.setOrderstatusflag(orderstatusflag);
		}
		else if("6".equals(type)){
			order.setPayfirstflag(payfirstflag);
			order.setPayendflag(payendflag);
			order.setPaycodeflag(paycodeflag);
			order.setPayendpayflag(payendpayflag);
		}
		else if("7".equals(type)){
			order.setPaystatusflag(paystatusflag);
		}
		
		
		orderMapper.updateByPrimaryKeySelective(order);
		
	}

}
