package com.pytd.db.action.business;

import java.util.List;

import com.pytd.db.biz.AuthUserBiz;
import com.pytd.db.biz.MessageBiz;
import com.pytd.db.entity.DictCategory;
import com.pytd.db.entity.Message;

public class MessageViewAction {
	
	MessageBiz messageBiz;

	public MessageBiz getMessageBiz() {
		return messageBiz;
	}

	public void setMessageBiz(MessageBiz messageBiz) {
		this.messageBiz = messageBiz;
	}

	
	/**
	 * 根据分类获取不同的信息
	 * @param category 分类ID
	 * @return
	 */
	public List<Message> getMessagesByCategory(Long category){
		List<Message> list = null;
		
		//
		
		return list;
	}
	
	
}
