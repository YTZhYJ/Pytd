package com.pytd.db.action;

import com.pytd.db.biz.AuthUserBiz;
import com.pytd.db.entity.AuthUser;

public class AuthUserAction {
	AuthUserBiz authUserBiz;

	public AuthUserBiz getAuthUserBiz() {
		return authUserBiz;
	}

	public void setAuthUserBiz(AuthUserBiz authUserBiz) {
		this.authUserBiz = authUserBiz;
	}
	
	public AuthUser getAuthUserById(Long id){
		AuthUser authUser = (AuthUser) authUserBiz.queryById(id);
		return authUser;
	}
	
}
