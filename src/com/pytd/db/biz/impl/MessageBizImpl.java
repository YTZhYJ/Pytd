package com.pytd.db.biz.impl;

import java.util.List;

import com.pytd.db.biz.MessageBiz;
import com.pytd.db.dao.DictCategoryDao;
import com.pytd.db.dao.MessageDao;
import com.pytd.db.entity.AuthUser;
import com.pytd.db.entity.DictCategory;
import com.pytd.db.entity.Message;

public class MessageBizImpl implements MessageBiz {

	MessageDao messageDao;
	DictCategoryDao categoryDao;
	
	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public DictCategoryDao getCategoryDao() {
		return categoryDao;
	}

	public void setCategoryDao(DictCategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	@Override
	public List<Message> getMessageAll() {
		return messageDao.getMessageAll();
	}

	@Override
	public Message getMessageById(Long id) {
		// TODO Auto-generated method stub
		return messageDao.getMessageById(id);
	}

	@Override
	public List<Message> getMessageByTitle(String title) {
		return messageDao.getMessageByTitle(title);
	}

	@Override
	public List<Message> getMessageByCategory(DictCategory category) {
		return messageDao.getMessageByCategory(category);
	}

	@Override
	public List<Message> getMessageByFuzzy(String fuzzy) {
		return messageDao.getMessageByFuzzy(fuzzy);
	}

	@Override
	public List<Message> getMessageByAuthUser(AuthUser authUser) {
		return messageDao.getMessageByAuthUser(authUser);
	}

	@Override
	public void saveOrUpdate(Message message) {
		messageDao.saveOrUpdate(message);
	}

	@Override
	public void deleteMessageById(Long id) {
		messageDao.deleteMessageById(id);
	}

	@Override
	public void deleteMessageByCategory(DictCategory category) {
		messageDao.deleteMessageByCategory(category);
	}

	@Override
	public List<Message> getMessageByCategroy(Long categoryId) {

		
		return null;
	}

	@Override
	public List<Message> getMessageByAuthUser(Long authUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMessageByCategory(Long categoryId) {
		// TODO Auto-generated method stub
		
	}

}
