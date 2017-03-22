package com.pytd.db.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface CommonlyDao<T> {
	/**
     * 保存
     * 
     * @param entity
     */
    public void save(T entity);

    /**
     * 根据主键删除
     * 
     * @param ids
     */
    public void deleteByIds(Serializable... ids);

    /**
     * 根据集合删除
     * 
     * @param list
     */
    public void deleteByList(List<T> list);

    /**
     * 修改
     * 
     * @param entity
     */
    public void update(T entity);

    /**
     * 更具主键查询
     * 
     * @param id
     * @return
     */
    public T queryById(Serializable id);

    /**
     * 查询全部
     * 
     * @return
     */
    public List<T> queryAll();

    /**
     * 根据条件查询 并且按照指定的排序方式排序
     * 
     * @param condition
     * @param params
     * @param orderby
     * @return
     */
    public List<T> queryCondition(String condition, Object[] params,
            Map<String, String> orderby);

    /**
     * 分页查询全部
     * 
     * @param offset
     * @param length
     * @return
     */
    public List<T> queryAllPage(int offset, int length);
}
