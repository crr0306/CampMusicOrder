<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/common/cpts/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/common/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
var ctx = '${pageContext.request.contextPath}';
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script type="text/javascript">
function back(){
	window.location.href = ctx+"/order/list2.html";
	return false;
}

function updatePartInfo(type){
	
	var papermoney1 = $("#papermoney1").val();
	var papermoney2 = $("#papermoney2").val();
	var papermoney3 = $("#papermoney3").val();
	var papermoney4 = $("#papermoney4").val();
	var papermoney5 = $("#papermoney5").val();
	var papermoney6 = $("#papermoney6").val();
	var writemoney1 = $("#writemoney1").val();
	var writemoney2 = $("#writemoney2").val();
	var writemoney3 = $("#writemoney3").val();
	var writemoney5 = $("#writemoney5").val();
	var designmoney1 = $("#designmoney1").val();
	var designmoney2 = $("#designmoney2").val();
	var designmoney3 = $("#designmoney3").val();
	var designmoney5 = $("#designmoney5").val();
	
	
	var orderfirstpaperflag = $("#orderfirstpaperflag").is(':checked')?'1':'0';
	var orderendpaperflag = $("#orderendpaperflag").is(':checked')?'1':'0';
	var ordercodeflag = $("#ordercodeflag").is(':checked')?'1':'0';
	var orderendpayflag = $("#orderendpayflag").is(':checked')?'1':'0';
	var orderstatusflag = $("#orderstatusflag").val();
	
	var payfirstflag = $("#payfirstflag").is(':checked')?'1':'0';
	var payendflag = $("#payendflag").is(':checked')?'1':'0';
	var paycodeflag = $("#paycodeflag").is(':checked')?'1':'0';
	var payendpayflag = $("#payendpayflag").is(':checked')?'1':'0';
	var paystatusflag = $("#paystatusflag").val();
	
	 var data = {
				"id":$("#id").val(),	
					"papermoney1":papermoney1,
					"papermoney2":papermoney2,
					"papermoney3":papermoney3,
					"papermoney4":papermoney4,
					"papermoney5":papermoney5,
					"papermoney6":papermoney6,
					"writemoney1":writemoney1,
					"writemoney2":writemoney2,
					"writemoney3":writemoney3,
					"writemoney5":writemoney5,
					"designmoney1":designmoney1,
					"designmoney2":designmoney2,
					"designmoney3":designmoney3,
					"designmoney5":designmoney5,
					"orderfirstpaperflag":orderfirstpaperflag,
					"orderendpaperflag":orderendpaperflag,
					"ordercodeflag":ordercodeflag,
					"orderendpayflag":orderendpayflag,
					"orderstatusflag":orderstatusflag,
					"payfirstflag":payfirstflag,
					"payendflag":payendflag,
					"paycodeflag":paycodeflag,
					"payendpayflag":payendpayflag,
					"paystatusflag":paystatusflag,
					"type":type
				}
		 ;
		$.ajax({
			url:"../order/updatePartInfo",
			type:"post",
			data:data,
			success:function(data){
				if("ok"==data){
					alert("修改成功");
					return false;
				}
			},
			error:function(data){
				alert("系统错误");
				return false ;
			}
		});
		return false;
	
}

