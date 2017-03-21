package com.pytd.db.entity;

/**
 * 用户表字段信息
 * 
 * @author zhang
 *
 */
public class ClientUser {

	private Long id;                 //用户ID
	private String account;          //登录账号
	private String password;         //登录密码
	private DictDepartment department; //所在部门ID
	private Boolean isActive;        //是否活跃
	private String realName;         //真是姓名
	private DictGender gender;               //性别ID
	private Long mobilePhone;        //手机号码
	private Long festnetzNumber;     //座机号码
	private String del;              //删除标志
	private String descr;            //描述
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public DictDepartment getDepartment() {
		return department;
	}
	public void setDepartment(DictDepartment department) {
		this.department = department;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public DictGender getGender() {
		return gender;
	}
	public void setGender(DictGender gender) {
		this.gender = gender;
	}
	public Long getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(Long mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public Long getFestnetzNumber() {
		return festnetzNumber;
	}
	public void setFestnetzNumber(Long festnetzNumber) {
		this.festnetzNumber = festnetzNumber;
	}
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
}
