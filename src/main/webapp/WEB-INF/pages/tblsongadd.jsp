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
	window.location.href = ctx+"/tblsong/list.html";
	return false;
}

function save(){

	var colname = $("#colname").val();
	var colsinger = $("#colsinger").val();
	var colcomposingwords = $("#colcomposingwords").val();
	var colproductioncompany = $("#colproductioncompany").val();
	var collyric = $("#collyric").val();

	var songTypeId=$("#songTypeId").val();
    if(songTypeId==""){
        alert("请选择歌曲类型");
        return false ;
    }
	if(colname==""){
		alert("请输入歌曲名称");
		return false ;
	}
	if(colsinger==""){
		alert("请输入演唱者");
		return false ;
	}
	if(colcomposingwords==""){
		alert("请输入作词");
		return false ;
	}
	if(colproductioncompany==""){
		alert("请输入制作公司");
		return false ;
	}
	if(collyric==""){
		alert("请输入歌词");
		return false ;
	}
	
	$.ajax({
		url:"../tblsong/add",
		type:"post",
		data:{
			colname:colname,
			colsinger:colsinger,
			colcomposingwords:colcomposingwords,
			colproductioncompany:colproductioncompany,
			collyric:collyric,
            songTypeId:songTypeId,
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
				window.location.href = ctx+"/tblsong/list.html";
				return false;
			}
           else if("fail"==data){
                alert("保存失败,歌曲类型错误");

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
	                       歌曲管理新增
                		</h3>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
                        <p>
                            <label>歌曲类型</label>

                            <span class="field">
                            <select name="songTypeId" id="songTypeId">
                            	<option value="">请选择</option>
                            	<c:forEach items="${songTypelist}" var="o2">
                                    <option value="${o2.id }" >${o2.name }</option>
                                </c:forEach>
                            </select>
                            </span>

                        </p>
                    	<p>
                        	<label>歌曲名称</label>
                            <span class="field"><input type="text" name="colname" id="colname" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>演唱者</label>
                            <span class="field"><input type="text" name="colsinger" id="colsinger" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>作词</label>
                            <span class="field"><input type="text" name="colcomposingwords" id="colcomposingwords" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>制作公司</label>
                            <span class="field"><input type="text" name="colproductioncompany" id="colproductioncompany" class="longinput" /></span>
                        </p>
                    	<p>
                        	<label>歌词</label>
                            <span class="field"><input type="text" name="collyric" id="collyric" class="longinput" /></span>
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