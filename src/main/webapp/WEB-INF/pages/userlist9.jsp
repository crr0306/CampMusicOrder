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
function toAdd(){
	window.location.href = ctx+"/user/toAdd9.html?selectType="+$("#selectType").val();
	return false;
}

 function toUpdate(id){
	window.location.href = ctx+"/user/toUpdate9.html?id="+id+"&selectType="+$("#selectType").val();
	return false;
}

function toDetail(id){
	window.location.href = "../user/toDetail.html?id="+id+"&selectType="+$("#selectType").val();
}

function toDelete(id){
	$.ajax({
		url:"../user/toDelete.html",
		type:"post",
		data:{id:id},
		success:function(data){
			if("ok"==data){
				alert("删除成功");
				window.location.href=ctx+"/user/list9.html?selectType="+$("#selectType").val();
			}else{
				alert("删除失败");
			}
		},
		error:function(data){
			alert("系统错误");
		}
	});
} 

function toResetPwd(id){
	$.ajax({
		url:"../user/resetPwd.html",
		type:"post",
		data:{id:id},
		success:function(data){
			if("ok"==data){
				alert("密码重置成功");
				return false;
			}else{
				alert("密码重置失败");
			}
		},
		error:function(data){
			alert("系统错误");
		}
	});
	return false;
}

function select(){
	$("#sForm").submit();
}
</script>
</head>
<body class="withvernav">
<div class="bodywrapper">
    <%@ include file="head.jsp" %>
    <%@ include file="left.jsp" %>
        
    <form method="post" action="${pageContext.request.contextPath}/user/list9.html" id="sForm">
    <div class="centercontent tables">
    
       <div id="contentwrapper" class="contentwrapper">
                        
                <div class="contenttitle2">
                	<h3>
                	${userTitle9 }管理
                	</h3>
                </div><!--contenttitle-->
                
                <div class="tableoptions">
                    <!-- <select class="radius3">
                    	<option value="">Show All</option>
                        <option value="">Rendering Engine</option>
                        <option value="">Platform</option>
                    </select> &nbsp; -->
                                                           姓名&nbsp;
                    <input type="text" name="name" value="${name }" style="width:100px;"/>&nbsp;
                    <button class="radius3" onclick="select()">查询</button>&nbsp;
                    <button class="radius3" onclick="return toAdd()">新增</button>&nbsp;
                    <input type="hidden" value="${selectType }" id="selectType" name="selectType"/>
                </div>
                
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable2">
                    <colgroup>
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                            <th class="head0" width="100px;">用户名</th>
                           <!--  <th class="head1" width="100px;">密码</th> -->
                            <th class="head0" width="100px;">姓名</th>
                            <th class="head1" width="100px;">手机号</th>
                            <th class="head0" width="100px;">性别</th>
                            <th class="head1" width="100px;">年龄</th>
                           <!--  <th class="head0" width="100px;">职位</th> -->
                            <th class="head1" width="100px;">操作</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${list}" var="o">
                        <tr class="gradeX">
                            <td>${o.username }</td>
                           <%--  <td>${o.password }</td> --%>
                            <td>${o.name }</td>
                            <td>${o.phone }</td>
                            <td>${o.sex }</td>
                            <td>${o.age }</td>
                          <%--   <td>
                            	${o.job }
                            </td> --%>
                            <td>
                            <button  onclick="return toUpdate('${o.id}')">修改</button>
                            <button  onclick="return toResetPwd('${o.id}')">重置密码</button>
                            <button  onclick="return toDelete('${o.id}')" >删除</button>
                            </td>
                        </tr>
 					</c:forEach>
                    </tbody>
                </table>
                
                <input type="hidden" value="${page.currentpage }" name="currentpage" id="currentpage" />
				<input type="hidden" value="${page.totalPages }" name="totalPages" id="totalPages"  />
                <%@ include file="common/pageFoot.jsp" %>
                
                </div>
        
	</div><!-- centercontent -->
    </form>
    
</div><!--bodywrapper-->

</body>
</html>