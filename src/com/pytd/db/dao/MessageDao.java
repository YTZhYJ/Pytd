package com.pytd.db.dao;

import java.util.List;

import com.pytd.db.entity.Message;

/**
 * 对message信息表的操作方法接口
 * 
 * @author zhang
 *
 */
public interface MessageDao {

    public boolean checkMessage(Message message);
    public boolean checkMessageById(Long id);

    // 添加
    public boolean addMessage(Message message);

    // 删除
    public boolean deleteMessageById(Long id);

    // 修改信息
    public boolean updateMessage(Message message);
    public boolean updateMessageById(Long id);
    public void saveOrUpdate(Message message);

    // 查询
    public List<Message> queryMessage(Message message);
    public Message queryMessageById(Long id);
    public List<Message> queryMessageByFuzzy(Object obj);//模糊查询

    // 查询所有
    public List<Message> queryAll();
}
