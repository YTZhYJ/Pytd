package com.pytd.db.biz.impl;

import java.util.List;

import com.pytd.db.biz.AuthUserBiz;
import com.pytd.db.dao.AuthUserDao;
import com.pytd.db.entity.AuthUser;
import com.pytd.db.entity.DictDepartment;
import com.pytd.db.entity.DictGender;

public class AuthUserBizImpl implements AuthUserBiz {
	
	private AuthUserDao authUserDao ;

	public AuthUserDao getAuthUserDao() {
		return authUserDao;
	}

	public void setAuthUserDao(AuthUserDao authUserDao) {
		this.authUserDao = authUserDao;
	}

	@Override
	public AuthUser getAuthUsersByAccount(String account) {
		return authUserDao.getAuthUsersByAccount(account);
	}

	@Override
	public AuthUser getAuthUserById(Long id) {
		return authUserDao.getAuthUserById(id);
	}

	@Override
	public void saveOrUpdate(AuthUser authUser) {
		authUserDao.saveOrUpdate(authUser);
	}

	@Override
	public List<AuthUser> getAuthUserAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthUser> getAuthUserByFuzzy(String fuzzy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthUser> getAuthUserByDepartment(DictDepartment department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthUser> getAuthUserByGender(DictGender gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthUser> getAuthUserByRealName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthUser> getAuthUserByPhoneNumber(Long phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAuthUserById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAuthUserByAccount(String account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAuthUserByIsActive(Boolean isActive) {
		// TODO Auto-generated method stub
		
	}
	
}
