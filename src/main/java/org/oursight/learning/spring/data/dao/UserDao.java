package org.oursight.learning.spring.data.dao;

import org.oursight.learning.spring.data.entity.User;

import java.util.List;

/**
 * Created by neyao@github.com on 2016/3/11.
 */
public interface UserDao {
    public List<User> list();

    public User get(int id);

    public void saveOrUpdate(User user);

    public void delete(int id);
}
