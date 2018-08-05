<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView2.css" type="text/css" />
	<title>商家主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<div class="head">
	<c:if test="${shore.shorepic!=null }">
		<img class="pic" src="/img/${shore.shorepic }" />
	</c:if>
	<c:if test="${shore.shorepic==null }">
		<img class="pic" src="/Ordering/images/headpic.jpg" />
	</c:if>

		<div class="message">
			<span>用户名:${shore.username }</span>
			<br/><br/>
			<c:if test="${shore.shorename!=null }">
				<span style="display:block;width:180px;float:left;">店名：${shore.shorename }</span>
			</c:if>
			<c:if test="${shore.shorename==null }">
				<span style="display:block;width:180px;float:left;">未填写店名</span>
			</c:if>
 						
 			<c:if test="${shore.shoretype.shoretypename!=null }">
				<span style="display:block;width:180px;float:left;">商店类别:${shore.shoretype.shoretypename }</span>
			</c:if>
			<c:if test="${shore.shoretype.shoretypename==null }">
				<span style="display:block;width:180px;float:left;">未填写商店类别</span>
			</c:if>
			
			<c:if test="${shore.shoremoblie!=null }">
				<span style="display:block;width:180px;float:left;">联系电话:${shore.shoremoblie }</span>
			</c:if>
			<c:if test="${shore.shoremoblie==null }">
				<span style="display:block;width:180px;float:left;">未填写联系电话</span>
			</c:if>
			
			<br/><br/>
		</div>
		
		<div class="resumn">
			<span style="float:left;">商家地址:</span>
			<c:if test="${shore.address!=null }">
				<span>${shore.address }</span>
			</c:if>
			<c:if test="${shore.address==null }">
				<span>未填写任何地址信息</span>
			</c:if>
		</div>
		
		<div>
			<a href="${pageContext.request.contextPath }/shore/findDiscuss2/${shore.shoreid}" style="float:right;">用户点评</a>
			<a href="${pageContext.request.contextPath }/order/toOrderingView" style="float:right;">离开该商家&nbsp;&nbsp;&nbsp;</a>
		</div>
	</div >
	
	
</body>
</html>
