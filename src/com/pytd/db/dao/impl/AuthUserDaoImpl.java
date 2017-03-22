package com.pytd.db.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pytd.db.dao.AuthUserDao;
import com.pytd.db.entity.AuthUser;
import com.pytd.db.entity.DictDepartment;
import com.pytd.db.entity.DictGender;

public class AuthUserDaoImpl implements AuthUserDao {

	private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    
	@Override
	public List<AuthUser> getAuthUserAll() {
		List<AuthUser> list = null;
		try{
			String hql = "FROM AuthUser";
			list = sessionFactory.getCurrentSession().createQuery(hql).list();
		} catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AuthUser> getAuthUserByFuzzy(String fuzzy) {
		List<AuthUser> list = null;
		try{
			String hql = "FROM AuthUser WHERE "
					+ "CONCAT(account,realName,mobilePhone,festnetzNumber,descr) LIKE '%?%' ";
			list = sessionFactory.getCurrentSession().createQuery(hql).list();
		} catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public AuthUser getAuthUsersByAccount(String account) {
		AuthUser authUser = null;
		try{
			String hql = "FROM AuthUser e WHERE e.name = ?";
			Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, account);
			authUser =(AuthUser) query.uniqueResult();
		} catch(Exception e){
			e.printStackTrace();
		}
		return authUser;
	}

	@Override
	public AuthUser getAuthUserById(Long id) {
		AuthUser authUser = null;
		try{
			String hql = "FROM AuthUser e WHERE e.id = ?";
			Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, id);
			authUser =(AuthUser) query.uniqueResult();
		} catch(Exception e){
			e.printStackTrace();
		}
		return authUser;
	}

	@Override
	public void saveOrUpdate(AuthUser authUser) {

		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = null;
		try{ 
			//开始事务
			transaction = session.beginTransaction();
			//持久化操作
			session.saveOrUpdate(authUser);
			//提交事务
			transaction.commit();
		} catch (Exception exception) { 
			if(transaction != null) {
				//事务回滚
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteAuthUserById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAuthUserByAccount(String account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAuthUserByIsActive(Boolean isActive) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AuthUser> getAuthUserByDepartment(DictDepartment department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthUser> getAuthUserByGender(DictGender gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthUser> getAuthUserByRealName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AuthUser> getAuthUserByPhoneNumber(Long phoneNumber) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
