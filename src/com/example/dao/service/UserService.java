package com.example.dao.service;

import com.example.dao.bean.User;
import com.example.dao.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements UserDao{
    private UserDao userDao;

    public UserService() {
    }

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int addUser(User user) {
        userDao.addUser(user);
        return 0;
    }

    @Override
    public List<User> getUserList(Integer start, Integer count) {
        return userDao.getUserList(start, count);
    }

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public void delele(String name) {
        userDao.delele(name);
    }
}
