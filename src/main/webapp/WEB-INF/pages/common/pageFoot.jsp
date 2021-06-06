<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<head></head>
<body>
				<div class="dataTables_paginate paging_full_numbers" id="dyntable2_paginate">
	                <span class="first paginate_button" id="dyntable2_first" onclick="goFirst()">First</span>
	                <span class="previous paginate_button" id="dyntable2_previous" onclick="goPre()">Previous</span>
	                <span class="next paginate_button" id="dyntable2_next" onclick="goNext()">Next</span>
	                <span class="last paginate_button" id="dyntable2_last" onclick="goLast()">Last</span>
	                <span class="paginate_button" id="allPage"></span>
                </div>
                
                
                <script type="text/javascript">
var currentpage = 1 ;
var totalPages = 1 ;

$(function(){
	 currentpage = $("#currentpage").val();
	 totalPages = $("#totalPages").val();
	 $("#allPage").html(currentpage+"/"+totalPages);
});




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