package com.pytd.db.entity;

import java.sql.Date;

/**
 * 部门表
 * 
 * @author zhang
 * @date 2017.03.18
 */
public class DictDepartment {
	
	private Long id;                   //部门id
	private String name_EN;            //部门英文名字
	private String name_CN;            //部门中文名字
	private Date setupTime;            //部门成立时间
	private String manager;            //部门经理
	private String descr;              //描述
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName_EN() {
		return name_EN;
	}
	public void setName_EN(String name_EN) {
		this.name_EN = name_EN;
	}
	public String getName_CN() {
		return name_CN;
	}
	public void setName_CN(String name_CN) {
		this.name_CN = name_CN;
	}
	public Date getSetupTime() {
		return setupTime;
	}
	public void setSetupTime(Date setupTime) {
		this.setupTime = setupTime;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}

}
