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
function toAdd(){
	window.location.href = ctx+"/tblbookingsongs/toAdd.html";
	return false;
}

 function toUpdate(id){
	window.location.href = ctx+"/tblbookingsongs/toUpdate.html?id="+id;
	return false;
}

function toDetail(id){
	window.location.href = "../tblbookingsongs/toDetail.html?id="+id;
}

function toDelete(id){
	$.ajax({
		url:"../tblbookingsongs/toDelete.html",
		type:"post",
		data:{id:id},
		success:function(data){
			if("ok"==data){
				alert("删除成功");
				window.location.href=window.location.href;
			}else{
				alert("删除失败");
			}
		},
		error:function(data){
			alert("系统错误");
		}
	});
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
        
    <form method="post" action="${pageContext.request.contextPath}/tblbookingsongs/list.html" id="sForm">
    <div class="centercontent tables">
    
       <div id="contentwrapper" class="contentwrapper">
                        
                <div class="contenttitle2">
                	<h3>
	                	预约点歌管理查询
                	
                	</h3>
                </div><!--contenttitle-->
                
                <div class="tableoptions">
                    <!-- <select class="radius3">
                    	<option value="">Show All</option>
                        <option value="">Rendering Engine</option>
                        <option value="">Platform</option>
                    </select> &nbsp; -->
                  	  歌曲名称&nbsp;
                    <input type="text" name="colsongname" value="${colsongname}" style="width:100px;"/>&nbsp;
                                                           
                    <button class="radius3" onclick="select()">查询</button>&nbsp;
                    <button class="radius3" onclick="return toAdd()">新增</button>&nbsp;
                </div>
                
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable2">
                    <colgroup>
                        <col class="con0" />
                        <col class="con0" />
                        <col class="con0" />
                        <col class="con0" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
						   <!--  <th class="head0" width="100px;">歌曲ID</th> -->
						    <th class="head0" width="100px;">歌曲名称</th>
						    
						    
						     <th class="head0" width="100px;">点歌人</th>
						      <th class="head0" width="100px;">点歌时间</th>
						      
						      
						    <th class="head0" width="100px;">预约时间</th>
						    <th class="head0" width="100px;">点歌状态</th>
						    <th class="head0" width="100px;">处理反馈结果</th>
						    <th class="head0" width="100px;">操作</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${list}" var="o">
                        <tr class="gradeX">
                        	<%-- <td>${o.colsongid }</td> --%>
                        	<td>${o.colsongname }</td>
                        	
                        	 <td>${o.createusername }</td>
                        	   <td><fmt:formatDate value="${o.createdate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        	
                        	<td>${o.colapptime }</td>
                        	<td>${o.coltype }</td>
                        	<td>${o.colresult }</td>
                            <td>
                            <button  onclick="return toUpdate('${o.id}')">修改</button>
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