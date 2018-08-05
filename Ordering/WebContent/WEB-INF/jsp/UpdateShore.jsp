<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
	  <meta charset="utf-8" />
	  <title>修改界面</title>
	  <link rel="stylesheet" href="/Ordering/css/register.css" type="text/css" />
	  <link rel="stylesheet" href="/Ordering/css/common.css" type="text/css" />
	</head>
  
	<body class="main">
		<div class="login1">
			<h3 class="font1">修改商家信息 </h3>
			
            <div class="login2">
            <form id="login_form" action="${pageContext.request.contextPath }/shore/UpdateShore" method="post">
		     	<input type="hidden" name="shoreid" value="${MyShore.shoreid }"/>
		     	<table>	
		     		<tr><td>登陆账号：</td><td><input type="text" name="username" value="${MyShore.username }" readonly="readonly"/></td></tr>
		     		<tr><td>商店名称：</td><td><input type="text" name="shorename" value="${MyShore.shorename }"/></td></tr>
		     		<tr>
		     			<td>商店类别：</td>
		     			<td>
		     				<select name="shoretypeId" size="1">
		     					<c:forEach items="${shoreTypeList }" var="shoreType">
		     						<option value="${shoreType.shoretypeid }" 
		     							<c:if test="${MyShore.shoretypeId==shoreType.shoretypeid }">selected</c:if>>${shoreType.shoretypename }
	     							</option>
		     					</c:forEach>
		     				</select>
		
	     				</td>
	     			</tr>
		     		
		     		<tr><td>商家地址：</td><td><input type="text" name="address" value="${MyShore.address }"/></td></tr>
		     		<tr><td>联系电话：</td><td><input type="text" name="shoremoblie" value="${MyShore.shoremoblie }"/></td></tr>

		     		
		     		<tr>
		     			<td><input type="submit" class="submit1" value="修改" /> </td>
		     			<td><a href="${pageContext.request.contextPath }/shore/backMain"><input type="button" class="submit1" value="返回" /></a> </td>
		   			</tr>
		     	</table>     
   		  </form>
       	  </div>
  	  </div>
  </body>
</html>