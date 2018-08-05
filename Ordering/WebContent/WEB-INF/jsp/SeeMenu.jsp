<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView2.css" type="text/css" />

	<title>菜式详细信息</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/ShoreMainView2.jsp" />
	<div class="main2">
		<span style="font-size:20px;color:gray;">菜式详细信息：</span><br/><br/>
		
		<div class="left">
				<input type="hidden" name="menuid" value="${menu.menuid }"/>
				<table style="border-collapse:separate; border-spacing:0px 20px;">
					<tr><td width=120>菜式名字：</td><td width=280>${menu.menuname }</td></tr>
					<tr><td>菜式介绍：</td><td>${menu.menedetail }</td></tr>
					<tr><td>菜式价格：</td><td>${menu.menuprice }</td></tr>
					<tr><td>菜式类别：</td><td>${menu.type.typename }</td></tr>
				</table>

		</div>
				
		<div class="right5">
			<div class="right4">
				<span style="font-size:20px;color:gray">菜式图片：</span>
				<img src="/img/${menu.menupic }" style="border:1px solid gray;" width=160 height=160 />
			</div>
		</div>
		
		<div style="margin-left:180px;line-height:10px;">
			<a href="${pageContext.request.contextPath }/carAndOrder/buyMenu?menuid=${menu.menuid}"><input type="button" value="购买"/></a></br>
			</br>
			<form action="${pageContext.request.contextPath }/carAndOrder/addcar">
				<input type="hidden" name="shoreid" value="${menu.shoreId }"/>
				<input type="hidden" name="userid" value="${user.userid }"/>
				<input type="hidden" name="menuIdList" value="${menu.menuid }" />
				<input type="submit" value="加入购物车" />
			</form>
			</br>
			
			<a href="${pageContext.request.contextPath }/order/toShore/${menu.shoreId }"><input type="button" value="返回"/></a>
		</div>
			
			
		
	</div>
	

	
</body>
</html>