function save(type,o){

	var orderno = $("#orderno").val();
	var title = $("#title").val();
	var major = $("#major").val();
	var majortype = $("#majortype").val();
	var remark = $("#remark").val();
	 var paperflag = $("#paperflag").is(':checked')?'1':'0';
	var opentitleflag = $("#opentitleflag").is(':checked')?'1':'0';
	var designflag = $("#designflag").is(':checked')?'1':'0';
	
	//var customflag = $("#customflag").is(':checked')?'1':'0';
	var reduceweightflag = $("#reduceweightflag").is(':checked')?'1':'0';
	var typesetflag = $("#typesetflag").is(':checked')?'1':'0';
	var embellishflag = $("#embellishflag").is(':checked')?'1':'0';
	var foreignflag = $("#foreignflag").is(':checked')?'1':'0';
	var literatureflag = $("#literatureflag").is(':checked')?'1':'0';
	var customdesc = $("#customdesc").val();
	
	var wordnum = $("#wordnum").val();
	var dupcheck = $("#dupcheck").val();
	var dupval = $("#dupval").val();
	var school = $("#school").val();
	var papermoney1 = $("#papermoney1").val();
	var papermoney2 = $("#papermoney2").val();
	var papermoney3 = $("#papermoney3").val();
	var papermoney4 = $("#papermoney4").val();
	var papermoney5 = $("#papermoney5").val();
	var papermoney6 = $("#papermoney6").val();
	var writemoney1 = $("#writemoney1").val();
	var writemoney2 = $("#writemoney2").val();
	var writemoney3 = $("#writemoney3").val();
	var writemoney5 = $("#writemoney5").val();
	var designmoney1 = $("#designmoney1").val();
	var designmoney2 = $("#designmoney2").val();
	var designmoney3 = $("#designmoney3").val();
	var designmoney5 = $("#designmoney5").val();
	
	var paperoutflag = $("#paperoutflag").is(':checked')?'1':'0';
	var designoutflag = $("#designoutflag").is(':checked')?'1':'0';
	var orderendflag = $('input[name="orderendflag"]:checked').val();
	
	var orderfirstpaperflag = $("#orderfirstpaperflag").is(':checked')?'1':'0';
	var orderendpaperflag = $("#orderendpaperflag").is(':checked')?'1':'0';
	var ordercodeflag = $("#ordercodeflag").is(':checked')?'1':'0';
	var orderendpayflag = $("#orderendpayflag").is(':checked')?'1':'0';
	var orderstatusflag = $("#orderstatusflag").val();
	
	var payfirstflag = $("#payfirstflag").is(':checked')?'1':'0';
	var payendflag = $("#payendflag").is(':checked')?'1':'0';
	var paycodeflag = $("#paycodeflag").is(':checked')?'1':'0';
	var payendpayflag = $("#payendpayflag").is(':checked')?'1':'0';
	var paystatusflag = $("#paystatusflag").val();
	
	var paperoutdate = $("#paperoutdate").val();
	var designoutdate = $("#designoutdate").val();
	
	var fileurl = $("#fileurl").val();
	var desc = $("#desc").val();

	
	var deliveryInfo =new Array();  
	$('input[name="deliverydate"]').each(function(i,e){
		var object = new Object();  
		object.deliverydate = $(e).val();  
		object.deliverycontent = $('input[name="deliverycontent"]').eq(i).val();  
		deliveryInfo.push(object);
	});
	//alert(JSON.stringify(deliveryInfo));
	
	var custInfo =new Array();  
	$('input[name="custqq"]').each(function(i,e){
		var object = new Object();  
		object.custqq = $(e).val();  
		object.custwechat = $('input[name="custwechat"]').eq(i).val();  
		object.custphone = $('input[name="custphone"]').eq(i).val(); 
		object.custmoney = $('input[name="custmoney"]').eq(i).val(); 
		custInfo.push(object);
	});
	
	var writeInfo =new Array();  
	$('input[name="writeqq"]').each(function(i,e){
		var object = new Object();  
		object.writeqq = $(e).val();  
		object.writewechat = $('input[name="writewechat"]').eq(i).val();  
		object.writephone = $('input[name="writephone"]').eq(i).val(); 
		object.writemoney = $('input[name="writemoney"]').eq(i).val(); 
		writeInfo.push(object);
	});
	
	var designInfo =new Array();  
	$('input[name="designqq"]').each(function(i,e){
		var object = new Object();  
		object.designqq = $(e).val();  
		object.designwechat = $('input[name="designwechat"]').eq(i).val();  
		object.designphone = $('input[name="designphone"]').eq(i).val(); 
		object.designmoney = $('input[name="designmoney"]').eq(i).val(); 
		designInfo.push(object);
	});
	
	var ordernootherInfo =new Array();  
	$('input[name="ordernoother"]').each(function(i,e){
		var object = new Object();  
		object.ordernoother = $(e).val();  
		ordernootherInfo.push(object);
	});
	
	/* alert(JSON.stringify(deliveryInfo));
	alert(JSON.stringify(custInfo));
	alert(JSON.stringify(writeInfo));
	alert(JSON.stringify(designInfo));
	alert(JSON.stringify(ordernootherInfo)); */
	
	if(orderno==""){
		alert("请输入编号");
		return false ;
	}
	if(title==""){
		alert("请输入题目");
		return false ;
	}
	if(major==""){
		alert("请输入专业");
		return false ;
	}
	 if(majortype==""){
		alert("请输入种类");
		return false ;
	} 
	
/* 	if(papermoney1==""){
		alert("请输入论文定金");
		return false ;
	}
	if(papermoney2==""){
		alert("请输入论文总额");
		return false ;
	}
	if(papermoney3==""){
		alert("请输入论文已付");
		return false ;
	}
	if(papermoney3==""){
		alert("请输入论文退款");
		return false ;
	}
	if(papermoney5==""){
		alert("请输入论文剩余");
		return false ;
	}
	if(writemoney1==""){
		alert("请输入写手定金");
		return false ;
	}
	if(writemoney2==""){
		alert("请输入写手总额");
		return false ;
	}
	if(writemoney3==""){
		alert("请输入写手已付");
		return false ;
	}
	if(writemoney5==""){
		alert("请输入写手剩余");
		return false ;
	}
	if(designmoney1==""){
		alert("请输入设计定金");
		return false ;
	}
	if(designmoney2==""){
		alert("请输入设计总额");
		return false ;
	}
	if(designmoney3==""){
		alert("请输入设计已付");
		return false ;
	}
	if(designmoney5==""){
		alert("请输入设计剩余");
		return false ;
	} */
	/* if(fileurl==""){
		alert("请输入文件地址");
		return false ;
	}
	if(desc==""){
		alert("请输入简介");
		return false ;
	}
	 */
	 var data = {
			"id":$("#id").val(),	
			 "orderno":orderno,
				"title":title,
				"major":major,
				"majortype":majortype,
				"remark":remark,
				"paperflag":paperflag,
				"opentitleflag":opentitleflag,
				"designflag":designflag,
				
				"reduceweightflag":reduceweightflag,
				"typesetflag":typesetflag,
				"embellishflag":embellishflag,
				"foreignflag":foreignflag,
				"literatureflag":literatureflag,
				"customdesc":customdesc,
				//"customflag":customflag,
				
				"wordnum":wordnum,
				"dupcheck":dupcheck,
				"dupval":dupval,
				"school":school,
				"papermoney1":papermoney1,
				"papermoney2":papermoney2,
				"papermoney3":papermoney3,
				"papermoney4":papermoney4,
				"papermoney5":papermoney5,
				"papermoney6":papermoney6,
				"writemoney1":writemoney1,
				"writemoney2":writemoney2,
				"writemoney3":writemoney3,
				"writemoney5":writemoney5,
				"designmoney1":designmoney1,
				"designmoney2":designmoney2,
				"designmoney3":designmoney3,
				"designmoney5":designmoney5,
				"paperoutflag":paperoutflag,
				"designoutflag":designoutflag,
				"orderendflag":orderendflag,
				"orderfirstpaperflag":orderfirstpaperflag,
				"orderendpaperflag":orderendpaperflag,
				"ordercodeflag":ordercodeflag,
				"orderendpayflag":orderendpayflag,
				"orderstatusflag":orderstatusflag,
				"payfirstflag":payfirstflag,
				"payendflag":payendflag,
				"paycodeflag":paycodeflag,
				"payendpayflag":payendpayflag,
				"paystatusflag":paystatusflag,
				
				"paperoutdate":paperoutdate,
				"designoutdate":designoutdate,
				
				"fileurl":fileurl,
				"desc":desc,
				"deliveryInfo":JSON.stringify(deliveryInfo),
				"custInfo":JSON.stringify(custInfo),
				"writeInfo":JSON.stringify(writeInfo),
				"designInfo":JSON.stringify(designInfo),
				"ordernootherInfo":JSON.stringify(ordernootherInfo)
			
			}
	 ;
	$.ajax({
		url:"../order/add2",
		type:"post",
		data:data,
		async: false,
		success:function(data){
			if("ok"==data){
				if("0"==type){
				alert("保存成功");
				}else{
					openqq(o);
				}
				//window.location.href = ctx+"/order/list2.html";
				return false;
			}else{
				alert("编号"+data+"不存在，无法填写。");
				return false ;
			}
		},
		error:function(data){
			alert("系统错误");
			return false ;
		}
	});
	return false;
}

