package cn.smbms.dao;

import cn.smbms.beans.User;

import java.util.List;

public interface UserDao {

    public List<User> getUserList( User user ) ;


   public void addUser(User user);

   public void deleteUserByCondition(User user);

   public void updateUser(User user);
}
