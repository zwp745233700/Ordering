<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html>
	<head>
	  <meta charset="utf-8" />
	  <title>帐号登录</title>
	  
	  <link rel="stylesheet" href="/Ordering/css/login.css" type="text/css" />
	  <link rel="stylesheet" href="/Ordering/css/common.css" type="text/css" />
	</head>
  
	<body class="main">
		<h1 class="title">欢迎登陆订餐系统：</h1>
		<div class="login1">
			<h3 class="font1">帐号登录 </h3>
            <div class="login2">
            	
                <form id="login_form" action="${pageContext.request.contextPath }/user/login" method="post">
	                                        用户名：<input type="text" id="username" name="username"  placeholder="输入用户名" /><br/>
	                    <div></div>
	                   	密  &nbsp;  码：<input type="password" id="password" name="password" placeholder="输入密码"/><br/>
						
						<c:if test="${error!=null }">
							<span class="font2">${error }</span>
						</c:if>
						
	                    <div class="">
	                    	<span>
	                        	<input type="checkbox" name="rememberMe" id="rememberMe" value="true"/>
	                        	<label for="rememberMe">下次自动登录</label>  &nbsp;&nbsp;&nbsp;&nbsp;
	                        </span>
	                        <span><a href="#">忘记密码</a></span>
	                    </div>
						<input type="submit" class="submit1" value="立即登陆" /> 
						<input type="button" class="submit1" onclick="window.location.href('${pageContext.request.contextPath }/index.jsp')" value="返回主界面" />
                  </form>
                  
                  <div>
                  	<span>还没有帐号？</span><a href="${pageContext.request.contextPath }/user/toregister">立即注册</a>
               	  </div>
         	  </div>
       	  </div>
  </body>
</html>
