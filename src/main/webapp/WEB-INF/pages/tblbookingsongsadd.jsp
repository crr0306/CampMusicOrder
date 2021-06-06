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
	window.location.href = ctx+"/tblbookingsongs/list.html";
	return false;
}

function save(){

	var colsongid = $("#colsongid").val();
	var colsongname = $("#colsongname").val();
	var colapptime = $("#colapptime").val();
	var coltype = $("#coltype").val();
	var colresult = $("#colresult").val();

	if(colsongid==""){
		alert("请输入歌曲ID");
		return false ;
	}
/* 	if(colsongname==""){
		alert("请输入歌曲名称");
		return false ;
	} */
	if(colapptime==""){
		alert("请输入预约时间");
		return false ;
	}
	/* if(coltype==""){
		alert("请输入点歌状态");
		return false ;
	}
	if(colresult==""){
		alert("请输入处理反馈结果");
		return false ;
	} */
	
	$.ajax({
		url:"../tblbookingsongs/add",
		type:"post",
		data:{
			colsongid:colsongid,
			colsongname:colsongname,
			colapptime:colapptime,
			coltype:coltype,
			colresult:colresult,
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
				window.location.href = ctx+"/tblbookingsongs/list.html";
				return false;
			}	else if("exist"==data){
                alert("已存在其他同学添加这首歌曲");
                window.location.href = ctx+"/tblbookingsongs/list.html";
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
	                       预约点歌管理新增
                		</h3>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
					
					<p>
                        	<label>歌曲</label>
                            <span class="field">
                            <select  name="colsongid" id="colsongid">
                            	<option value="">请选择</option>
                            	<c:forEach items="${list}" var="o2">
                                <option value="${o2.id }" <c:if test="${o.colsongid eq o2.id}">selected="selected"</c:if>>${o2.colname }</option>
                                </c:forEach>
                            </select>
                            </span>
                        </p>
                        
                        
                        <!-- 
                    	<p>
                        	<label>歌曲ID</label>
                            <span class="field"><input type="text" name="colsongid" id="colsongid" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>歌曲名称</label>
                            <span class="field"><input type="text" name="colsongname" id="colsongname" class="longinput" /></span>
                        </p> -->
                    	<p>
                        	<label>预约时间</label>
                            <span class="field"><input type="text" name="colapptime" id="colapptime" class="longinput" /></span>
                        </p>
                    <!-- 	<p>
                        	<label>点歌状态</label>
                            <span class="field"><input type="text" name="coltype" id="coltype" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>处理反馈结果</label>
                            <span class="field"><input type="text" name="colresult" id="colresult" class="longinput" /></span>
                        </p> -->
                        
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