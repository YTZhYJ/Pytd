package com.pytd.db.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.pytd.db.dao.CommonlyDao;

public class CommonlyDaoImpl<T> implements CommonlyDao<T> {
	private SessionFactory sessionFactory;
	
    public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
     * 保存方法
     */
    @Override
    public void save(T entity) {
    	sessionFactory.getCurrentSession().save(entity);
    }

    /**
     * 利用可变参数的形式来达到可以根据id同时删除一个或多个对象的目的 这里参数的类型为Serializable
     */
    @Override
    public void deleteByIds(Serializable... ids) {
        if (ids != null && ids.length > 0) {
            for (Serializable key : ids) {
                Object entity = this.queryById(key);
                if (entity != null) {
                	sessionFactory.getCurrentSession().delete(entity);
                }
            }
        }
    }

    /**
     * 通过集合来删除多个对象 这种方法是为了便于使用deleteAll()方法
     */
    @Override
    public void deleteByList(List<T> list) {
    	//sessionFactory.getCurrentSession().d.deleteAll(list);
    }

    /**
     * 更新方法
     */
    @Override
    public void update(T entity) {
    	sessionFactory.getCurrentSession().update(entity);
    }

    /**
     * 这是一个获取当前元素真实类的方法 原理是通过反射机制 在下面的各项查找方法中都有应用
     * 
     * @return
     */
    @SuppressWarnings({ "rawtypes" })
    public Class getEntityClass() {
        Type type = this.getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        return (Class) pt.getActualTypeArguments()[0];
    }

    /**
     * 根据Id查找对象是最为应用普遍的
     */
    @SuppressWarnings("unchecked")
    public T queryById(Serializable id) {
        return (T) sessionFactory.getCurrentSession().get(this.getEntityClass(), id);
    }

    /**
     * 查找所有对象
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<T> queryAll() {
        // 注意这里的from后面一定要多加一个空格
        return sessionFactory.getCurrentSession().createQuery("from " + this.getEntityClass().getName()).list();
    }

    /**
     * 根据条件查找多个对象并按照一定规则排序 这个方法拼接了一个HQL语句，要注意HQL语句的格式 参数介绍 String condition
     * 是预设的筛选条件的属性名 Object[] params 是对应预设的筛选条件的属性值，这里设置为Object数组是为了方便传参
     * Map<String, String> orderby 是存储设置的排序方式的信息的Map集合
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<T> queryCondition(String condition, Object[] params,
            Map<String, String> orderby) {
        // 编写的HQL语句头部
        // 这里要注意where后面的1=1属性
        // 之所以设置这样一个属性是为了保证语HQL语句的完整性
        String hqlHead = "from " + this.getEntityClass().getName()
                + " where 1=1 ";
        // 创建一个StringBuffer用来存储遍历Map的数据
        StringBuffer buffer = new StringBuffer("");
        // 判断Map是否为空
        if (orderby != null && orderby.size() > 0) {
            // 向StringBuffer添加 order by 字符串用于设置排序
            buffer.append(" order by ");
            // 遍历Map
            for (Map.Entry<String, String> map : orderby.entrySet()) {
                buffer.append(" " + map.getKey() + " " + map.getValue() + ",");
            }
            // 遍历Map之后要删除最后一个逗号
            buffer.deleteCharAt(buffer.length() - 1);
        }
        // 拼接成完整的HQL语句
        String wholeHql = hqlHead + condition + buffer.toString();
        // 执行查询
        //return sessionFactory.getCurrentSession().createQuery(wholeHql).find(wholeHql, params);
        //from xxx where x=? and y=? or z=?;
        Query query = sessionFactory.getCurrentSession().createQuery(wholeHql);
        for (int i = 0; i < params.length; i++) {
			Object object = params[i];
			query.setParameter(i, object);
		}
        return query.list();
    }

    /**
     * 分页查询 参数介绍 final int offset 起始查询的位置,从0开始 final int length 查询的步长
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public List<T> queryAllPage(final int offset, final int length) {
        // 获取类的名字
        /*final String className = this.getEntityClass().getName();
        return this.getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(org.hibernate.Session session)
                    throws HibernateException, SQLException {
                Query query = session.createQuery("from " + className);
                query.setFirstResult(offset);
                query.setMaxResults(length);
                return query.list();
            }
        });*/
    	return null;
    }
}
