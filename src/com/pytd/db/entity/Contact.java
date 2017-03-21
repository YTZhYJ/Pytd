package com.pytd.db.entity;

import java.sql.Date;

/**
 * contact us 联系表
 * 
 * @author zhang
 *
 */
public class Contact {

	private Long id;                   //id
	private String title;              //标题说明
	private String content;            //内容
	private Date submitTime;           //提交时间
	private Date operateTime;          //最后操作时间
	private String contacts;           //联系方式
	private ClientUser user;           //提交用户名
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getSubmitTime() {
		return submitTime;
	}
	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}
	public Date getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public ClientUser getUser() {
		return user;
	}
	public void setUser(ClientUser user) {
		this.user = user;
	}
	
	
}
