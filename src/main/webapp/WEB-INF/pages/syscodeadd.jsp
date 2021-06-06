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
	window.location.href = ctx+"/syscode/list.html";
	return false;
}

function save(){

	var name = $("#name").val();
	var code = $("#code").val();
	var type = $("#type").val();
	var remark = $("#remark").val();
	var desc_ = $("#desc_").val();
	var sort = $("#sort").val();
	if(name==""){
		alert("请输入名称");
		return false ;
	}
	if(code==""){
		alert("请输入编号");
		return false ;
	}
	if(type==""){
		alert("请输入类型");
		return false ;
	}

	
	$.ajax({
		url:"../syscode/add",
		type:"post",
		data:{
			name:name,
			code:code,
			type:type,
			remark:remark,
			desc_:desc_,
			sort:sort
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
				window.location.href = ctx+"/syscode/list.html";
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
	                       系统字典新增
                		</h3>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
                    	<p>
                        	<label>名称</label>
                            <span class="field"><input type="text" name="name" id="name" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>编号</label>
                            <span class="field"><input type="text" name="code" id="code" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>类型</label>
                            <span class="field"><input type="text" name="type" id="type" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>备注</label>
                            <span class="field"><input type="text" name="remark" id="remark" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>描述</label>
                            <span class="field"><input type="text" name="desc_" id="desc_" class="longinput" /></span>
                        </p>
                         <p>
                        	<label>排序</label>
                            <span class="field"><input type="text"  name="sort" id="sort" class="longinput" /></span>
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