function getOrderno(){
	if($("#id").val()==""){
	$("#orderno").val("");
	var major = $("#major").val();
	var majortype = $("#majortype").val();
	if(major!=""&&majortype!=""){
	var myDate = new Date(); //实例一个时间对象；
	var year = myDate.getFullYear();   //获取系统的年；
	var month = myDate.getMonth()+1;   //获取系统月份，由于月份是从0开始计算，所以要加1
	if(month<10){
		month = "0"+month;
	}
	var day = myDate.getDate(); // 获取系统日，
	if(day<10){
		day = "0"+day;
	}
	var hour = myDate.getHours(); //获取系统时，
	if(hour<=9){
		hour = "0"+hour;
	    }
	var minu = myDate.getMinutes(); //分
	if(minu<=9){
		minu = "0"+minu;
	    }
	var sec = myDate.getSeconds(); //秒
	if(sec<=9){
		sec = "0"+sec;
	    }
	var millsec = myDate.getMilliseconds(); //秒
	if(millsec<10){
		millsec = "00"+millsec;
	}
	if(millsec<100){
		millsec = "0"+millsec;
	}
	var code = major.split(",,,,")[1];
	var code2 = majortype.split(",,,,")[1];
	var orderno = code+"-"+year+month+day+"-"+code2+"-XXX";
	$("#orderno").val(orderno);
	}
	
	}
	
}


function adddelivery(o){
	var str = ' <span> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
 		 ' 交货日期 '+
   ' <input   class="Wdate" onfocus="WdatePicker({dateFmt:\'yyyy-MM-dd\',readOnly:true})"   type="text" name="deliverydate" id="deliverydate" style="width:10%" class="longinput" /> '+
    ' &nbsp;&nbsp;&nbsp;&nbsp; '+
 		  ' 交货内容 '+
   ' <input type="text" name="deliverycontent" id="deliverycontent" style="width:30%" class="longinput" /> '+
     ' &nbsp;&nbsp;&nbsp;&nbsp; '+
    ' <button class="submit radius2" onclick="return  adddelivery(this)" >新增</button> '+
     ' &nbsp;&nbsp;&nbsp;&nbsp; '+
    ' <button class="submit radius2" onclick="return deldelivery(this)" >删除</button> '+
    ' <br><br> '+
    ' </span> ';
    $(o).parent().after(str);
    return false;
}

function deldelivery(o){
	if($('input[name="deliverydate"]').length==1){return false;}
	$(o).parent().remove();
	return false;
}

function addwrite(o){
	var str = ' <span> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' qq '+
	' <input type="text" name="writeqq" id="writeqq" style="width:15%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' 微信 '+
	' <input type="text" name="writewechat" id="writewechat" style="width:15%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' 电话 '+
	' <input type="text" name="writephone" id="writephone" style="width:15%" class="longinput" /> '+
	'  &nbsp;&nbsp;&nbsp;&nbsp; '+
		' 付款信息 '+
 ' <input type="text" name="writemoney" id="writemoney" style="width:15%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' <button class="submit radius2" onclick="return addwrite(this)" >新增</button> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' <button class="submit radius2" onclick="return delwrite(this)" >删除</button> '+
	' <br><br> '+
	' </span> ';
	 $(o).parent().after(str);
	    return false;
}

function delwrite(o){
	if($('input[name="writeqq"]').length==1){return false;}
	$(o).parent().remove();
	return false;
}


