<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView.css" type="text/css" />
    <script type="text/javascript" src="/Ordering/js/edittype.js"></script>
	<title>菜别主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/ShoreMainView.jsp" />
	<div class="main1">
	<div>
	<span style="font-size:20px;color:gray;">修改类别：</span><br/><br/>
	<c:if test="${typeList!=null }">
		<table border=1>
			<tr><td width=200>菜单类别</td><td>操作</td></tr>
			<c:forEach items="${typeList }" var="type">
				<tr>
					<td>
	   					<form id="form1" name="form1" action="${pageContext.request.contextPath }/shore/updMenuType" method="post">
	    					<input type="hidden" name="typeid" value="${type.typeid }" />
	    					<input type="hidden" name="shoreId" value="${MyShore.shoreid }" />
	    					<span id="${type.typeid }1">${type.typename }</span>
	    					<span id="${type.typeid }2" class="edit2">
	    						<input type="text" name="typename" value="${type.typename }"/>
	    						<input type="submit" value="保存" />
	    						<input type="reset" value="取消"/>
	    					</span>
	   					</form>
					</td>
					<td>
						<a id="${type.typeid }" href="javascript:;" onclick="edit(this)">编辑</a>
						<a href="${pageContext.request.contextPath }/shore/delType?typeid=${type.typeid}&shoreid=${MyShore.shoreid}">删除</a>
						 
					 </td>
				 </tr>
		</c:forEach>
		</table>
		
	</c:if>
		<c:if test="${typeList==null }">
			<span style="color:gray;">还没添加任何菜单分类</span>
	</c:if>
	<br/>
	</div>
	
	<div>
		<form action="${pageContext.request.contextPath }/shore/addType" method="post">
			<input type="hidden" name="shoreId" value="${MyShore.shoreid }" />
			<input type="text" name="typename"/>
			<input type="submit" value="添加分类"/>
		</form>
	</div>
	
	</div>
	
</body>
</html>
