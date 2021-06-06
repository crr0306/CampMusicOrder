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
<style type="text/css">
.logDiv a {color:#fff}
</style>
<script type="text/javascript">
var ctx = '${pageContext.request.contextPath}';
</script>
<script type="text/javascript" >

function changeyanz(obj){
	  //obj.attr("src",url:ctx+"/kaptcha/code.html?d="+new Date().getTime());
	 $(obj).attr("src",ctx+"/kaptcha/code.html?d="+new Date().getTime());
	}
	
	
function login(){
	var name = $("#name").val();
	var username = $("#username").val();
	var password = $("#password").val();
	var code = $("#code").val();
	var password2 = $("#password2").val();
	
	var sex = $("#sex").val();
	var age = $("#age").val();
	var phone = $("#phone").val();
	
	
	if(name==""){
		alert("请输入姓名");
		return false ;
	}
	if(username==""){
		alert("请输入用户名");
		return false ;
	}
	if(password==""){
		alert("请输入密码");
		return false ;
	}
	if(password!=password2){
		alert("2次密码不一致");
		return false ;
	}
	
	if($("#loginCodeFlag").val()=="1"&&code==""){
		alert("请输入验证码");
		return false ;
	}
	
	if(sex==""){
		alert("请输入性别");
		return false ;
	}
	if(age==""){
		alert("请输入年龄");
		return false ;
	}
	if(phone==""){
		alert("请输入手机号");
		return false ;
	}
	
	var data = {name:name,username:username,password:password,code:code,
			sex:sex,age:age,phone:phone,
	};
	$.ajax({
		url:ctx+"/login/register.html",
		type:"post",
		data:data,
		success:function(data){
			if("ok"==data){
				alert("注册成功");
				window.location.href=ctx+"/login/toLogin.html";
			}
			else if("codeerror"==data){
				alert("验证码错误");
			}
			else{
				alert("用户名已存在，请重新注册");
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


request.getSession().setAttribute("loginCodeFlag", MyConstant.loginCodeFlag);
request.getSession().setAttribute("xssFlag", MyConstant.xssFlag);
request.getSession().setAttribute("pwdMd5Flag", MyConstant.pwdMd5Flag);
%>

</head>

<body class="loginpage">
	<div class="loginbox">
    	<div class="loginboxinner">
        	
            <div class="logo">
            	<h1 class="logo">注册</h1>
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
                    	<input type="text" name="name" id="name"  placeholder="姓名"/>
                    </div>
                </div>
                
                <div class="username">
                	<div class="usernameinner">
                    	<input type="text" name="username" id="username"  placeholder="用户名"/>
                    </div>
                </div>
                
                <div class="password">
                	<div class="passwordinner">
                    	<input type="password" name="password" id="password"  placeholder="密码"/>
                    </div>
                </div>
                <div class="password">
                	<div class="passwordinner">
                    	<input type="password" name="password2" id="password2"   placeholder="重复密码"/>
                    </div>
                </div>
                
                 <div class="password">
                	<div class="passwordinner">
                    	<select  name="sex" id="sex" style="height:45px;width:200px;">
                    		<option value="男">男</option>
                    		<option value="女">女</option>
                    	</select>
                    </div>
                </div>
                
                 <div class="password">
                	<div class="passwordinner">
                    	<input type="text" name="age" id="age"  placeholder="年龄"/>
                    </div>
                </div>
                
                 <div class="password">
                	<div class="passwordinner">
                    	<input type="text" name="phone" id="phone"  placeholder="手机号"/>
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
                  
                <button  onclick="login()">注册</button>
                <div style="color:#fff;text-align: center;margin-top:15px;" class="logDiv">
                <a href="../login/toLogin.html">登录</a>
                </div>
                <!-- <div class="keep"><input type="checkbox" /> 记住密码</div> -->
            
            <!-- </form> -->
            
        </div><!--loginboxinner-->
    </div><!--loginbox-->


</body>
</html>
