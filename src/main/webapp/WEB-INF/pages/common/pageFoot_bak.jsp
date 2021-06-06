<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<div id="BtmMain">
<!-- PageNum -->
<ul id="PageNum">
<li><a href="javascript:goFirst()">首页</a></li>
<li><a href="javascript:goPre()">上一页</a></li>
<li><a href="javascript:goNext()">下一页</a></li>
<li><a href="javascript:goLast()">尾页</a></li>
<li><a href="#">${currentpage }/${totalPages }</li>
</ul>
<!-- /PageNum -->
</div>

<script type="text/javascript">
var currentpage = 1 ;
var totalPages = 1 ;

$(function(){
	 currentpage = $("#currentpage").val();
	 totalPages = $("#totalPages").val();
});

//$("#allPage").html(currentpage+"/"+totalPages);


function goPre(){
	if(currentpage!="1"){
	$("#currentpage").val(Number(currentpage)-Number(1));
	}
	$("#sForm").submit();
}

function goNext(){
	if(currentpage!=totalPages){
	$("#currentpage").val(Number(currentpage)+Number(1));
	}
	$("#sForm").submit();
}

function goFirst(){
	$("#currentpage").val(1);
	$("#sForm").submit();
}


function goLast(){
	$("#currentpage").val(totalPages);
	$("#sForm").submit();
}

</script>


</body>
</html>