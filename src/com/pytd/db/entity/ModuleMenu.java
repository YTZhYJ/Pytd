package com.pytd.db.entity;
/**
 * 菜单表
 * 
 * @author zhang
 *
 */
public class ModuleMenu {

	private Long id;                      //菜单模块ID
	private ModuleMenu father;           //上一级菜单项
	private String url;                   //本级菜单的URL
	private String name_CN;               //中文名称
	private String name_EN;               //英文名称
	private String sequence;              //顺序排序
	private Boolean viewable;             //是否可见
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ModuleMenu getFather() {
		return father;
	}
	public void setFather(ModuleMenu father) {
		this.father = father;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public Boolean getViewable() {
		return viewable;
	}
	public void setViewable(Boolean viewable) {
		this.viewable = viewable;
	}
	
}
