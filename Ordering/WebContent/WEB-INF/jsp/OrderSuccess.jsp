<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查所有用戶</title>
</head>
<body>

		<span style="color:gray;font-size:20px;">订餐成功,请耐心等待商家送达</span><br/><br/>
		<span style="color:gray;font-size:20px;">订单id号：${orderid }</span><br/><br/>
		<a href="${pageContext.request.contextPath }/carAndOrder/seeOrder/${orderid }"><input type="button" value="查看订单"/></a>
		<a href="${pageContext.request.contextPath }/order/toShore/${shoreid }"><input type="button" value="继续订餐"/></a>

		
	
</body>
</html>