function adddesign(o){
	var str = ' <span> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' qq '+
	' <input type="text" name="designqq" id="designqq" style="width:15%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' 微信 '+
	' <input type="text" name="designwechat" id="designwechat" style="width:15%" class="longinput" /> '+
    ' &nbsp;&nbsp;&nbsp;&nbsp; '+
    ' 电话 '+
    ' <input type="text" name="designphone" id="designphone" style="width:15%" class="longinput" /> '+
    ' &nbsp;&nbsp;&nbsp;&nbsp;'+
		' 付款信息'+
' <input type="text" name="designmoney" id="designmoney" style="width:15%" class="longinput" />'+
    ' &nbsp;&nbsp;&nbsp;&nbsp; '+
    ' <button class="submit radius2" onclick="return adddesign(this)" >新增</button> '+
    ' &nbsp;&nbsp;&nbsp;&nbsp; '+
     ' <button class="submit radius2" onclick="return deldesign(this)" >删除</button> '+
     ' <br><br> '+
     ' </span> ';
	 $(o).parent().after(str);
	    return false;
}

function deldesign(o){
	if($('input[name="designqq"]').length==1){return false;}
	$(o).parent().remove();
	return false;
}


function addorder(o){
	var str = ' <span> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' 订单编号 '+
	' <input type="text" name="ordernoother" id="ordernoother" style="width:15%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' <button class="submit radius2" onclick="return addorder(this)" >新增</button> '+
	'  &nbsp;&nbsp;&nbsp;&nbsp; '+
	' <button class="submit radius2" onclick="return delorder(this)" >删除</button> '+
	' <br><br> '+
	' </span> ';
	 $(o).parent().after(str);
	    return false;
}

function addorder2(o){
	var str = ' <span> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' 订单编号 '+
	' <input type="text" name="ordernoother" id="ordernoother" style="width:15%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' <button class="submit radius2" onclick="return addorder(this)" >新增</button> '+
	'  &nbsp;&nbsp;&nbsp;&nbsp; '+
	' <button class="submit radius2" onclick="return delorder(this)" >删除</button> '+
	' <br><br> '+
	' </span> ';
	 $(o).parent().parent().append(str);
	    return false;
}

function delorder(o){
	//if($('input[name="ordernoother"]').length==1){return false;}
	$(o).parent().remove();
	return false;
}



function openFileIIs(){   
	var filename = $("#fileurl").val();
    try{   
        var obj=new ActiveXObject("wscript.shell");   
        if(obj){   
            obj.Run("\""+filename+"\"", 1, false );  
            obj=null;   
        }   
    }catch(e){   
        alert("请确定是否存在该盘符或文件");   
    }  
    
    return false;
}  


function countpapermoney(o){
	var papermoney2 = $(o).parent().find('input[name="papermoney2"]').val();
	var papermoney1 = $(o).parent().find('input[name="papermoney1"]').val();
	var papermoney3 = $(o).parent().find('input[name="papermoney3"]').val();
	var papermoney4 = $(o).parent().find('input[name="papermoney4"]').val();
	var papermoney6 = $(o).parent().find('input[name="papermoney6"]').val();
	
	var papermoney5 = Number(papermoney2)- Number(papermoney1)-  Number(papermoney3)-  Number(papermoney4)-  Number(papermoney6);
	
	$(o).parent().find('input[name="papermoney5"]').val(papermoney5);
	
	return false;
}

function countwritemoney(o){
	var writemoney2 = $(o).parent().find('input[name="writemoney2"]').val();
	var writemoney3 = $(o).parent().find('input[name="writemoney3"]').val();
	
	var writemoney5 = Number(writemoney2)-  Number(writemoney3);
	
	$(o).parent().find('input[name="writemoney5"]').val(writemoney5);
	
	return false;
}


function countdesignmoney(o){
	var designmoney2 = $(o).parent().find('input[name="designmoney2"]').val();
	var designmoney3 = $(o).parent().find('input[name="designmoney3"]').val();
	
	var designmoney5 = Number(designmoney2)-  Number(designmoney3);
	
	$(o).parent().find('input[name="designmoney5"]').val(designmoney5);
	
	return false;
}

function openqq(o){
	var qq = $(o).parent().find('input[name="custqq"]').val();
    window.open('http://wpa.qq.com/msgrd?v=3&uin='+qq+'&site=qq&menu=yes','_brank');
}

