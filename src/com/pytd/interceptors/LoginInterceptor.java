package com.pytd.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.pytd.db.entity.AuthUser;

public class LoginInterceptor implements Interceptor{

	private AuthUser authUser;

	public AuthUser getAuthUser() {
		return authUser;
	}

	public void setAuthUser(AuthUser authUser) {
		this.authUser = authUser;
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy...");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init...");
	}


	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
        System.out.println("----intercept()------");  
        Map<String, Object> session= invocation.getInvocationContext().getSession();  
        if(session.get("username")!=null){  
            System.out.println("登陆成功！");          
            //session.put("username",user.getUsername());  
            return invocation.invoke();  
        }else{  
            System.out.println("登陆失败！");  
            return "checkError";  
        }  
	}
	
}
