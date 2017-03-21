package com.pytd.db.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pytd.db.config.HibernateSessionFactory;
import com.pytd.db.dao.MessageDao;
import com.pytd.db.entity.Message;

/**
 * 获取咨询信息
 * 
 * @author zhang
 *
 */

public class MessageDaoImpl implements MessageDao {

	Session session = HibernateSessionFactory.getSession();
	
	@Override
	public boolean checkMessage(Message message) {


		return false;
	}

	@Override
	public boolean checkMessageById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addMessage(Message message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMessageById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMessage(Message message) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(message);
		return false;
	}

	@Override
	public boolean updateMessageById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveOrUpdate(Message message) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Message> queryMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message queryMessageById(Long id) {
		Message message = null;
		try{
			message = (Message) session.get(Message.class,id);
		}catch (Exception e){
			e.printStackTrace();
		} finally{
			session.close();
		}
		return message;
	}

	@Override
	public List<Message> queryMessageByFuzzy(Object obj) {
		List <Message> list = queryAll();
		List <Message> res = null;
		for(int i = 0 ; i < list.size() ; i++){
			Message message = list.get(i);
			if(message.getTitle().contains(obj.toString())||
					message.getContent().contains(obj.toString())||
					message.getAttachment().contains(obj.toString())){
				res.add(message);
			}
		}
		return res;
	}

	@Override
	public List<Message> queryAll() {
		String hql = "FROM Message";
		List<Message> list = null;
		try{
			session.beginTransaction();
			list = session.createQuery(hql).list();
		} catch (Exception e){
			e.printStackTrace();
		} finally{
			session.getTransaction().commit();
			session.close();
		}
		return list;
	}
	
}
