package com.pytd.db.entity;
/**
 * 新闻展示序号表
 * 
 * @author zhang
 *
 */
public class DictSequence {

	private Long id;              //排序信息ID
	private Integer seq;            //排序等级
	private String descr;   //排序描述
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	
}
