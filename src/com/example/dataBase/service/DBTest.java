package com.example.dataBase.service;


import com.example.dataBase.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class DBTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        System.out.println(userDao.getUserList(0, 100));
    }
}
