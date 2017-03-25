package com.pytd.db.action.auth;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.pytd.db.biz.AuthUserBiz;
import com.pytd.db.entity.AuthUser;

public class AuthUserAction {

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
     * 判断登录函数.</br>
     * @author zhang
     * @return
     */
	public String login(){
		ActionContext actionContext = ActionContext.getContext();
		if( !("".equals(username) || "".equals(password))){
			authUser = authUserBiz.getAuthUsersByAccount(username);
			if(authUser == null){
				//No records
				actionContext.put("errorInfo", "用户不存在，请确认后登录");
				return Action.LOGIN;
			}
			if(authUser.getIsActive() == false){
				//不活跃
				actionContext.put("errorInfo", "用户已注销");
				return Action.LOGIN;
			}
			if(password.equals(authUser.getPassword())){
				//登录写入Session
				//自动登录处理
				if("on".equals(autoLogin)){
				}
				
				//安全控件处理
				
				//登录成功后放到session中
				actionContext.getSession().put("logged-in", authUser);
				return Action.SUCCESS;
			}else{
				actionContext.put("errorInfo","账号密码错误");
				return Action.LOGIN;
			}
		}else{
			actionContext.put("errorInfo", "账号密码为空");
			return Action.LOGIN;
		}
	}
	
	/**
	 * 注销登录.</br>
	 * @author zhang
	 * @return
	 */
	public String logout(){
        session = ActionContext.getContext().getSession();  
        session.remove("logged-in");  
        return Action.SUCCESS;  
	}
	
	
	public AuthUser getAuthUser() {
		return authUser;
	}
	public void setAuthUser(AuthUser authUser) {
		this.authUser = authUser;
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
	public AuthUserBiz getAuthUserBiz() {
		return authUserBiz;
	}
	public void setAuthUserBiz(AuthUserBiz authUserBiz) {
		this.authUserBiz = authUserBiz;
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
	
	
}
