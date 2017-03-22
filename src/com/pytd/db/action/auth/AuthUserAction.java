package com.pytd.db.action.auth;

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
	
	
}
