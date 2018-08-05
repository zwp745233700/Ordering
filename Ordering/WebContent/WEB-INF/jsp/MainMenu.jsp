<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView.css" type="text/css" />
	<title>菜别主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/ShoreMainView.jsp" />
	<div class="main3">
		<div class="left1">
			<!-- 所有的分类 -->
			<div style="height:8px;"><a href="${pageContext.request.contextPath }/shore/toMainMenu/${MyShore.shoreid}" style="text-decoration:none">全部</a></div><br/>
			<c:forEach items="${typeList }" var="type">
				<div style="height:8px;"><a href="${pageContext.request.contextPath }/shore/findMenuByType?typeid=${type.typeid }&shoreid=${MyShore.shoreid }" style="text-decoration:none">${type.typename }</a></div><br/>
			</c:forEach>
		</div>
		<c:if test="${type!=null }">
			<span style="font-size:20px;color:gray;">当前分类：${type.typename }</span>
		</c:if>
		<c:if test="${type==null }">
			<span style="font-size:20px;color:gray;">当前分类：全部</span>
		</c:if>
		<div class="right1">
			<c:if test="${menuList!=null }">
				<c:forEach items="${menuList}" var="menu">
					<div class="menu"> 
						<a href="${pageContext.request.contextPath }/shore/toUpdMenu/${menu.menuid}"><img src="/img/${menu.menupic }" class="img"></img></a>
						<div class="float:left;"><span style="float:left;color:gray;">&nbsp;&nbsp;${menu.menuname }</span>&nbsp;<div style="float:right;color:gray;">${menu.menuprice }元&nbsp;&nbsp;</div></div>
						
					</div>
				</c:forEach>
			</c:if>
		</div>
			<c:if test="${menuList.isEmpty() }">
				<br/><span style="color:gray;font-size:18px;">该商家还没添加任何菜式</span>
			</c:if>
	</div>
	
</body>
</html>
