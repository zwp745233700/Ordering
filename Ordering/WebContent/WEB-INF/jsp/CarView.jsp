<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView2.css" type="text/css" />
	<title>购物车界面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
		
	<div class="main6">
		<div style="width:795px;border:1px solid gray;"><span style="color:gray;font-size:20px;">用户购物车:</span><span>当前用户：${USER.username }</span>
		<a href="${pageContext.request.contextPath }/order/toOrderingView">返回主界面</a>
		</div>

		<form action="${pageContext.request.contextPath }/carAndOrder/book" method="post">
			<c:if test="${not empty carList }">
				<table border=1>
					<tr><td width=50>选择</td><td width=150>商家名称</td><td width=150>菜式名称</td><td width=150>菜式价格</td><td width=200>菜式说明</td></tr>
					<c:forEach items="${carList}" var="car">
						<tr>
							<td><input type="checkbox" name="caridLisr" value="${car.carid }"/></td>
							<td><a href="${pageContext.request.contextPath }/order/toShore/${car.menu.shore.shoreid}">${car.menu.shore.shorename }</a></td>
							<td><a href="${pageContext.request.contextPath }/order/toSeeMenu/${car.menu.menuid}">${car.menu.menuname }</a></td>
							<td>${car.menu.menuprice }</td>
							<td>${car.menu.menedetail }</td>
						</tr>
					</c:forEach>
				</table>
				<input type="submit" value="购买"/>
			</c:if>
		</form>
			
		<c:if test="${carList.isEmpty() }">
			<br/><span style="color:gray;font-size:18px;">购物车内没有任何商品</span>
		</c:if>
	</div>
	
</body>
</html>
