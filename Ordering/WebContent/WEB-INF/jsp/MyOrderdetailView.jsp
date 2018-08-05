<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView2.css" type="text/css" />
	<title>商家订单详情界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	
	<div class="main6">
			<c:if test="${not empty orders }"> 
			<div style="width:795px;border:1px solid gray;"><span style="color:gray;font-size:20px;">用户订单界面:</span><span>当前用户：${USER.username }</span>
			<a href="${pageContext.request.contextPath }/order/toOrderingView">返回主界面</a><br/></div><br/>
			<center>
				<table border=1 style="center">
				<tr><td style="text-align:center" colspan="2">订单详情</td></tr>
					<tr><td width="300px">收货人</td><td width="300px">${orders.uname}</td></tr>
					<tr><td>收货地址</td><td>${orders.address}</td></tr>
					<tr><td>商品数量</td><td>${orders.number}</td></tr>
					<tr><td>总价</td><td>${orders.total}</td></tr>
					<tr><td>联系方式</td><td>${orders.phone}</td></tr>
					<tr><td>下单时间</td><td>${orders.createtime}</td></tr>
					<tr>
						<td>是否付款</td>
					<c:if test="${orders.pay==0}">
							<td>等待付款</td>
					</c:if>
					<c:if test="${orders.pay==1}">
							<td>已经付款</td>
					</c:if>
					</tr>
					<tr>
						<td>消费完成</td>
					<c:if test="${orders.statu==0}">
							<td>正在消费</td>
					</c:if>
					<c:if test="${orders.statu==1}">
							<td>已经完成</td>
					</c:if>
					</tr>
					<c:if test="${empty orders.discuss }">
						<tr><td>订单评价</td><td>未填写</td></tr>
					</c:if>
					<c:if test="${!empty orders.discuss }">
						<tr><td>订单评价</td><td>${orders.discuss }</td></tr>
					</c:if>
					
					<tr><td style="text-align:center" colspan="2">菜式详情</td></tr>
					<tr><td>菜式名称</td><td>${orders.orderdetail.menu.menuname }</td></tr>
					<tr><td>菜式价格</td><td>${orders.orderdetail.menu.menuprice }</td></tr>
					<tr><td>菜式描述</td><td>${orders.orderdetail.menu.menedetail }</td></tr>

					<tr><td>菜式图片</td><td style="text-align:center" rowspan="3"><img style="width:300px;height:300px" src="/img/${orders.orderdetail.menu.menupic }" /></td></tr>
				</table>
				</center>
			</c:if>
	</div>

</body>
</html>
