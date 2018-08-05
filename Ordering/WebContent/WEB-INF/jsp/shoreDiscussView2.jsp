<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView.css" type="text/css" />
	<title>菜别主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/ShoreMainView2.jsp" />
	<div class="main3">
		<table border=1>
			<tr><td width="80px">用户名</td><td width="90px">所定菜式</td><td width="350px">评论内容</td><td width="220px">评论时间</td></tr>
			<c:if test="${not empty orderList}">
				<c:forEach items="${orderList }" var="order">
					<c:if test="${order.discuss!='' }">
						<c:if test="${!empty order.discuss }">
					<tr>
						<td>${order.user.username }</td>
						<td>${order.orderdetail.menu.menuname }</td>
						<td>
							<c:if test="${order.discuss!='' }">
								${order.discuss}
							</c:if>
							<c:if test="${empty order.discuss }">
								该用户暂未评论
							</c:if>
						</td>
						<td>${order.createtime }</td>
						</tr>
						</c:if>
					</c:if>
				</c:forEach>
			</c:if>
		</table>
		
	</div>
	
</body>
</html>
