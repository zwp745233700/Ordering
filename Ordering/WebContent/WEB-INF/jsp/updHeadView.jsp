<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html>
	<head>
	  <meta charset="utf-8" />
	  <title>修改商家头像</title>
	  
	  <link rel="stylesheet" href="/Ordering/css/updHeadView.css" type="text/css" />
	  <link rel="stylesheet" href="/Ordering/css/common.css" type="text/css" />
	  <script type="text/javascript" src="/Ordering/js/uploadPreview.js"></script>
	  <script>
	  	window.onload=function(){
	  		new uploadPreview({ UpBtn: "up_img", DivShow: "imgdiv", ImgShow: "imgShow" });
	  	}
	  </script>
	</head>
  
	<body class="main">
	<h1 class="title">修改商店头像</h1>
		<div class="oldHead">
			<span class="ziti">当前头像：</span>
			<!-- 没有设置头像，则显示默认头像 -->
         	  <c:if test="${MyShore.shorepic==null }">
			  		<img src="/Ordering/images/headpic.jpg" style="border:1px solid gray;" width=248 height=224 /><br/>
		      </c:if>
		      <!-- 如果设置了头像呢，则显示用户头像 -->
		      <c:if test="${MyShore.shorepic!=null }">
				  	<img src="/img/${MyShore.shorepic }" style="border:1px solid gray;" width=248 height=224 /><br/>
		      </c:if>
       	 </div>
       	 <div class="newHead">
			<span class="ziti">新头像：</span>
			<!-- 头像预览 -->
			<div id="imgdiv">
				<img id="imgShow" style="border:1px solid gray;" width=248 height=224 />
			</div>
       	 </div><br/>
       	 <div class="chooseImg">
       		 <form action="${pageContext.request.contextPath }/shore/updShoreImg" method="post" enctype="multipart/form-data">
      	 		<input type="hidden" name="shoreid" value="${MyShore.shoreid }" />
      	 		 <input type="file" id="up_img" name="ShoreImg"/><br /><br/>
      	 		 <input type="submit" class="submit1" value="更改" />
      	 		 <input type="reset" class="submit1" value="取消"/>
      	 		 <a href="${pageContext.request.contextPath }/shore/backMain"><input type="button" class="submit1" value="返回" /></a>
      	 	 </form>
       	 </div>
  </body>
</html>
