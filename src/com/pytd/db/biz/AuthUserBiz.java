package com.pytd.db.biz;

import java.util.List;

import com.pytd.db.entity.AuthUser;
import com.pytd.db.entity.DictDepartment;
import com.pytd.db.entity.DictGender;


public interface AuthUserBiz{


	
	/**
	 * 获取所有用户信息
	 * @return
	 */
	public List<AuthUser> getAuthUserAll();
	
	/**
	 * 模糊匹配，查询所有包含fuzzy字符的数据
	 * @param fuzzy
	 * @return
	 */
	public List<AuthUser> getAuthUserByFuzzy(String fuzzy);

	/**
	 * 根据用户账号信息获取用户的所有信息
	 * @param account
	 * @return
	 */
	public AuthUser getAuthUsersByAccount(String account);
	
	/**
	 * 根据部门id获取所有用户信息
	 * @param department
	 * @return
	 */
	public List<AuthUser> getAuthUserByDepartment(DictDepartment department);
	
	/**
	 * 根据性别ID获取所有用户信息
	 * @param gender
	 * @return
	 */
	public List<AuthUser> getAuthUserByGender(DictGender gender);
	
	/**
	 * 根据真实姓名获取用户信息
	 * @param name
	 * @return
	 */
	public List<AuthUser> getAuthUserByRealName(String name);
	
	/**
	 * 根据电话号码（移动/座机）获取用户信息
	 * @param phoneNumber
	 * @return
	 */
	public List<AuthUser> getAuthUserByPhoneNumber(Long phoneNumber);
	
	/**
	 * 根据用户的ID信息获取用户的所有信息
	 * @param id
	 * @return
	 */
	public AuthUser getAuthUserById(Long id);
	
	/**
	 * 保存或更新用户信息
	 * @param authUser
	 * @return
	 */
	public void saveOrUpdate(AuthUser authUser);
	
	/**
	 * 根据ID信息删除数据
	 * @param id
	 */
	public void deleteAuthUserById(Long id);
	
	/**
	 * 根据登录账号删除用户
	 * @param account
	 */
	public void deleteAuthUserByAccount(String account);
	
	/**
	 * 根据是否活跃删除用户
	 * @param isActive
	 */
	public void deleteAuthUserByIsActive(Boolean isActive);
	

}
