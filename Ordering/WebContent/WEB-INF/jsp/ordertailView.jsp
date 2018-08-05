<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
	  <meta charset="utf-8" />
	  <title>订单详情</title>
	  <link rel="stylesheet" href="/Ordering/css/register.css" type="text/css" />
	  <link rel="stylesheet" href="/Ordering/css/common.css" type="text/css" />
	</head>
  
	<body class="main">
	<h1 class="title">订单详细信息</h1>
		<div class="login3">
            <div class="login4">
            <form id="login_form" action="${pageContext.request.contextPath }/carAndOrder/sure" method="post">
		     	<table>	
		     		<tr><td>商家名：</td><td>${orders.shore.shorename }</td></tr>
		     		<tr><td>收货人姓名：</td><td>${orders.uname }</td></tr>
		     		<tr><td>收货人地址：</td><td>${orders.address }</td></tr>
	     		 	<tr><td>下单时间：</td><td>${dateString }</td></tr>
		     		<tr><td>商品数量：</td><td>${orders.number }</td></tr>
		     		<tr><td>联系方式：</td><td>${orders.phone }</td></tr>
		     		<tr><td>合计：</td><td>${orders.total }元</td></tr>
		     		<tr>
		     			<td>是否付款：</td>
		     			<td>
		     				<c:if test="${orders.pay==0 }">未付款</c:if>
		     				<c:if test="${orders.pay==1 }">已经付款</c:if>
		     			</td>
	     			</tr>
		     		<tr>
		     			<td><a href="${pageContext.request.contextPath }/order/toShore/${orders.shoreId }"><input type="button" class="submit1" value="返回" /></a></td>
		   			</tr>
		     	</table>     
   		  </form>
   		  
   		   
       	  </div>
       	  
       	  
  	  </div>
  	   <div class="div5">
			<span style="float:left;margin-top:5px;">菜式详细信息：</span><br/>
			<span style="width:300px;float:left;">菜式名称：${orders.orderdetail.menu.menuname }</span><br/>
			<span style="width:300px;float:left;">菜式图片：</span><br/>
			<img src="/img/${orders.orderdetail.menu.menupic }" width=150 height=150 /><br/>
			  </div>
	
  </body>
</html>