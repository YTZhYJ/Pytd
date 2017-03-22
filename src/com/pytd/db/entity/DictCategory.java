package com.pytd.db.entity;

/**
 * 基础表：信息分类
 * @author zhang
 *
 */
public class DictCategory {
	private Long id;                   //分类ID
	private String name_CN;            //分类中文说明
	private String name_EN;            //分类英文说明
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
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
}
