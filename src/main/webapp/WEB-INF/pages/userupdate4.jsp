<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>首页</title>
<script type="text/javascript">
function back(){
	window.location.href = ctx+"/user/list3.html";
	return false;
}

function save(){
	var id = $("#id").val();
	

	var info =new Array();  
	$('input[name="salarymonth"]').each(function(i,e){
		var object = new Object();  
		object.salarymonth = $(e).val();  
		object.salary1 = $('input[name="salary1"]').eq(i).val();  
		object.salary2 = $('input[name="salary2"]').eq(i).val(); 
		object.salary3 = $('input[name="salary3"]').eq(i).val(); 
		info.push(object);
	});
	
	
	$.ajax({
		url:"../user/update3.html",
		type:"post",
		data:{
			"id":id,
			"info":JSON.stringify(info)
			
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
				window.location.href = ctx+"/user/list3.html";
				return false;
			}else{
				alert("用户名已存在");
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



function addinfo(o,type){
	var str = ' <span> '+
	' &nbsp;&nbsp;&nbsp;&nbsp;月份 '+
	' <input   class="Wdate" onfocus="WdatePicker({dateFmt:\'yyyy-MM\',readOnly:true})"   type="text" value="${o2.salarymonth}"    name="salarymonth" id="salarymonth" style="width:10%" class="longinput" />  '+
	' &nbsp;&nbsp;&nbsp;&nbsp;基本工资 '+
	' <input type="text"   name="salary1" id="salary1" style="width:10%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp;绩效 '+
	' <input type="text"    name="salary2" id="salary2" style="width:10%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp;全勤奖 '+
	' <input type="text"    name="salary3" id="salary3" style="width:10%" class="longinput" /> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' <button class="submit radius2" onclick="return addinfo(this,2)" >新增</button> '+
	' &nbsp;&nbsp;&nbsp;&nbsp; '+
	' <button class="submit radius2" onclick="return delinfo(this)" >删除</button> '+
	' <br><br> '+
	' </span> ';
         if(1==type){
        	 $(o).parent().parent().append(str);
         }else{
        	 $(o).parent().after(str);
         }
	 
	    return false;
}

function delinfo(o){
	if($('input[name="salary1"]').length==1){return false;}
	$(o).parent().remove();
	return false;
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
	                 		薪酬管理
                		</h3>
                		 <input type="hidden" value="${o.id }" name="id" id="id"/>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
                        <p>
                        	<label>姓名</label>
                            <span class="field"><input disabled="disabled" type="text" value="${o.name }"  name="name" id="name" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>手机号</label>
                            <span class="field"><input disabled="disabled"  type="text" value="${o.phone }"  name="phone" id="phone" class="longinput" /></span>
                        </p>
                       
                       
                        <p>
                        	<label>部门</label>
                            <span class="field">
                            <select disabled="disabled"  name="deptid" id="deptid">
                            	<option value="">请选择</option>
                            	<c:forEach items="${deptlist}" var="o2">
                                <option value="${o2.id }" <c:if test="${o.deptid eq o2.id}">selected="selected"</c:if>>${o2.name }</option>
                                </c:forEach>
                            </select>
                            </span>
                        </p>
                        
                        <p>
                        	<label>岗位</label>
                            <span class="field"><input disabled="disabled"  value="${o.job }" type="text" name="job" id="job" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>基本工资</label>
                            <span class="field"><input disabled="disabled"  value="${o.salary }"  type="text" name="salary" id="salary" class="longinput" /></span>
                        </p>
                        
                        <p>
                        	<label>工资</label>
                        <span class="field" id="infospan">
                            
                            <c:forEach items="${detaillist}" var="o2">
                            	<span>
	                             &nbsp;&nbsp;&nbsp;&nbsp;月份
	                             <input  disabled="disabled"    class="Wdate" onfocus="WdatePicker({dateFmt:'yyyy-MM',readOnly:true})"   type="text" value="${o2.salarymonth}"    name="salarymonth" id="salarymonth" style="width:10%" class="longinput" /> 
	                            &nbsp;&nbsp;&nbsp;&nbsp;基本工资
	                            <input  disabled="disabled"    type="text" value="${o2.salary1 }"   name="salary1" id="salary1" style="width:10%" class="longinput" />
	                            &nbsp;&nbsp;&nbsp;&nbsp;绩效
	                            <input   disabled="disabled"   type="text" value="${o2.salary2 }"   name="salary2" id="salary2" style="width:10%" class="longinput" />
	                            &nbsp;&nbsp;&nbsp;&nbsp;全勤奖
	                            <input   disabled="disabled"   type="text" value="${o2.salary3 }"   name="salary3" id="salary3" style="width:10%" class="longinput" />
	                             <br><br>
	                             </span>
                            </c:forEach>
                            </span>
                        </p>
                        
                    </form>
					
                    <br />

</div>
</div>
</div>
</div>
</body>
</html>