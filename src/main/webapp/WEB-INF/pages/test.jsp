<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
            <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<title></title>
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


 function uploadPic2(o){
	$.ajaxFileUpload({  
	    type: "POST",  
	    url: "../upload/excel.html",  
	    //data:{},//要传到后台的参数，没有可以不写  
	    secureuri : false,//是否启用安全提交，默认为false  
	    fileElementId:'excelFile',//文件选择框的id属性  
	    dataType: 'json',//服务器返回的格式  
	    async : false,  
	    success: function(data){ 
	        if(data.result=='success'){  
	        }else{  
	        } 
	    },  
	    error: function (data, status, e){  
	    }  
	});
} 

 
 function excelexport(o){
	 window.open(ctx+"/upload/exportexcel.html");
 }
 
 
 function filedown(o){
	 window.open(ctx+"/upload/downloadFile.html?id=1.txt");
	 
	 
 }
 
function back(){
	window.location.href = ctx+"/user/list.html?selectType="+$("#selectType").val();
	return false;
}

function save(){
	var username = $("#username").val();
	var password = $("#password").val();
	var name = $("#name").val();
	var phone = $("#phone").val();
	var sex = $("#sex").val();
	var age = $("#age").val();
	var selectType = $("#selectType").val();
	var job = $("#job").val();
	if(username==""){
		alert("请输入用户名");
		return false ;
	}
	if(password==""){
		alert("请输入密码");
		return false ;
	}
	if(name==""){
		alert("请输入姓名");
		return false ;
	}
	/* if(type==""){
		alert("请输入职位");
		return false ;
	} */
/* 	if(job==""){
		alert("请输入职位");
		return false ;
	} */
	$.ajax({
		url:"../user/add",
		type:"post",
		data:{
			username:username,password:password,
			name:name,phone:phone,
			sex:sex,age:age,
			selectType:selectType,job:job,pic:$("#pic").val()
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
				window.location.href = ctx+"/user/list.html?selectType="+$("#selectType").val();
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


function datalistjson(o){
	var json  ;
	$.ajax({
		url:"../test/json",
		type:"post",
		data:{
			
		},
		success:function(data){
			 json = eval('('+data+')');
			//var  ajaxobj=JSON.parse(data);
			//var  ajaxobj=eval("("+data+")");
			//alert(json.code);
			if("100"==json.code){
				/* alert(json.msg);
				for(var i=0;i<json.data.length;i++){
					alert(json.data[i].name);
					alert(json.data[i].phone);
				} */
				$("#datalistjson").html(data);
				return false;
			}else{
				alert("错误");
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
	                	
                	
                		</h3>
                    </div><!--contenttitle-->
                    
					<form class="stdform stdform2" method="post" action="">
					
						<p>
                        	<label>图片上传</label>
                            <span class="field"  id="picDiv">
                            <input type="file" id="picFile" name="picFile" onchange="uploadPic(this)" />
							<input type="hidden" id="pic" name="pic" />
							<br><br>
                            </span>
                        </p>
                        
                        
                        <p>
                        	<label>excel上传并读取</label>
                            <span class="field"  >
                            <input type="file" id="excelFile" name="excelFile" onchange="uploadPic2(this)" />
							<br><br>
                            </span>
                        </p>
                        
                   
                    	<p>
                        	<label>excel导出</label>
                            <span class="field"  >
                            <input type="button" onclick="excelexport(this)" />
							<br><br>
                            </span>
                        </p>
                        
                        
                         <p>
                        	<label>文件下载</label>
                            <span class="field"  >
                            <input type="button"  onclick="filedown(this)" />
							<br><br>
                            </span>
                        </p>
                        
                        <p>
                        	<label>测试返回jsonlist数据</label>
                            <span class="field"  >
                            <input type="button"  onclick="datalistjson(this)" />
							<br><br>
							<span id="datalistjson"></span>
                            </span>
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