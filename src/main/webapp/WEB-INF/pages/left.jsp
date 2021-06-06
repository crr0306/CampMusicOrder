<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<head></head>
<script type="text/javascript">
/* 
$(function(){
	

$('.vernav > ul li a, .vernav2 > ul li a').each(function(){
	var url = $(this).attr('href');
	$(this).click(function(){
		if($(url).length > 0) {
			if($(url).is(':visible')) {
				if(!$(this).parents('div').hasClass('menucoll') &&
				   !$(this).parents('div').hasClass('menucoll2'))
						$(url).slideUp();
			} else {
				$('.vernav ul ul, .vernav2 ul ul').each(function(){
						$(this).slideUp();
				});
				if(!$(this).parents('div').hasClass('menucoll') &&
				   !$(this).parents('div').hasClass('menucoll2'))
						$(url).slideDown();
			}
			return false;	
		}
	});
});



$('.menucoll > ul > li, .menucoll2 > ul > li').live('mouseenter mouseleave',function(e){
	if(e.type == 'mouseenter') {
		$(this).addClass('hover');
		$(this).find('ul').show();	
	} else {
		$(this).removeClass('hover').find('ul').hide();	
	}
});


$('.hornav a').click(function(){
	
	//this is only applicable when window size below 450px
	if($(this).parents('.more').length == 0)
		$('.hornav li.more ul').hide();
	
	//remove current menu
	$('.hornav li').each(function(){
		$(this).removeClass('current');
	});
	
	$(this).parent().addClass('current');	// set as current menu
	
	var url = $(this).attr('href');
	if($(url).length > 0) {
		$('.contentwrapper .subcontent').hide();
		$(url).show();
	} else {
		$.post(url, function(data){
			$('#contentwrapper').html(data);
			$('.stdtable input:checkbox').uniform();	//restyling checkbox
		});
	}
	return false;
});

}); */

</script>
<body id="bg">
	<div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="${pageContext.request.contextPath}/login/toIndex.html" class="support">首页</a></li>
        	
        	
      <!--   	<li><a href="#formsub" class="support">Forms</a>
            	<span class="arrow"></span>
            	<ul id="formsub">
               		<li><a href="forms.html">Basic Form</a></li>
                    <li><a href="wizard.html">Wizard</a></li>
                    <li><a href="editor.html">WYSIWYG</a></li>
                </ul>
            </li> -->


 
	 

        	
        		<c:if test ='${login_user.type eq "0" }' > 
        		
        		
        		
        		 <li><a href="${pageContext.request.contextPath}/sysnotice/list.html" class="support">公告管理</a></li>
        		 <li><a href="${pageContext.request.contextPath}/leavemsg/list.html" class="support">留言管理</a></li>
        		 <li><a href="${pageContext.request.contextPath}/signlog/list.html" class="support">打卡统计</a></li>
        		 
        		 
        		 <li><a href="${pageContext.request.contextPath}/user/list.html" class="support">${userTitle1 }管理</a></li>
        	<li><a href="${pageContext.request.contextPath}/user/list2.html" class="support">${userTitle2 }管理</a></li>
        	
        		</c:if>
        		
        		<c:if test ='${login_user.type eq "1" }' > 
        		
        		
        		<li><a href="${pageContext.request.contextPath}/tblbookingsongs/toAdd.html" class="support">预约点歌</a></li>
	 <li><a href="${pageContext.request.contextPath}/tblbookingsongs/list.html" class="support">预约点歌管理</a></li>
        		
        		<li><a href="${pageContext.request.contextPath}/sysnotice/list2.html" class="support">公告查询</a></li> 
        			<li><a href="${pageContext.request.contextPath}/leavemsg/list2.html" class="support">留言查询</a></li> 
        	<li><a href="${pageContext.request.contextPath}/leavemsg/list3.html" class="support">我的留言</a></li>  
        		<li><a href="${pageContext.request.contextPath}/signlog/toAdd.html" class="support">歌曲分类(打卡)</a></li>
        	<li><a href="${pageContext.request.contextPath}/signlog/list2.html" class="support">我的打卡记录</a></li> 
        		
        		</c:if>
        		
        		<c:if test ='${login_user.type eq "2" }' > 
        		
        		
        		
	  <li><a href="${pageContext.request.contextPath}/tblbookingsongs/list2.html" class="support">预约点歌处理</a></li>
	 
	  <li><a href="${pageContext.request.contextPath}/tblsong/list.html" class="support">歌曲管理</a></li>
					<li><a href="${pageContext.request.contextPath}/tblsongType/list.html" class="support">歌曲类型管理</a></li>

        		<li><a href="${pageContext.request.contextPath}/sysnotice/list2.html" class="support">公告查询</a></li> 
        			<li><a href="${pageContext.request.contextPath}/leavemsg/list2.html" class="support">留言查询</a></li> 
        	<li><a href="${pageContext.request.contextPath}/leavemsg/list3.html" class="support">我的留言</a></li>  
        		<li><a href="${pageContext.request.contextPath}/signlog/toAdd.html" class="support">打卡</a></li>
        	<li><a href="${pageContext.request.contextPath}/signlog/list2.html" class="support">我的打卡记录</a></li> 
        		
        		</c:if>
        	
        	
        	
        	
         
        <li><a href="${pageContext.request.contextPath}/user/toUpdate5.html" class="support">个人信息</a></li> 
         
        <li><a href="${pageContext.request.contextPath}/user/toupdatepwd.html" class="support">修改密码</a></li> 
        
        
        
        
        
        
        
        
        
          <%-- 		<c:if test ='${login_user.type eq "0" }' > --%>
        	<%--
        	
        	<li><a href="${pageContext.request.contextPath}/dept/list.html" class="support">部门信息管理</a></li> 
        	
        	 <li><a href="${pageContext.request.contextPath}/user/list3.html" class="support">薪酬管理type=2</a></li>
        	
        	<li><a href="${pageContext.request.contextPath}/user/toUpdate4.html" class="support">我的工资单</a></li>
        	
        	<li><a href="${pageContext.request.contextPath}/syscode/list.html" class="support">字典管理</a></li>
        	
        	 <li><a href="${pageContext.request.contextPath}/test/toTest.html" class="support">测试</a></li> 
        	 
        	 --%>
          
          
        </ul>
        <br /><br />
    </div><!--leftmenu-->
</body>
</html>
