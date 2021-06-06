<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="${pageContext.request.contextPath}/assets/common/css/haiersoft.css" rel="stylesheet" type="text/css" media="screen" />
<script src="${pageContext.request.contextPath}/assets/common/js/jquery-1.10.1.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/common/js/ajaxfileupload.js"></script>
<script src="${pageContext.request.contextPath}/assets/common/js/side.js" type="text/javascript"></script>

</head>

<body>
<!-- Popup -->
<div id="Popup">

<!-- SubPopup -->
<div id="SubPopup">
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
	window.location.href = "../goods/list.html";
}

function save(){
	var id = $("#id").val();
	var name = $("#name").val();
	var goodstypeid = $("#goodstypeid").val();
	/* var keyword = $("#keyword").val(); */
	var price = $("#price").val();
	var pic = $("#pic").val();
	var minidetail = $("#minidetail").val();
	var detail = $("#detail").val();
	
	if(name==""){
		alert("请输入商品名称");
		return ;
	}
	if(goodstypeid==""){
		alert("请输入商品类别");
		return ;
	}
	/* if(keyword==""){
		alert("请输入搜索关键词");
		return ;
	} */
	if(price==""){
		alert("请输入价格");
		return ;
	}
	if(pic==""){
		alert("请输入图片");
		return ;
	}
	if(minidetail==""){
		alert("请输入右侧详情");
		return ;
	}
	if(detail==""){
		alert("请输入下方详情 ");
		return ;
	}
	$.ajax({
		url:"../goods/update",
		type:"post",
		data:{
			id:id,
			name:name,
			goodstypeid:goodstypeid,
			/* keyword:keyword, */
			price:price,
			pic:pic,
			minidetail:minidetail,
			detail:detail
		},
		success:function(data){
			if("ok"==data){
				alert("保存成功");
				back();
			}else{
				alert("保存失败");
			}
		},
		error:function(data){
			alert("系统错误");
		}
	});
}

</script>
<div class="form_boxC">
 <p>"<span class="f_cB">*</span>"号为必填项目</p>
 <input type="hidden" value="${o.id }" id="id" name="id" />
<table cellpadding="0" cellspacing="0">
<tr>
<th width="100">商品名称 <span class="f_cB">*</span> </th>
<td><div class="txtbox floatL" style="width:300px;"><input value="${o.name }"  id="name" name="name" type="text" size="30" value=""></div></td>
</tr>
<tr>
<th width="100">商品类别 <span class="f_cB">*</span> </th>
<td>
<div class="txtbox floatL" style="width:300px;">
<select  style="height:28px;width:280px;"   id="goodstypeid" name="goodstypeid"  >
<option value="">请选择</option>
<c:forEach items="${goodstypeList}" var="g">
<option value="${g.id }" <c:if test="${g.id eq o.goodstypeid }">selected="selected"</c:if>>${g.name }</option>
</c:forEach>
</select>
</div>
</td>
</tr>
<%-- <tr>
<th width="100">搜索关键词 <span class="f_cB">*</span> </th>
<td><div class="txtbox floatL" style="width:300px;"><input value="${o.keyword }"  id="keyword" name="keyword" type="text" size="30" value=""></div></td>
</tr> --%>
<tr>
<th width="100">价格 <span class="f_cB">*</span> </th>
<td><div class="txtbox floatL" style="width:300px;"><input value="${o.price }"  id="price" name="price" type="text" size="30" value=""></div></td>
</tr>
<tr>
<th width="100">图片 <span class="f_cB">*</span> </th>
<td>
<div class="txtbox floatL" style="width:300px;" id="picDiv">
<!-- <input id="name" name="name" type="text" size="30" value=""> -->
<input type="file" id="picFile" name="picFile" onchange="uploadPic(this)" />
<input type="hidden" id="pic" name="pic"  value="${o.pic }"  />
<img id="picShow" src="/pic/${o.pic }" height="150px;" width="150px;" />
</div>
</td>
</tr>
<tr>
<th width="100">右侧详情 <span class="f_cB">*</span> </th>
<td><div class="txtbox"><textarea  id="minidetail" name="minidetail"  cols="32" rows="3">${o.minidetail }</textarea></div></td>
</tr>
<tr>
<th width="100">下方详情 <span class="f_cB">*</span> </th>
<td><div class="txtbox"><textarea  id="detail" name="detail"  cols="32" rows="8">${o.detail }</textarea></div></td>
</tr>
</table>
</div>
</div>
<!-- SubPopup -->

<div id="BtmBtn">
<div class="btn_boxB floatR mag_l20"><input name="" onclick="back()" type="button" value="取消" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
<div class="btn_box floatR"><input name="" onclick="save()"  type="button" value="提交" onmousemove="this.className='input_move'" onmouseout="this.className='input_out'"></div>
</div>
</div>
<!-- /Popup -->
</body>
