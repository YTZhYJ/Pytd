package com.pytd.db.action.auth;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.Action;
import com.pytd.db.biz.AuthUserBiz;
import com.pytd.db.entity.AuthUser;

public class AuthUserRegisterAction {

	private AuthUser authUser;
	private AuthUserBiz authUserBiz;
	
	private String username;//登录名
	private String password;//密码
	private String autoLogin;//自动登录
	private String safetyLogin;//安全控件登录
	
    private HttpServletResponse response;//
    private HttpServletRequest request;
    private Map<String, Object> session; 
	/**
	 * 注册登录.</br>
	 * @author zhang
	 * @return
	 */
	public String register(){

		if(username != null && password != null){
			//注册成功，返回登录界面
			
			
			return Action.LOGIN;
		}
		return Action.ERROR;
	}
	
	public AuthUser getAuthUser() {
		return authUser;
	}
	public void setAuthUser(AuthUser authUser) {
		this.authUser = authUser;
	}
	public AuthUserBiz getAuthUserBiz() {
		return authUserBiz;
	}
	public void setAuthUserBiz(AuthUserBiz authUserBiz) {
		this.authUserBiz = authUserBiz;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAutoLogin() {
		return autoLogin;
	}
	public void setAutoLogin(String autoLogin) {
		this.autoLogin = autoLogin;
	}
	public String getSafetyLogin() {
		return safetyLogin;
	}
	public void setSafetyLogin(String safetyLogin) {
		this.safetyLogin = safetyLogin;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
}
