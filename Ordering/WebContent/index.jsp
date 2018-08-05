<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="/Ordering/css/top.css" />
<title>首页</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/top.jsp" />	
			<!-- 商家类别列表 -->
		<div class="list">
			<span class="font4">请选择商家类别：</span>
			<span><a href="${pageContext.request.contextPath }/order/toOrderingView">全部</a></span>
			<c:forEach items="${shoreTypeList }" var="shoreType">
				<span><a href="${pageContext.request.contextPath }/order/findShoreByType/${shoreType.shoretypeid }">${shoreType.shoretypename }</a></span>
			</c:forEach>
			
		</div>
		
		<!-- 对应的商家 -->
		<div class="shop">
			<c:if test="${shoreList.isEmpty() }">
				<span style="font-size:20px;color:gray;">没有找到该类型的商店</span> 
			</c:if>
				<c:forEach items="${shoreList}" var="shore">
					<div class="shopdiv"> 
						<a href="${pageContext.request.contextPath }/order/toShore/${shore.shoreid}"><img src="/img/${shore.shorepic }" class="img"></img></a>
						<div align="center" style="float:left;width:158px;"><span style="margin:0 auto;color:gray;">&nbsp;&nbsp;${shore.shorename }</span>&nbsp;</div>
					</div>
				</c:forEach>
			
		</div>
	
</body>
</html>