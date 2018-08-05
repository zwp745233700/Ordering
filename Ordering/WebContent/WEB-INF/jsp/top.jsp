<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/Ordering/css/top.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="main">
		<span style="font-size:35px;color:blue;">欢迎使用订餐管理系统</span><br/>
		<a href="${pageContext.request.contextPath }/order/toOrderingView" class="font4">订餐首页</a>
		<a href="${pageContext.request.contextPath }/carAndOrder/toMyOrder?userid=${USER.userid }" class="font4">我的订单</a>
		<a href="${pageContext.request.contextPath }/carAndOrder/mycar?userid=${USER.userid }" class="font4">我的购物车</a>
		<a href="${pageContext.request.contextPath }/shore/toshoreRegister" class="font4">加盟合作</a>
		<a href="${pageContext.request.contextPath }/shore/toShoreLogin" class="font4">商家入口</a>
		<div class="login">
			<c:if test="${username==null }">
				<a href="${pageContext.request.contextPath }/user/tologin" class="font4">登陆</a>
				<a href="${pageContext.request.contextPath }/user/toregister" class="font4">注册</a>
			</c:if>
			<c:if test="${username!=null }">
				<span class="font4">当前用户：${username }</span>
				<a href="${pageContext.request.contextPath }/user/logout" class="font4">[退出]</a>
			</c:if>
		</div>
		
	</div>
</body>
</html>