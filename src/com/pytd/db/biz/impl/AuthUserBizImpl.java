package com.pytd.db.biz.impl;

import com.pytd.db.biz.AuthUserBiz;
import com.pytd.db.dao.AuthUserDao;

public class AuthUserBizImpl implements AuthUserBiz {
	
	private AuthUserDao authUserDao ;

	public AuthUserDao getAuthUserDao() {
		return authUserDao;
	}

	public void setAuthUserDao(AuthUserDao authUserDao) {
		this.authUserDao = authUserDao;
	}
	
}
