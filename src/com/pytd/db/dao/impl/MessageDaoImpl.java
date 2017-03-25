package com.pytd.db.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.pytd.db.dao.MessageDao;
import com.pytd.db.entity.AuthUser;
import com.pytd.db.entity.DictCategory;
import com.pytd.db.entity.Message;

/**
 * 获取咨询信息
 * 
 * @author zhang
 *
 */

public class MessageDaoImpl implements MessageDao {

	private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    
	@Override
	public List<Message> getMessageAll() {
		List<Message> list = null;
		try{
			String hql = "FROM Message order by sequence , releaseTime desc";
			list = sessionFactory.getCurrentSession().createQuery(hql).list();
		} catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Message> getMessageByCategory(DictCategory category) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Message> getMessageByFuzzy(String fuzzy) {
		List<Message> list = null;
		try{
			String hql = "FROM Message WHERE "
					+ "CONCAT(title,content,releaseTime) LIKE '%?%' "
					+ " order by sequence , releaseTime desc";
			list = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, fuzzy).list();
		} catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public Message getMessageById(Long id) {
		Message message = null;
		try{
			String hql = "FROM Message e WHERE e.id = ?";
			Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, id);
			message =(Message) query.uniqueResult();
		} catch(Exception e){
			e.printStackTrace();
		}
		return message;
	}

	@Override
	public List<Message> getMessageByTitle(String title) {
		List<Message> list = null;
		try{
			String hql = "FROM Message e WHERE e.title like '%?%'  "
					+ "order by sequence , releaseTime desc";
			list = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, title).list();
		} catch (Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Message> getMessageByAuthUser(AuthUser authUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMessageById(Long id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteMessageByCategory(DictCategory category) {
		// TODO Auto-generated method stub
		
	}

	
	
}
