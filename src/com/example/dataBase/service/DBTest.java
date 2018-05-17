package com.example.dataBase.service;


import com.example.dataBase.dao.UserDao;
import com.example.dataBase.domain.User;
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
    @Autowired
    private UserService userService;

    @Test
    public void test() {
        System.out.println(userDao.getUserList(0, 100));

        User u = new User();
        u.setName("tess");
        u.setAge(37);
        u.setEmail("hahah@ha.com");
        u.setAddress("asdfasdfasdfasdf");
        u.setHobby("play");
        u.setPassword("12345");
        userService.testTransaction(u, "test");

        System.out.println(userDao.getUserList(0, 100));
    }
}
