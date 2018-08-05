<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="stylesheet" href="/Ordering/css/ShoreMainView.css" type="text/css" />
   	  <script type="text/javascript" src="/Ordering/js/uploadPreview.js"></script>
	  <script>
	  	window.onload=function(){
	  		new uploadPreview({ UpBtn: "up_img", DivShow: "imgdiv", ImgShow: "imgShow" });
	  	}
	  </script>
	<title>添加菜式</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/ShoreMainView.jsp" />
	<div class="main2">
		<span style="font-size:20px;color:gray;">请添加本店的菜式：</span><br/><br/>
		
		<div class="left">
			<form action="${pageContext.request.contextPath }/shore/addMenu" method="post" enctype="multipart/form-data">
				<input type="hidden" name="shoreId" value="${MyShore.shoreid }"/>
				<table style="border-collapse:separate; border-spacing:0px 20px;">
					<tr><td width=120>菜式名字：</td><td width=280><input type="text" name="menuname"/></td></tr>
					<tr><td>菜式介绍：</td><td><input type="text" name="menedetail"/></td></tr>
					<tr><td>菜式价格：</td><td><input type="text" name="menuprice"/></td></tr>
					<tr><td>菜式图片：</td>
						<td>
							<input type="file" id="up_img" name="menuImg"/>
							<input type="hidden" name="menupic" value="" />
						</td>
					</tr>
					<tr><td>菜式类别：</td>
						<td>
							<select name="typeId">
								<c:if test="${typeList!=null }">
									<c:forEach items="${typeList }" var="type">
										<option value="${type.typeid }">${type.typename }
										</option>
									</c:forEach>
								</c:if>
								
							</select>
						</td>
					</tr>
					<tr><td><input style="margin-left:50px;" type="submit" value="添加"/></td><td><input type="reset" value="重新录入"/></td></tr>
					
				</table>
			</form>
		</div>
		
		<div class="right">
			<span style="font-size:25px;color:gray">菜式图片预览：</span>
			<!-- 头像预览 -->
			<div id="imgdiv">
				<img id="imgShow" style="border:1px solid gray;" width=248 height=220 />
			</div>
		</div>
	</div>
	
</body>
</html>
