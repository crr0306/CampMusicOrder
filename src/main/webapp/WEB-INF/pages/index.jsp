<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/common/cpts/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/js/jquery.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body class="withvernav">
<div class="bodywrapper">
    <%@ include file="head.jsp" %>
    <%@ include file="left.jsp" %>
        
    <div class="centercontent tables">
    
        <div class="pageheader notab">
            <h1 class="pagetitle">欢迎光临${sysTitle }</h1>
            <%--  <img
							  src="${pageContext.request.contextPath}/assets/1.jpg"
						width="100%"  height="900px"
							/> --%>
        </div><!--pageheader-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>