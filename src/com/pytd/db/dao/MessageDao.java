package com.pytd.db.dao;

import java.util.List;

import com.pytd.db.entity.AuthUser;
import com.pytd.db.entity.Message;

/**
 * 对message信息表的操作方法接口
 * 
 * @author zhang
 *
 */
public interface MessageDao {

    public List<Message> getMessageAll();
    
    public Message getMessageById(Long id);
    
    public List<Message> getMessageByTitle(String title);
    
    public List<Message> getMessageByFuzzy(String fuzzy);
    
    public List<Message> getMessageByAuthUser(AuthUser authUser);
    
    public void saveOrUpdate(Message message);
    
    public void deleteMessageById(Long id);
    
    
}
