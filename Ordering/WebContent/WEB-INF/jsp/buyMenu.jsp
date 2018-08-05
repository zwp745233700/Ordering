<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView2.css" type="text/css" />
	<title>选择菜式</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/ShoreMainView2.jsp" />
	
	<div class="main3">
		<div class="left1">
			<!-- 所有的分类 -->
			<div style="height:8px;"><a href="${pageContext.request.contextPath }/order/toShore/${shore.shoreid}" style="text-decoration:none">全部</a></div><br/>
			<c:forEach items="${typeList }" var="type">
				<div style="height:8px;"><a href="${pageContext.request.contextPath }/order/findMenuByType?typeid=${type.typeid }&shoreid=${shore.shoreid }" style="text-decoration:none">${type.typename }</a></div><br/>
			</c:forEach>
		</div>
		
		<c:if test="${type!=null }">
			<span style="font-size:20px;color:gray;">当前分类：${type.typename }</span>
		</c:if>
		<c:if test="${type==null }">
			<span style="font-size:20px;color:gray;">当前分类：全部</span>
		</c:if>
		
		<div class="right1">
		<form action="${pageContext.request.contextPath }/carAndOrder/addcar" method="post">
			<c:if test="${not empty menuList }">
				<c:forEach items="${menuList}" var="menu">
					<div class="menu2"> 
						<a href="${pageContext.request.contextPath }/order/toSeeMenu/${menu.menuid}"><img src="/img/${menu.menupic }" class="img"></img></a>
						<div style="float:left;width:159px;">
							<span style="float:left;color:gray;">&nbsp;&nbsp;${menu.menuname }</span>&nbsp;
							<div style="float:right;color:gray;">${menu.menuprice }元&nbsp;&nbsp;</div>
						</div>
						
							<div style="float:left;">
								<input type="hidden" name="shoreid" value="${shore.shoreid }"/>
								<input type="hidden" name="userid" value="${user.userid }"/>
								<input type="checkbox" name="menuIdList" value="${menu.menuid }" />加入购物车
								<a href="${pageContext.request.contextPath }/carAndOrder/buyMenu?menuid=${menu.menuid}"><input type="button" value="购买"/></a>
							</div>
						
						
					</div>
				</c:forEach>
				<div style="width:655px;"><input type="submit" value="确认" /></div>
			</c:if>
		</form>
			
		</div>
			<c:if test="${menuList.isEmpty() }">
				<br/><span style="color:gray;font-size:18px;">该商家还没添加任何菜式</span>
			</c:if>
		</div>
	
</body>
</html>
