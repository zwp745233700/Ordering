<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView2.css" type="text/css" />
	<title>我的订单界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
		
	<div class="main6">
		<div style="width:795px;border:1px solid gray;"><span style="color:gray;font-size:20px;">用户订单界面:</span><span>当前用户：${USER.username }</span>
		<a href="${pageContext.request.contextPath }/order/toOrderingView">返回主界面</a><br/>
		<a href="${pageContext.request.contextPath }/carAndOrder/toMyOrder?userid=${USER.userid }"><input type="button" value="全部订单" /></a>
		<a href="${pageContext.request.contextPath }/carAndOrder/findMyOrderByStatu1?userid=${USER.userid }"><input type="button" value="已消费订单" /></a>
		<a href="${pageContext.request.contextPath }/carAndOrder/findMyOrderByStatu2?userid=${USER.userid }"><input type="button" value="正在消费订单" /></a><br/>
		</div>

			<c:if test="${not empty orderList }"> 
				<table border=1>
					<tr><td>商家名称</td><td>菜式名称</td><td>菜式价格</td><td>菜式说明</td><td>订餐时间</td><td>状态</td><td>操作</td><td>详情</td></tr>
					<c:forEach items="${orderList }" var="order">
						<tr>
							<td>${order.shore.shorename }</td>
							<td>${order.orderdetail.menu.menuname }</td>
							<td>${order.orderdetail.menu.menuprice }</td>
							<td>${order.orderdetail.menu.menedetail }</td>
							<td>${order.createtime }</td>
							<td>
								<c:if test="${order.statu==0 }">正在消费</c:if>
								<c:if test="${order.statu==1 }">已经消费</c:if>
							</td>
							<td>
								<c:if test="${order.statu==0 }">
									<a href="${pageContext.request.contextPath }/carAndOrder/finishOrder?orderid=${order.orderid }&userid=${USER.userid}"><input type="button" value="完成订单"/></a>
								</c:if>
								<c:if test="${order.statu==1 }">
									<a href="${pageContext.request.contextPath }/carAndOrder/discussOrder?orderid=${order.orderid }"><input type="button" value="评价订单"/></a>
								</c:if>
							</td>
							<td><a href="${pageContext.request.contextPath }/shore/showMyOrderdetail/${order.orderid}">详情</a></td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
			
		<c:if test="${orderList.isEmpty() }">
			<br/><span style="color:gray;font-size:18px;">您还没有任何订单记录</span>
		</c:if>
	</div>
	
</body>
</html>
