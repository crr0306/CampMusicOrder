<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/common/cpts/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/js/jquery.min.js"></script>
<script type="text/javascript">
var ctx = '${pageContext.request.contextPath}';
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script type="text/javascript">
function back(){
	window.location.href = ctx+"/sysnotice/list.html";
	return false;
}

function save(){

	var title = $("#title").val();

	if(title==""){
		alert("请输入标题");
		return false ;
	}
	
	var content = $("#content").val();

	if(content==""){
		alert("请输入内容");
		return false ;
	}
	
	$.ajax({
		url:"../sysnotice/add",
		type:"post",
		data:{
			title:title,
			content:content
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
				window.location.href = ctx+"/sysnotice/list.html";
				return false;
			}else{
				alert("保存失败");
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
	                       公告新增
                		</h3>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
	                    	<p>
	                        	<label>标题</label>
	                            <span class="field"><input type="text" value="${o.title }" name="title" id="title" class="longinput" /></span>
	                        </p>
	                        
                        	<p>
                        	<label>内容</label>
                            <span class="field">
                            <textarea name="content" id="content" cols="10" rows="5" >${o.content }</textarea>
                            </span>
                        </p>
                        
                        <p class="stdformbutton">
                        	<button class="submit radius2" onclick="return save()" >提交</button>
                            <input type="button" class="button" onclick="return back()" value="返回" />
                        </p>
                    </form>
					
                    <br />

</div>
</div>
</div>
</div>
</body>
</html>