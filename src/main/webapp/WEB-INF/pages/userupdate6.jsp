<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/common/cpts/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/js/jquery.min.js"></script>
<script type="text/javascript">
var ctx = '${pageContext.request.contextPath}';
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script type="text/javascript">
function back(){
	window.location.href = ctx+"/user/list2.html";
	return false;
}

function save(){
	var name = $("#name").val();
	var phone = $("#phone").val();
	var sex = $("#sex").val();
	var age = $("#age").val();
	var job = $("#job").val();
	if(name==""){
		alert("请输入姓名");
		return false ;
	}
	$.ajax({
		url:"../user/update5.html",
		type:"post",
		data:{
			name:name,phone:phone,
			sex:sex,age:age,
			job:job,pic:$("#pic").val(),deptid:$("#deptid").val(),salary:$("#salary").val(),type2:$("#type2").val()
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
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
	                 		个人信息
                		</h3>
                		 <input type="hidden" value="${o.id }" name="id" id="id"/>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
					<p>
                        	<label>照片</label>
                            <span class="field"  id="picDiv">
                            <input type="file" id="picFile" name="picFile" onchange="uploadPic(this)" />
							<input type="hidden"  value="${o.pic }" id="pic" name="pic" />
							<br><br> 
							<img id="picShow" src="/pic/${o.pic }" height="150px;" width="150px;" />
                            </span>
                        </p>
                        
                    	<p>
                        	<label>用户名</label>
                            <span class="field"><input disabled="disabled"  type="text" value="${o.username }"  name="username" id="username" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>姓名</label>
                            <span class="field"><input   type="text" value="${o.name }"  name="name" id="name" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>手机号</label>
                            <span class="field"><input   type="text" value="${o.phone }"  name="phone" id="phone" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>性别</label>
                            <span class="field"><select  name="sex" id="sex">
                                <option value="男" <c:if test="${o.sex eq '男'}">selected="selected"</c:if>>男</option>
                                <option value="女" <c:if test="${o.sex eq '女'}">selected="selected"</c:if>>女</option>
                            </select></span>
                        </p>
                        <p>
                        	<label>年龄</label>
                            <span class="field"><input   type="text" value="${o.age }"  name="age" id="age" class="longinput" /></span>
                        </p>
                       
                       
                     <p>
                        	<label>部门</label>
                            <span class="field">
                            <select  disabled="disabled"   name="deptid" id="deptid">
                            	<option value="">请选择</option>
                            	<c:forEach items="${deptlist}" var="o2">
                                <option value="${o2.id }" <c:if test="${o.deptid eq o2.id}">selected="selected"</c:if>>${o2.name }</option>
                                </c:forEach>
                            </select>
                            </span>
                        </p>
                        
                        <p>
                        	<label>岗位</label>
                            <span class="field"><input  disabled="disabled"   value="${o.job }" type="text" name="job" id="job" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>基本工资</label>
                            <span class="field"><input  disabled="disabled"   value="${o.salary }"  type="text" name="salary" id="salary" class="longinput" /></span>
                        </p>
                        
                         <p>
                        	<label>状态</label>
                            <span class="field"><select  disabled="disabled"   name="type2" id="type2">
                                <option value="0" <c:if test="${o.type2 eq '0'}">selected="selected"</c:if>>在职</option>
                                <option value="1" <c:if test="${o.type2 eq '1'}">selected="selected"</c:if>>离职</option>
                            </select></span>
                        </p>
                        
                        
                       <p class="stdformbutton">
                        	<button class="submit radius2" onclick="return save()" >提交</button>
                        </p>
                    </form>
					
                    <br />

</div>
</div>
</div>
</div>
</body>
</html>