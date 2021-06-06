<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>

<%@ page import="com.ssm.common.MyConstant" %>

<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/common/cpts/css/style.default.css" type="text/css" />
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/cpts/js/plugins/jquery-1.7.min.js"></script> --%>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/js/jquery.min.js"></script>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/cpts/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/cpts/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/cpts/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/cpts/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/common/cpts/js/custom/index.js"></script> --%>
<script type="text/javascript">
var ctx = '${pageContext.request.contextPath}';
</script>
<script type="text/javascript" >

function changeyanz(obj){
	  //obj.attr("src",url:ctx+"/kaptcha/code.html?d="+new Date().getTime());
	 $(obj).attr("src",ctx+"/kaptcha/code.html?d="+new Date().getTime());
	}
	
	
function login(){
	var username = $("#username").val();
	var password = $("#password").val();
	var type = $("#type").val();
	var code = $("#code").val();
	if($("#loginCodeFlag").val()=="1"&&code==""){
		alert("请输入验证码");
		return false ;
	}
	var data = {username:username,password:password,code:code,type:type};
	$.ajax({
		url:ctx+"/login/login.html",
		type:"post",
		data:data,
		success:function(data){
			if("ok"==data){
				alert("登录成功");
				window.location.href=ctx+"/login/toIndex.html";
			}
			else if("codeerror"==data){
				alert("验证码错误");
			}
			else{
				alert("登录失败");
			}
		},
		error:function(XMLHttpRequest, textStatus, errorThrown) {
			alert("系统错误");
			//alert(XMLHttpRequest.status);
		}
	});
	
	
	/* if(username=="admin"&&password=="admin"){
		alert("登录成功");
	}else{
		alert("登录失败");
	} */
}
</script>
<%
request.getSession().setAttribute("sysTitle", MyConstant.sysTitle);
request.getSession().setAttribute("userTitle1", MyConstant.userTitle1);
request.getSession().setAttribute("userTitle2", MyConstant.userTitle2);
request.getSession().setAttribute("userTitle7", MyConstant.userTitle7);

request.getSession().setAttribute("userTitle8", MyConstant.userTitle8);
request.getSession().setAttribute("userTitle9", MyConstant.userTitle9);
request.getSession().setAttribute("userTitle10", MyConstant.userTitle10);


request.getSession().setAttribute("loginCodeFlag", MyConstant.loginCodeFlag);
request.getSession().setAttribute("xssFlag", MyConstant.xssFlag);
request.getSession().setAttribute("pwdMd5Flag", MyConstant.pwdMd5Flag);

request.getSession().setAttribute("projectName", MyConstant.projectName);

%>
</head>

<body class="loginpage">

<!-- 
<body class="loginpage"  style="background-color:#F5F5F5  ;background-image:url(${pageContext.request.contextPath}/assets/2.jpg); background-repeat:no-repeat; background-attachment:fixed;background-size:cover;  background-position:center top; overflow:hidden;">
 -->
 
	<div class="loginbox">
    	<div class="loginboxinner">
        	
            <div class="logo">
            	<h1 class="logo">${sysTitle }</h1>
				<!-- <span class="slogan">后台管理系统</span> -->
            </div><!--logo-->
            
            <br clear="all" /><br />
            
            <%-- <div class="nousername">
				<div class="loginmsg">密码不正确.</div>
            </div><!--nousername-->
            
            <div class="nopassword">
				<div class="loginmsg">密码不正确.</div>
                <div class="loginf">
                    <div class="thumb"><img alt="" src="${pageContext.request.contextPath}/assets/common/cpts/images/thumbs/avatar1.png" /></div>
                    <div class="userlogged">
                        <h4></h4>
                        <a href="index.html">Not <span></span>?</a> 
                    </div>
                </div><!--loginf-->
            </div><!--nopassword--> --%>
            
           <!--  <form id="login" action="" method="post"> -->
            	
                <div class="username">
                	<div class="usernameinner">
                    	<input type="text" name="username" id="username" />
                    </div>
                </div>
                
                <div class="password">
                	<div class="passwordinner">
                    	<input type="password" name="password" id="password" />
                    </div>
                </div>
                
                  <div class="password">
                	<div class="passwordinner">
                    	<select  name="type" id="type" style="height:45px;width:200px;">
                    		<option value="0">管理员</option>
                    		<option value="1">${userTitle1 }</option>
                    		<option value="2">${userTitle2 }</option>
                    	</select>
                    </div>
                </div>
                
                
                <c:if test="${loginCodeFlag eq '1' }">
                 <div class="password">
                	<div class="passwordinner">
                	<input type="text" name="code" id="code" style="width:110px;" />
                	
                    	<img
							  src="${pageContext.request.contextPath}/kaptcha/code.html"
							  class="yanz_img"
							  onclick="changeyanz(this);"
							/>
                    </div>
                 </div>
                </c:if>
                
               
                   <input type="hidden" value="${loginCodeFlag }" id="loginCodeFlag" name="loginCodeFlag" />
                    
               
                
                
                <button  onclick="login()">登录</button>
                
                 <div style="color:#F8F8FF;text-align: center;margin-top:15px;" class="logDiv">
                <a  style="color:#F8F8FF;" href="/${projectName }/login/toRegister.html">注册</a>
                </div>
                <!-- <div class="keep"><input type="checkbox" /> 记住密码</div> -->
            
            <!-- </form> -->
            
        </div><!--loginboxinner-->
    </div><!--loginbox-->


</body>
</html>
