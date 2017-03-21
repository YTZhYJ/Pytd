package com.pytd.db.entity;

import java.sql.Date;

/**
 * 角色与权限组的对应关系表
 * 
 * @author zhang
 *
 */
public class AuthUser2Group {

	private Long id;                //对应表ID
	private AuthUser user;          //对应用户
	private AuthGroup group;        //对应组
	private Date createTime;        //创建日期
	private String descr;           //描述
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public AuthUser getUser() {
		return user;
	}
	public void setUser(AuthUser user) {
		this.user = user;
	}
	public AuthGroup getGroup() {
		return group;
	}
	public void setGroup(AuthGroup group) {
		this.group = group;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
}
