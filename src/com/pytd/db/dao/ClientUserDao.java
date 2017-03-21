package com.pytd.db.dao;

import java.util.List;

import com.pytd.db.entity.ClientUser;

/**
 * 用户表处理接口
 * 
 * @author zhang
 *
 */
public interface ClientUserDao {

    // 用以登录时检查数据库中是否存在该用户
    public boolean checkUser(ClientUser user);

    // 添加用户
    public boolean addUser(ClientUser user);

    // 删除用户
    public boolean deleteUser(int id);

    // 修改用户信息
    public boolean updateUser(ClientUser user);

    // 查询用户
    public List<ClientUser> queryUser(ClientUser user);
    public ClientUser queryById(int id);

    // 查询所有用户
    public List<ClientUser> queryAll();
}
