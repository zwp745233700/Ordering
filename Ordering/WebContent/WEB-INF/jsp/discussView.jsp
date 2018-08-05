<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
	  <meta charset="utf-8" />
	  <title>评价订单</title>
	  <link rel="stylesheet" href="/Ordering/css/register.css" type="text/css" />
	  <link rel="stylesheet" href="/Ordering/css/common.css" type="text/css" />
	</head>
  
	<body class="main">
	<h1 class="title">欢迎评论该订单</h1>
		<div class="login6">
            <div class="login2">
            <form id="login_form" action="${pageContext.request.contextPath }/carAndOrder/discussSuccess" method="post">
		     	<table>		
		     		<tr><td>商店名称：</td><td>${order.shore.shorename }<input type="hidden" name="orderid" value="${order.orderid }"/></td></tr>
		     		<tr><td>菜式名称：</td><td>${order.orderdetail.menu.menuname }</td></tr>
		     		<tr><td>价格：</td><td>${order.orderdetail.menu.menuprice }</td></tr>
		     		<tr><td>订餐时间：</td><td>${order.createtime }</td></tr>
		     		
					<tr><td>评论内容：</td><td><textarea name="discuss"></textarea></td></tr>
		     		<tr>
		     			<td><input type="submit" class="submit1" value="评论" /> </td>
		     			<td><a href="${pageContext.request.contextPath }/order/toOrderingView"><input type="button" class="submit1" value="返回" /></a></td>
		   			</tr>
		     	</table>     
   		  </form>
       	  </div>
  	  </div>
  </body>
</html>