/views/basic/sex-list.jsp<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" errorPage="500-error.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>起始页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="起始页面">
	<%@ include file="/import/import_js.html" %>
  </head>
  <body>
  	<div class="register_header">
  	</div>
  	<form action="registerAction" id="registerform" method="post">
	  	<div class="register_body">
	  		<div class="reg_body_head">
	  			<span>欢迎您注册会员，如果您已经有账号，请【<a href="<%=request.getContextPath() %>">登   录</a>】</span>
	  		</div>
	  		<div class="reg_body_form">
				<table>
					<tr>
						<th>登录名</th>
						<td><input value=""></td>
					</tr>
					<tr>
						<th>密码</th>
						<td><input type="password" value=""></td>
					</tr>
					<tr>
						<th>重复密码</th>
						<td><input type="password" value=""></td>
					</tr>
					<tr>
						<th>用户名</th>
						<td><input value=""></td>
					</tr>
					<tr>
						<th>性别</th>
						<td><input value=""></td>
					</tr>
					<tr>
						<th>手机号码</th>
						<td><input value=""></td>
					</tr>
					<tr>
						<th>电子邮箱</th>
						<td><input value=""></td>
					</tr>
					<tr>
						<th>生日</th>
						<td><input value=""></td>
					</tr>
				</table>
	  			
				<div class="button center">
					<a class="btn_success" onclick="document.getElementById('registerform').submit();" href="#">立即注册</a>
				</div>
	  		</div>
	  	</div>
  	</form>
  	<%@ include file="/common/import_footer.jsp" %>
  </body>
</html>
