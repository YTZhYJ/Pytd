<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" errorPage="True"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>起始页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="起始页面">
	<%@ include file="/static/include_js.html" %>
  </head>
  <body>
	<!-- Sign in  -->
   	<div class="login_header">
   		<img alt="Logo标志" src="images/logo.png" height="60" width="270">
   	</div>
   	<div class="login_body">
   		<div class="login_body_left">
   			<img alt="登录图片" src="images/7.jpg" width="380px" height="298px">
   		</div>
 		<form action="loginAction" method="post" id="loginform">
	   		<div class="login_body_right">
	   			<div class="login_content">
	   				<div class="login_user">
						<span>邮箱/用户名/已验证手机</span> 				
	   					<div class="login_user_text">
	   						<input type="text" class="login_user_input" name="username" value=""/>
	   					</div>
	   				</div>
	   				<div class="login_user">
						<span>密码</span>	    				
	   					<div class="login_user_text">
	   						<input type="password" class="login_user_input" name="password" value=""/>
	   					</div>
	   				</div>
	   				<div class="login_others">
						<input type="checkbox" name="autoLogin" id="autoLogin"><span>自动登录</span>
						<input type="checkbox" name="safetyLogin" id="safetyLogin"><span>安全控件登录</span>
						<a href="#">忘记密码?</a>
	   				</div>
	   				<div class="button">
	   					<a class="btn_success" onclick="document.getElementById('loginform').submit();" href="#">登     陆</a>
	   					<a class="btn_danger" href="registerAction">注      册</a>
	   				</div>
	   				<div>
	   					<span>${requestScope.errorInfoString}</span>
	   				</div>
	   			</div>
	   		</div>
  		</form>
   	</div>
  	<%@ include file="/static/footer.jsp" %>
  </body>
</html>