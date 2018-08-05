<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
	  <meta charset="utf-8" />
	  <title>用户注册</title>
	  <link rel="stylesheet" href="/Ordering/css/register.css" type="text/css" />
	  <link rel="stylesheet" href="/Ordering/css/common.css" type="text/css" />
	</head>
  
	<body class="main">
	<h1 class="title">请填写订单的详细信息</h1>
		<div class="login1">
            <div class="login2">
            <form id="login_form" action="${pageContext.request.contextPath }/carAndOrder/sure2" method="post">
		     	<table>	
		     		<tr><td>收货人姓名：</td><td><input type="text" name="uname" /></td></tr>
		     		<tr><td>电话号码：</td><td><input type="text" name="phone" /></td></tr>
		     		<tr><td>商品数目：</td><td><input type="text" value="${count }" readonly="readonly"/></td></tr>
		     		<tr><td>总价钱：</td><td><input type="text" value="${sum }元" readonly="readonly" /></td></tr>
		     		<tr>
		     			<td>地址：</td><td><input type="text" name="address" />
		     			<c:forEach items="${oidList }" var="oid">
		     				<input type="hidden" name="oidList" value="${oid }"/>
		     			</c:forEach>
	     			</td>
		     		</tr>
		     		
		     		<tr>
		     			<td><input type="submit" class="submit1" value="确认" /></td>
		     			<td><input type="button" class="submit1" value="取消" /></td>
		   			</tr>
		     	</table>     
   		  </form>
       	  </div>
  	  </div>
  </body>
</html>