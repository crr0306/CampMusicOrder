<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/common/cpts/css/style.default.css" type="text/css" />

<script src="${pageContext.request.contextPath}/assets/common/js/jquery-1.10.1.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/common/js/ajaxfileupload.js"></script>
<script src="${pageContext.request.contextPath}/assets/common/js/side.js" type="text/javascript"></script>

<script type="text/javascript">
var ctx = '${pageContext.request.contextPath}';
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<script type="text/javascript">

function uploadPic(o){
	$.ajaxFileUpload({  
	    type: "POST",  
	    url: "../upload/pic.html",  
	    //data:{},//要传到后台的参数，没有可以不写  
	    secureuri : false,//是否启用安全提交，默认为false  
	    fileElementId:'picFile',//文件选择框的id属性  
	    dataType: 'json',//服务器返回的格式  
	    async : false,  
	    success: function(data){ 
	        if(data.result=='success'){  
	        	$("#picShow").remove();
	        	var html = '<img id="picShow" src="/pic/'+data.msg+'" height="150px;" width="150px;" />';
	        	$("#picDiv").append(html);
	        	$("#pic").val(data.msg);
	        }else{  
	        } 
	    },  
	    error: function (data, status, e){  
	    }  
	});
} 

function back(){
	window.location.href = ctx+"/user/list.html?selectType="+$("#selectType").val();
	return false;
}

function save(){
	var name = $("#name").val();
	var phone = $("#phone").val();
	var sex = $("#sex").val();
	var age = $("#age").val();
	if(name==""){
		alert("请输入姓名");
		return false ;
	}
	$.ajax({
		url:"../user/update5.html",
		type:"post",
		data:{
			name:name,phone:phone,
			sex:sex,age:age,
			pic:$("#pic").val()
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
				return false;
			}else{
				alert("用户名已存在");
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
	                 个人信息
                	
                		</h3>
                		 <input type="hidden" value="${o.id }" name="id" id="id"/>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
					
					<p>
                        	<label>照片</label>
                            <span class="field"  id="picDiv">
                            <input type="file" id="picFile" name="picFile" onchange="uploadPic(this)" />
							<input type="hidden" value="${o.pic }" id="pic" name="pic" />
							<br><br> 
							<img id="picShow" src="/pic/${o.pic }" height="150px;" width="150px;" />
                            </span>
                        </p>
                        
                        
                    	<p>
                        	<label>用户名</label>
                            <span class="field"><input disabled="disabled" type="text" value="${o.username }"  name="username" id="username" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>姓名</label>
                            <span class="field"><input   type="text" value="${o.name }"  name="name" id="name" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>手机号</label>
                            <span class="field"><input   type="text" value="${o.phone }"  name="phone" id="phone" class="longinput" /></span>
                        </p>
                        <p>
                        	<label>性别</label>
                            <span class="field"><select   name="sex" id="sex">
                                <option value="男" <c:if test="${o.sex eq '男'}">selected="selected"</c:if>>男</option>
                                <option value="女" <c:if test="${o.sex eq '女'}">selected="selected"</c:if>>女</option>
                            </select></span>
                        </p>
                        <p>
                        	<label>年龄</label>
                            <span class="field"><input   type="text" value="${o.age }"  name="age" id="age" class="longinput" /></span>
                        </p>
                        
                    
                        <p class="stdformbutton">
                        	<button class="submit radius2" onclick="return save()" >提交</button>
                        </p> 
                    </form>
					
                    <br />

</div>
</div>
</div>
</div>
</body>
</html>