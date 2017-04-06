<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" errorPage="True"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%@ include file="/static/include_js.html" %>
  </head>
  
  <body>
  	<div>
  	<%@ include file="/static/header.jsp"%>
  	</div>
  	<br>
    This is my JSP page. <br>
  </body>
  	<%@ include file="/static/footer.jsp"%>
</html>
