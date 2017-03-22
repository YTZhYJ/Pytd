<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>404 Not Found</title>
	<meta http-equiv="keywords" content="404">
	<meta http-equiv="description" content="404 not found">
	<!-- Error CSS -->
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/error.css"/>
  </head>
  
  <body>
	<!-- 代码 开始 -->
	<div id="container">
	  <img class="png" src="<%=path%>/images/error/404.png" />
	  <img class="png msg" src="<%=path%>/images/error/404_msg.png" />
	  <p>
	  	<a href="<%=path%>" >
	  		<img class="png" src="<%=path%>/images/error/404_to_index.png" />
	  	</a>
	  </p>
	</div>
	<div id="cloud" class="png"></div>
	<!-- 代码 结束 -->
  </body>
</html>
