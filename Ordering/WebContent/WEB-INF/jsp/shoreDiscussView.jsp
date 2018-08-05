<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView.css" type="text/css" />
	<title>商家观看评论页面</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/ShoreMainView.jsp" />
	<div class="main3">
		<table border=1>
			<tr><td width="90">用户名</td><td width="100">所定菜式</td><td width="350">评论内容</td><td width="150">评论时间</td></tr>
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
								<%-- <c:if test="${empty order.discuss }">
									该用户暂未评论
								</c:if> --%>
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
