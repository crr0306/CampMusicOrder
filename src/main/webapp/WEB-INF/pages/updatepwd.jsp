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
	var type = $("#type").val();
	window.location.href = ctx+"/user/list.html?type="+type;
	return false;
}

function save(){
	var oldpwd = $("#oldpwd").val();
	var newpwd = $("#newpwd").val();
	var newpwd2 = $("#newpwd2").val();
	if(oldpwd==""){
		alert("请输入原密码");
		return false ;
	}
	if(newpwd==""){
		alert("请输入新密码");
		return false ;
	}
	if(newpwd2==""){
		alert("请输入新密码");
		return false ;
	}
	if(newpwd!=newpwd2){
		alert("2次新密码输入不一致");
		return false ;
	}
	$.ajax({
		url:"../user/updatepwd",
		type:"post",
		data:{
			oldpwd:oldpwd,newpwd:newpwd
		},
		success:function(data){
			if("ok"==data){
				alert("修改成功");
				//window.location.href = ctx+"/user/list.html?type="+type;
				return false;
			}else{
				alert("旧密码错误");
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
	                   		 修改密码
                		</h3>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
                    	<p>
                        	<label>原密码</label>
                            <span class="field"><input type="text" name="oldpwd" id="oldpwd" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>新密码</label>
                            <span class="field"><input type="text" name="newpwd" id="newpwd" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>重复新密码</label>
                            <span class="field"><input type="text" name="newpwd2" id="newpwd2" class="longinput" /></span>
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