package com.pytd.db.biz;

import java.util.List;

import com.pytd.db.entity.AuthUser;
import com.pytd.db.entity.DictCategory;
import com.pytd.db.entity.Message;

public interface MessageBiz {

    public List<Message> getMessageAll();
    
    public Message getMessageById(Long id);
    
    public List<Message> getMessageByTitle(String title);
    
    public List<Message> getMessageByCategory(DictCategory category);
    
    public List<Message> getMessageByCategroy(Long categoryId);
    
    public List<Message> getMessageByFuzzy(String fuzzy);
    
    public List<Message> getMessageByAuthUser(AuthUser authUser);
    
    public List<Message> getMessageByAuthUser(Long authUserId);
    
    public void saveOrUpdate(Message message);
    
    public void deleteMessageById(Long id);
    
    public void deleteMessageByCategory(DictCategory category);
    
    public void deleteMessageByCategory(Long categoryId);
    
}
