package com.example.controller;

import com.example.dataBase.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Controller
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class AutowiredController {
    @Autowired
    UserService userService;

    @Test
    public void test() {
        System.out.println(userService.getUserList(0, 10));
    }
}
