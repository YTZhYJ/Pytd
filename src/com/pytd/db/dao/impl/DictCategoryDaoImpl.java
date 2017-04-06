package com.pytd.db.dao.impl;

import org.hibernate.SessionFactory;

import com.pytd.db.dao.DictCategoryDao;

public class DictCategoryDaoImpl implements DictCategoryDao {

	private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    
}
