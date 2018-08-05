<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>订餐成功</title>
</head>
<body>

		<span style="color:gray;font-size:20px;">订餐成功,请耐心等待商家送达</span><br/><br/>
		<a href="${pageContext.request.contextPath }/order/toOrderingView"><input type="button" value="返回主界面"/></a>
		<a href="${pageContext.request.contextPath }/carAndOrder/toMyOrder?userid=${USER.userid }"><input type="button" value="查看我的订单"/></a>
</body>
</html>