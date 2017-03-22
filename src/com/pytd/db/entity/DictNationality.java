package com.pytd.db.entity;

/**
 * 基础表：民族
 * 
 * @author zhang
 *
 */
public class DictNationality {
	private Long id;                   //名族ID
	private String name_EN;            //民族英文说明
	private String name_CN;            //民族中文说明
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
