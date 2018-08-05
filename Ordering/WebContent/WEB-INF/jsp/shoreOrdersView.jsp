<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView2.css" type="text/css" />
	<title>商家订单界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
		
	<jsp:include page="/WEB-INF/jsp/ShoreMainView.jsp" />
	<div class="main6">
			<c:if test="${not empty orderList }"> 
				<table border=1>
					<tr>
						<td width="60px">收货人</td>
						<td width="70px">菜式名称</td>
						<td width="40px">价格</td>
						<td width="170px">收货地址</td>
						<td width="120px">订餐时间</td>
						<td width="70px">状态</td>
						<td width="70px">是否付款</td>
						<td width="40px">详情</td>
					</tr>
					
					
					<c:forEach items="${orderList }" var="order">
						<tr>
							<td><a href="#">${order.uname }</a></td>
							<td><a href="${pageContext.request.contextPath }/shore/toUpdMenu/${order.orderdetail.menuId}">${order.orderdetail.menu.menuname }</a></td>
							<td>${order.orderdetail.menu.menuprice }</td>
							<td>${order.address }</td>
							<td>${order.createtime }</td>
							<td>
								<c:if test="${order.statu==0 }">
								正在消费
								</c:if>
								<c:if test="${order.statu==1 }">
								已经消费
								</c:if>
							</td>
							<td>货到付款</td>
							<td><a href="${pageContext.request.contextPath }/shore/showOrderdetail/${order.orderid}">详情</a></td>
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
