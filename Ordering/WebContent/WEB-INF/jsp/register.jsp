<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
	<head>
	  <meta charset="utf-8" />
	  <title>用户注册</title>
	  <link rel="stylesheet" href="/Ordering/css/register.css" type="text/css" />
	  <link rel="stylesheet" href="/Ordering/css/common.css" type="text/css" />
	</head>
  
	<body class="main">
	<h1 class="title">欢迎注册</h1>
		<div class="login1">
			<h3 class="font1">用户注册界面 </h3>
			
            <div class="login2">
            <form id="login_form" action="${pageContext.request.contextPath }/user/register" method="post">
		     	<table>	
		     		<tr><td>用户名：</td><td><input type="text" name="username" /></td></tr>
		     		<tr><td>账号密码：</td><td><input type="password" name="password" /></td></tr>
		     		<tr><td>再次确认：</td><td><input type="password" name="password1" /></td></tr>
		     		<tr><td>真实姓名：</td><td><input type="text" name="realname" /></td></tr>
		     		<tr><td>联系电话：</td><td><input type="text" name="mobile" /></td></tr>
		     		<tr><td>地址：</td><td><input type="text" name="address" /></td></tr>
		     		<c:if test="${error!=null }">
		     			<tr><td colspan=2><span style="color:red;">${error }</span></td></tr>
		     		</c:if>
		     		
		     		<tr>
		     			<td><input type="submit" class="submit1" value="注册" /> </td>
		     			<td><input type="button" class="submit1" onclick="window.location.href('${pageContext.request.contextPath }/index.jsp')" value="返回" /> </td>
		   			</tr>
		     	</table>     
   		  </form>
       	  </div>
  	  </div>
  </body>
</html>