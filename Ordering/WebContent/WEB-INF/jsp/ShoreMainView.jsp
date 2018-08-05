<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView.css" type="text/css" />
	<title>商家主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<div class="head">
	<c:if test="${MyShore.shorepic!=null }">
		<a href="${pageContext.request.contextPath }/shore/updShoreHead"><img class="pic" src="/img/${MyShore.shorepic }" /></a>
	</c:if>
	<c:if test="${MyShore.shorepic==null }">
		<a href="${pageContext.request.contextPath }/shore/updShoreHead"><img class="pic" src="/Ordering/images/headpic.jpg" /></a>
	</c:if>

		<div class="message">
			<span>用户名:${MyShore.username }</span>
			<br/><br/>
			<c:if test="${MyShore.shorename!=null }">
				<span style="display:block;width:180px;float:left;">店名：${MyShore.shorename }</span>
			</c:if>
			<c:if test="${MyShore.shorename==null }">
				<span style="display:block;width:180px;float:left;">未填写店名</span>
			</c:if>
 						
			<c:if test="${MyShore.shoretype.shoretypename!=null }">
				<span style="display:block;width:180px;float:left;">商店类别:${MyShore.shoretype.shoretypename }</span>
			</c:if>
			<c:if test="${MyShore.shoretype.shoretypename==null }">
				<span style="display:block;width:180px;float:left;">未填写商店类别</span>
			</c:if>
			
			<c:if test="${MyShore.shoremoblie!=null }">
				<span style="display:block;width:180px;float:left;">联系电话:${MyShore.shoremoblie }</span>
			</c:if>
			<c:if test="${MyShore.shoremoblie==null }">
				<span style="display:block;width:180px;float:left;">未填写联系电话</span>
			</c:if>
			
			<br/><br/>
		</div>
		
		<div class="resumn">
			<span style="float:left;">商家地址:</span>
			<c:if test="${MyShore.address!=null }">
				<span>${MyShore.address }</span>
			</c:if>
			<c:if test="${MyShore.address==null }">
				<span>未填写任何地址信息</span>
			</c:if>
		</div>
		
		<div class="edit">
			<span><a href="${pageContext.request.contextPath }/shore/findDiscuss/${MyShore.shoreid}">查看评论</a></span>
			<span><a href="${pageContext.request.contextPath }/shore/showOrders/${MyShore.shoreid}">查看订单</a></span>
			<span><a href="${pageContext.request.contextPath }/shore/toMainMenu/${MyShore.shoreid}">商家主页</a></span>
			<span><a href="${pageContext.request.contextPath }/shore/toAddMenu/${MyShore.shoreid}">上传菜单</a></span>
			<span><a href="${pageContext.request.contextPath }/shore/toMeunType/${MyShore.shoreid}">菜式类别</a></span>
			<span><a href="${pageContext.request.contextPath }/shore/toUpdateShore">修改信息</a></span>
			<span><a href="${pageContext.request.contextPath }/shore/logout">退出登录</a></span>
		</div>
	</div >
	
	
</body>
</html>