</script>
</head>
<body class="withvernav">
<div class="bodywrapper">
<%@ include file="head.jsp" %>
<%@ include file="left.jsp" %>
<div class="centercontent">
<div id="contentwrapper" class="contentwrapper">
        	<div id="basicform" class="subcontent">
					<div class="contenttitle2">
                        <h3>
	                       订单新增
                		</h3>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
                    	<p>
                        	<label>编号</label>
                            <span class="field"><input type="text" readonly = "readonly" value="${o.orderno }" name="orderno" id="orderno" class="longinput" /></span>
                        </p>
                        	<p>
                        	<label>专业</label>
                            <span class="field">
                            <select name="major" id="major" onchange="getOrderno()">
                            <option value="">请选择</option>
							<c:forEach items="${majorlist}" var="o2">
							<option value="${o2.id },,,,${o2.code },,,,${o2.name }"  <c:if test="${o.majorid eq o2.id}">selected="selected"</c:if> >${o2.name }</option>
							</c:forEach>
							</select>
                            </span>
                        </p>
                    	<p>
                        	<label>种类</label>
                            <span class="field">
                             <select name="majortype" id="majortype" onchange="getOrderno()">
                            <option value="">请选择</option>
							<c:forEach items="${majortypelist}" var="o2">
							<option value="${o2.id },,,,${o2.code },,,,${o2.name }" <c:if test="${o.majortypeid eq o2.id}">selected="selected"</c:if> >${o2.name }</option>
							</c:forEach>
							</select>
                            </span>
                        </p>
                        
                    	<p>
                        	<label>题目</label>
                            <span class="field"><input type="text" value="${o.title }"  name="title" id="title" class="longinput" /></span>
                        </p>
                    
                    	<p>
                        	<label>备注</label>
                            <span class="field"><input type="text" value="${o.remark }"  name="remark" id="remark" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>要求</label>
                            <span class="field">
                            
                            &nbsp; &nbsp; &nbsp; &nbsp;
                             <input type="checkbox" name="paperflag" id="paperflag"  <c:if test="${o.paperflag eq '1'}">checked="checked"</c:if> /> 
                          	  论文
                            &nbsp; &nbsp; &nbsp; &nbsp;
                           <input type="checkbox" name="opentitleflag" id="opentitleflag"   <c:if test="${o.opentitleflag  eq '1'}">checked="checked"</c:if> /> 
                                                                                      开题
                                &nbsp; &nbsp; &nbsp; &nbsp;                                                       
                             <input type="checkbox" name="designflag" id="designflag"   <c:if test="${o.designflag eq '1'}">checked="checked"</c:if> /> 
                              	设计
                              	
                              	  &nbsp; &nbsp; &nbsp; &nbsp;                                                       
                             <input type="checkbox" name="reduceweightflag" id="reduceweightflag"   <c:if test="${o.reduceweightflag eq '1'}">checked="checked"</c:if> /> 
                              	降重
                              	  &nbsp; &nbsp; &nbsp; &nbsp;                                                       
                             <input type="checkbox" name="typesetflag" id="typesetflag"   <c:if test="${o.typesetflag eq '1'}">checked="checked"</c:if> /> 
                              	排版
                              	  &nbsp; &nbsp; &nbsp; &nbsp;                                                       
                             <input type="checkbox" name="embellishflag" id="embellishflag"   <c:if test="${o.embellishflag eq '1'}">checked="checked"</c:if> /> 
                              	润色
                              	  &nbsp; &nbsp; &nbsp; &nbsp;                                                       
                             <input type="checkbox" name="foreignflag" id="foreignflag"   <c:if test="${o.foreignflag eq '1'}">checked="checked"</c:if> /> 
                              	外文翻译
                              	  &nbsp; &nbsp; &nbsp; &nbsp;                                                       
                             <input type="checkbox" name="literatureflag" id="literatureflag"   <c:if test="${o.literatureflag eq '1'}">checked="checked"</c:if> /> 
                              	文献综述
                              	
                              	 &nbsp; &nbsp; &nbsp; &nbsp;	
                           <input  style="width:10%"  type="text" value="${o.customdesc }"  name="customdesc" id="customdesc" class="longinput" />
                            	  自定义
                            	  
                              <%--  &nbsp; &nbsp; &nbsp; &nbsp;	
                           <input type="checkbox" name="customflag" id="customflag"   <c:if test="${o.customflag  eq '1'}">checked="checked"</c:if> /> 
                            	  自定义 --%>
                            
                            
                            </span>
                        </p>
                    	
                    	<p>
                        	<label>交货信息</label>
                        <span class="field" id="deliveryspan">
                            
                             <c:if test="${ empty o.id }">
	                            <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 交货日期
	                            <input   class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"   type="text" name="deliverydate" id="deliverydate" style="width:10%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		  交货内容
	                            <input type="text" name="deliverycontent" id="deliverycontent" style="width:30%" class="longinput" />
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return adddelivery(this)" >新增</button>
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return deldelivery(this)" >删除</button>
	                             <br><br>
	                             </span>
                             </c:if>
                            
                            <c:if test="${not empty   o.id  }">
                            <c:forEach items="${itemlist}" var="o2">
                            	<span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 交货日期
	                            <input   class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"   type="text" value="<fmt:formatDate value="${o2.deliverydate}" pattern="yyyy-MM-dd"/>"   name="deliverydate" id="deliverydate" style="width:10%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		  交货内容
	                            <input type="text" value="${o2.content }"   name="deliverycontent" id="deliverycontent" style="width:30%" class="longinput" />
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return adddelivery(this)" >新增</button>
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return deldelivery(this)" >删除</button>
	                             <br><br>
	                             </span>
                            </c:forEach>
                             </c:if>
                            </span>
                        </p>
                    	
                    	<p>
                        	<label>字数</label>
                            <span class="field"><input type="text" value="${o.wordnum }"   name="wordnum" id="wordnum" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>查重</label>
                        	 <span class="field">
                             <select name="dupcheck" id="dupcheck" >
                            <option value="">请选择</option>
							<c:forEach items="${dupchecklist}" var="o2">
							<option value="${o2.id },,,,${o2.name }"  <c:if test="${o.dupcheckid eq o2.id}">selected="selected"</c:if> >${o2.name }</option>
							</c:forEach>
							</select>
                            </span>
                            
                        </p>
                    	<p>
                        	<label>查重值</label>
                            <span class="field"><input type="text" value="${o.dupval }"  name="dupval" id="dupval" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>学校</label>
                            <span class="field"><input type="text" value="${o.school }"  name="school" id="school" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>论文金钱信息</label>
                            <span class="field">
                            &nbsp;&nbsp;&nbsp;&nbsp;
                          		  定金
                            <input type="text" value="${o.papermoney1 }"  name="papermoney1" id="papermoney1" style="width:10%" class="longinput" />
                             &nbsp;&nbsp;&nbsp;&nbsp;
                          		  总额
                            <input type="text" value="${o.papermoney2 }"  name="papermoney2" id="papermoney2" style="width:10%" class="longinput" />
                             &nbsp;&nbsp;&nbsp;&nbsp;
                          		  已付
                            <input type="text" value="${o.papermoney3 }"  name="papermoney3" id="papermoney3" style="width:10%" class="longinput" />
                             &nbsp;&nbsp;&nbsp;&nbsp;
                          		退款
                            <input type="text" value="${o.papermoney4 }"  name="papermoney4" id="papermoney4" style="width:10%" class="longinput" />
                             &nbsp;&nbsp;&nbsp;&nbsp;
                          		代理费用
                            <input type="text" value="${o.papermoney6 }"  name="papermoney6" id="papermoney6" style="width:10%" class="longinput" />
                            &nbsp;&nbsp;&nbsp;&nbsp;
                          		剩余
                            <input type="text" value="${o.papermoney5 }"  name="papermoney5" id="papermoney5" style="width:10%" class="longinput" />
                            &nbsp;&nbsp;&nbsp;&nbsp;
	                        <button class="submit radius2" onclick="return countpapermoney(this)" >计算</button>
	                         &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return updatePartInfo('1')" >修改</button>  
                            </span>
                        </p>
                        
                        <p>
                        	<label>写手金钱信息</label>
                            <span class="field">
                           <%--  &nbsp;&nbsp;&nbsp;&nbsp;
                          		  定金
                            <input type="text" value="${o.writemoney1 }"  name="writemoney1" id="writemoney1" style="width:10%" class="longinput" /> --%>
                             &nbsp;&nbsp;&nbsp;&nbsp;
                          		  总额
                            <input type="text" value="${o.writemoney2 }"  name="writemoney2" id="writemoney2" style="width:10%" class="longinput" />
                             &nbsp;&nbsp;&nbsp;&nbsp;
                          		  已付
                            <input type="text" value="${o.writemoney3 }"  name="writemoney3" id="writemoney3" style="width:10%" class="longinput" />
                             
                            &nbsp;&nbsp;&nbsp;&nbsp;
                          		剩余
                            <input type="text" value="${o.writemoney5 }"  name="writemoney5" id="writemoney5" style="width:10%" class="longinput" />
                            
                             &nbsp;&nbsp;&nbsp;&nbsp;
	                        <button class="submit radius2" onclick="return countwritemoney(this)" >计算</button>
	                         &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return updatePartInfo('2')" >修改</button>  
                            </span>
                        </p>
                    	
                    	<p>
                        	<label>设计金钱信息</label>
                            <span class="field">
                          <%--   &nbsp;&nbsp;&nbsp;&nbsp;
                          		  定金
                            <input type="text" value="${o.designmoney1 }"  name="designmoney1" id="designmoney1" style="width:10%" class="longinput" /> --%>
                             &nbsp;&nbsp;&nbsp;&nbsp;
                          		  总额
                            <input type="text" value="${o.designmoney2 }"  name="designmoney2" id="designmoney2" style="width:10%" class="longinput" />
                             &nbsp;&nbsp;&nbsp;&nbsp;
                          		  已付
                            <input type="text" value="${o.designmoney3 }"  name="designmoney3" id="designmoney3" style="width:10%" class="longinput" />
                             
                            &nbsp;&nbsp;&nbsp;&nbsp;
                          		剩余
                            <input type="text" value="${o.designmoney5 }"  name="designmoney5" id="designmoney5" style="width:10%" class="longinput" />
                            
                             &nbsp;&nbsp;&nbsp;&nbsp;
	                        <button class="submit radius2" onclick="return countdesignmoney(this)" >计算</button>
	                         &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return updatePartInfo('3')" >修改</button>  
                            </span>
                        </p>
                    	
                    	
                    	<p>
                        	<label>客户信息</label>
                        <span class="field" id="">
                             <c:if test="${empty o.id }">
	                            <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 qq
	                            <input type="text" name="custqq" id="custqq" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 微信
	                            <input type="text" name="custwechat" id="custwechat" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		电话
	                            <input type="text" name="custphone" id="custphone" style="width:15%" class="longinput" />
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                          		付款信息
	                            <input type="text" name="custmoney" id="custmoney" style="width:15%" class="longinput" />
	                             </span>
                         </c:if>    
                            
                            
                             <c:if test="${not empty o.id }">
                            <c:forEach items="${emplist}" var="o2">
                             <c:if test="${o2.type eq '0'}">
                            	<span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 qq
	                            <input type="text" value="${o2.qq }" name="custqq" id="custqq" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 微信
	                            <input type="text" value="${o2.wechat }"  name="custwechat" id="custwechat" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		电话
	                            <input type="text" value="${o2.phone }"  name="custphone" id="custphone" style="width:15%" class="longinput" />
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                          		付款信息
	                            <input type="text" value="${o2.money }"  name="custmoney" id="custmoney" style="width:15%" class="longinput" />
	                             </span>
	                             </c:if>
                            </c:forEach>
                             </c:if>
                             
                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return save('1',this)" >弹出qq</button>
                            </span>
                        </p>
                        
                        <p>
                        	<label>写手信息</label>
                        <span class="field" id="">
                            
                             <c:if test="${empty o.id }">
	                            <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 qq
	                            <input type="text" name="writeqq" id="writeqq" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 微信
	                            <input type="text" name="writewechat" id="writewechat" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		电话
	                            <input type="text" name="writephone" id="writephone" style="width:15%" class="longinput" />
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                          		付款信息
	                            <input type="text" name="writemoney" id="writemoney" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return addwrite(this)" >新增</button>
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return delwrite(this)" >删除</button>
	                             <br><br>
	                             </span>
                             </c:if>
                             
                                <c:if test="${not empty o.id  }">
                            <c:forEach items="${emplist}" var="o2">
                             <c:if test="${o2.type eq '1'}">
                              <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 qq
	                            <input type="text" value="${o2.qq }"  name="writeqq" id="writeqq" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 微信
	                            <input type="text" value="${o2.wechat }"  name="writewechat" id="writewechat" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		电话
	                            <input type="text" value="${o2.phone }"  name="writephone" id="writephone" style="width:15%" class="longinput" />
	                            
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		付款信息
	                            <input type="text"  value="${o2.money }"  name="writemoney" id="writemoney" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return addwrite(this)" >新增</button>
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return delwrite(this)" >删除</button>
	                             <br><br>
	                             </span>
                             
                              </c:if>
                            </c:forEach>
                             </c:if>
                             
                             
                            </span>
                        </p>
                        
                         <p>
                        	<label>设计信息</label>
                        <span class="field" id="">
                            <c:if test="${empty o.id }">
	                            <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 qq
	                            <input type="text" name="designqq" id="designqq" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 微信
	                            <input type="text" name="designwechat" id="designwechat" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		电话
	                            <input type="text" name="designphone" id="designphone" style="width:15%" class="longinput" />
	                            
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		付款信息
	                            <input type="text" name="designmoney" id="designmoney" style="width:15%" class="longinput" />
	                            
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return adddesign(this)" >新增</button>
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return deldesign(this)" >删除</button>
	                             <br><br>
	                             </span>
                              </c:if>
                              
                                <c:if test="${not empty o.id  }">
                            <c:forEach items="${emplist}" var="o2">
                             <c:if test="${o2.type eq '2'}">
                              
                               <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 qq
	                            <input type="text"   value="${o2.qq }"   name="designqq" id="designqq" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 微信
	                            <input type="text"  value="${o2.wechat }"   name="designwechat" id="designwechat" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                          		电话
	                            <input type="text"   value="${o2.phone }"   name="designphone" id="designphone" style="width:15%" class="longinput" />
	                               &nbsp;&nbsp;&nbsp;&nbsp;
	                          		付款信息
	                            <input type="text"   value="${o2.money }"   name="designmoney" id="designmoney" style="width:15%" class="longinput" />
	                            
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return adddesign(this)" >新增</button>
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return deldesign(this)" >删除</button>
	                             <br><br>
	                             </span>
                              
                               </c:if>
                            </c:forEach>
                             </c:if>
                             
                             
                            </span>
                        </p>
                    	
                    	<p>
                        	<label>订单是否派出</label>
                            <span class="field">
                            
                            &nbsp; &nbsp; &nbsp; &nbsp;
                             <input type="checkbox" name="paperoutflag" id="paperoutflag"  <c:if test="${o.paperoutflag eq '1'}">checked="checked"</c:if> /> 
                          	  论文派出
                          	   &nbsp;&nbsp;&nbsp;&nbsp;
                          	   论文派出时间
                          	  <input   class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"   type="text" value="<fmt:formatDate value="${o.paperoutdate}" pattern="yyyy-MM-dd"/>"   name="paperoutdate" id="paperoutdate" style="width:10%" class="longinput" />
	                            
	                             
                            &nbsp; &nbsp; &nbsp; &nbsp;
                           <input type="checkbox" name="designoutflag" id="designoutflag"   <c:if test="${o.designoutflag  eq '1'}">checked="checked"</c:if> /> 
                                                                                     设计派出                                                         
                             &nbsp;&nbsp;&nbsp;&nbsp;
                             	设计派出时间        
                          	  <input   class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:true})"   type="text" value="<fmt:formatDate value="${o.designoutdate}" pattern="yyyy-MM-dd"/>"   name="designoutdate" id="designoutdate" style="width:10%" class="longinput" />
	                            
                            </span>
                        </p>
                    	
                    	<p>
                        	<label>订单是否完结</label>
                            <span class="field">
                            
                            &nbsp; &nbsp; &nbsp; &nbsp;
                             <input type="radio" name="orderendflag" id="orderendflag" value="1"  <c:if test="${o.orderendflag eq '1'}">checked="checked"</c:if> /> 
                          	 完成
                            &nbsp; &nbsp; &nbsp; &nbsp;
                           <input type="radio" name="orderendflag" id="orderendflag" value="0"     <c:if test="${o.orderendflag  eq '0'}">checked="checked"</c:if> /> 
                                                                                  未完成                                         
                            
                            </span>
                        </p>
                    	
                    	
                    	<p>
                        	<label>订单状态</label>
                            <span class="field">
                            
                            &nbsp; &nbsp; &nbsp; &nbsp;
                             <input type="checkbox" name="orderfirstpaperflag" id="orderfirstpaperflag"  <c:if test="${o.orderfirstpaperflag eq '1'}">checked="checked"</c:if> /> 
                          	初稿部分
                            &nbsp; &nbsp; &nbsp; &nbsp;
                           <input type="checkbox" name="orderendpaperflag" id="orderendpaperflag"   <c:if test="${o.orderendpaperflag  eq '1'}">checked="checked"</c:if> /> 
                                                                                 完稿部分                                 
                            &nbsp; &nbsp; &nbsp; &nbsp;
                             <input type="checkbox" name="ordercodeflag" id="ordercodeflag"  <c:if test="${o.ordercodeflag eq '1'}">checked="checked"</c:if> /> 
                          	代码部分
                            &nbsp; &nbsp; &nbsp; &nbsp;
                           <input type="checkbox" name="orderendpayflag" id="orderendpayflag"   <c:if test="${o.orderendpayflag  eq '1'}">checked="checked"</c:if> /> 
                                                                                 尾款部分               
                           &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return updatePartInfo('4')" >修改</button>                                                       
                            </span>
                        </p>
                        
                         <p>
                        	<label>订单状态</label>
                            <span class="field"><input type="text" value="${o.orderstatusflag }"   name="orderstatusflag" id="orderstatusflag" class="longinput" />
                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return updatePartInfo('5')" >修改</button>
                            </span>
                        </p>
                        
                        
                        <p>
                        	<label>付款状态</label>
                            <span class="field">
                            
                            &nbsp; &nbsp; &nbsp; &nbsp;
                             <input type="checkbox" name="payfirstflag" id="payfirstflag"  <c:if test="${o.payfirstflag eq '1'}">checked="checked"</c:if> /> 
                          	初稿部分
                            &nbsp; &nbsp; &nbsp; &nbsp;
                           <input type="checkbox" name="payendflag" id="payendflag"   <c:if test="${o.payendflag  eq '1'}">checked="checked"</c:if> /> 
                                                                                 完稿部分                                 
                            &nbsp; &nbsp; &nbsp; &nbsp;
                             <input type="checkbox" name="paycodeflag" id="paycodeflag"  <c:if test="${o.paycodeflag eq '1'}">checked="checked"</c:if> /> 
                          	代码部分
                            &nbsp; &nbsp; &nbsp; &nbsp;
                           <input type="checkbox" name="payendpayflag" id="payendpayflag"   <c:if test="${o.payendpayflag  eq '1'}">checked="checked"</c:if> /> 
                                                                                 尾款部分               
                           &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return updatePartInfo('6')" >修改</button>                                                       
                            </span>
                        </p>
                        
                         <p>
                        	<label>付款状态</label>
                            <span class="field"><input type="text" value="${o.paystatusflag }"   name="paystatusflag" id="paystatusflag" class="longinput" />
                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return updatePartInfo('7')" >修改</button>
                            </span>
                        </p>
                        
                    	<p>
                        	<label>简介</label>
                            <span class="field"><input type="text" value="${o.desc }"  name="desc" id="desc" class="longinput" /></span>
                        </p>
                        
                        <p>
                        	<label>文件地址</label>
                            <span class="field"><input type="text" value="${o.fileurl }"   name="fileurl" id="fileurl" class="longinput" />
                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return openFileIIs(this)" >打开</button>
                            </span>
                        </p>
                        
                        
                        <p>
                        	<label>一起的单子</label>
                        <span class="field" id="">
                         <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                            <button class="submit radius2" onclick="return addorder2(this)" >新增</button>
	                            <br><br>
	                            </span>
                            <c:if test="${empty o.id }">
	                            <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 订单编号
	                            <input type="text" name="ordernoother" id="ordernoother" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return addorder(this)" >新增</button>
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return delorder(this)" >删除</button>
	                             <br><br>
	                             </span>
                             </c:if>
                              <c:if test="${not empty o.id }">
                            <c:forEach items="${tolist}" var="o2">
                               <span>
	                            &nbsp;&nbsp;&nbsp;&nbsp;
	                          		 订单编号
	                            <input type="text" value="${o2.ordernoOther }"  name="ordernoother" id="ordernoother" style="width:15%" class="longinput" />
	                             &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return addorder(this)" >新增</button>
	                              &nbsp;&nbsp;&nbsp;&nbsp;
	                             <button class="submit radius2" onclick="return delorder(this)" >删除</button>
	                             <br><br>
	                             </span>
                             </c:forEach>
                             </c:if>
                             
                            </span>
                        </p>
                        
                        
                        <p>
                        	<label>提醒</label>
                            <span class="field" style="font-size:20px;">
                            ${warn }
                            </span>
                        </p>
                        
                        <p class="stdformbutton">
                        	<button class="submit radius2" onclick="return save('0',this)" >提交</button>
                            <input type="button" class="button" onclick="return back()" value="返回" />
                            <input type="hidden" value="${o.id }" id="id" name="id" />
                            
                        </p>
                    </form>
					
                    <br />

</div>
</div>
</div>
</div>
</body>
</html>