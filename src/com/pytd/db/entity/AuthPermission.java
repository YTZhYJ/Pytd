package com.pytd.db.entity;

import java.sql.Date;

/**
 * 权限表
 * 
 * @author zhang
 *
 */
public class AuthPermission {

	private Long id;                  //组id
	private String code;              //权限编码
	private String name_CN;           //中文组名
	private String name_EN;           //英文组名
	private Date createTime;          //创建时间
	private String descr;             //描述
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName_CN() {
		return name_CN;
	}
	public void setName_CN(String name_CN) {
		this.name_CN = name_CN;
	}
	public String getName_EN() {
		return name_EN;
	}
	public void setName_EN(String name_EN) {
		this.name_EN = name_EN;
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
