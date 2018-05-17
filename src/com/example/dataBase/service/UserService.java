package com.example.dataBase.service;

import com.example.dataBase.domain.User;
import com.example.dataBase.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserDao userDao;

    public int addUser(User user) {
        userDao.addUser(user);
        return 0;
    }


    public List<User> getUserList(Integer start, Integer count) {
        return userDao.getUserList(start, count);
    }

    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    public void delele(String name) {
        userDao.delele(name);
    }


    @Transactional(propagation = Propagation.REQUIRED)

    /**
     * this method is designed to test transaction in spring mvc
     * @Param user a user object that is decided to add to database
     * @Param delName user decided to delete from database which its name is delName
     * @return return null
     */
    public void testTransaction(User user, String delName) {
        this.addUser(user);
        user.setName(user.getName() + user.getAge());
        this.addUser(user);
        this.delele(delName);
    }
}
