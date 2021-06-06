<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>

<script type="text/javascript">
var ctx = '${pageContext.request.contextPath}';
</script>

<script type="text/javascript" >
function logout(){
	var data = {};
	$.ajax({
		url:ctx+"/login/logout.html",
		type:"post",
		data:data,
		success:function(data){
			if("ok"==data){
				window.location.href="../login/toLogin.html";
			}else{
				alert("失败");
			}
		},
		error:function(XMLHttpRequest, textStatus, errorThrown) {
			alert("系统错误");
			//alert(XMLHttpRequest.status);
		}
	});
}
</script>
<body>

<div class="topheader">
        <div class="left">
            <h1 class="logo">${sysTitle }</h1>
            <br clear="all" />
        </div><!--left-->
        
        <div class="right">
            <div class="userinfo">
                <span>${login_user.name }</span>
                <span onclick="logout()">退出</span>
            </div><!--userinfo-->
          
        </div><!--right-->
    </div><!--topheader-->
    
</body>
</html>