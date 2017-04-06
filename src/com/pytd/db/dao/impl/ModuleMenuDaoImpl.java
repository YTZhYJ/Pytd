package com.pytd.db.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.pytd.db.dao.ModuleMenuDao;
import com.pytd.db.entity.ModuleMenu;

@SuppressWarnings("unchecked")
public class ModuleMenuDaoImpl implements ModuleMenuDao {

	private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    
	@Override
	public List<ModuleMenu> getModuleMenuAll() {
		List<ModuleMenu> list = null;
		String hql = "FROM ModuleMenu";
		list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public List<ModuleMenu> getModuleMenuByViewable(Boolean viewable) {
		List<ModuleMenu> list = null;
		String hql = "FROM ModuleMenu a where a.viewable = ?";
		list = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, viewable).list();
		return list;
	}

	@Override
	public ModuleMenu getModuleMenuById(Long id) {
		ModuleMenu moduleMenu = null;
		String hql = "FROM ModuleMenu a WHERE a.id = ?";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, id);
		moduleMenu = (ModuleMenu) query.uniqueResult();
		return moduleMenu;
	}

	@Override
	public List<ModuleMenu> getModuleMenuByFather(Long id) {
		List<ModuleMenu> list = null;
		String hql = "FROM ModuleMenu a where a.father.id = ?";
		list = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, id).list();
		return list;
	}

	@Override
	public List<ModuleMenu> getModuleMenuByFather(ModuleMenu fatherModuleMenu) {
		List<ModuleMenu> list = null;
		String hql = "FROM ModuleMenu a where a.father = ?";
		list = sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, fatherModuleMenu).list();
		return list;
	}


	@Override
	public void deleteModuleMenu(ModuleMenu moduleMenu) {
		sessionFactory.getCurrentSession().delete(moduleMenu);
	}
	
	@Override
	public void deleteModuleMenuById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "DELETE ModuleMenu a where a.id = ?";
		session.createQuery(hql).setParameter(0, id).executeUpdate();
	}

	@Override
	public void deleteModuleMenuByFatherId(Long id) {
		String hql = "DELETE ModuleMenu a where a.father.id = ?";
		sessionFactory.getCurrentSession().createQuery(hql).setParameter(0, id).executeUpdate();
	}

	@Override
	public void deleteModuleMenuByFather(ModuleMenu fatherModuleMenu) {
		Session session = sessionFactory.getCurrentSession();
		String hql = "DELETE ModuleMenu a where a.father = ?";
		session.createQuery(hql).setParameter(0, fatherModuleMenu).executeUpdate();
	}

	@Override
	public void updateModuleMenu(ModuleMenu moduleMenu) {
		sessionFactory.getCurrentSession().update(moduleMenu);
	}

	@Override
	public void addModuleMenu(ModuleMenu moduleMenu) {
		sessionFactory.getCurrentSession().save(moduleMenu);  	
	}

	@Override
	public List<ModuleMenu> getFrontedModuleMenu() {
		List<ModuleMenu> list = null;
		System.out.println("####");
//		System.out.println("****"+sessionFactory.getCurrentSession()+"*");
		String hql = "FROM ModuleMenu a where a.isFronted = ? AND a.viewable = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		System.out.println("########");
		query.setParameter(0, true);
		query.setParameter(1, true);
		list = query.list();
		return list;
	}

	@Override
	public List<ModuleMenu> getBackendModuleMenu() {
		List<ModuleMenu> list = null;
		String hql = "FROM ModuleMenu a where a.isBackend = ? AND a.viewable = ? ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, true);
		query.setParameter(1, true);
		list = query.list();
		return list;
	}

	
}