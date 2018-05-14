package com.example.controller;

import com.example.dao.bean.User;
import com.example.dao.mapper.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/database")
public class DatabaseAccessController implements ApplicationListener<ApplicationEvent> {

    private ApplicationContext applicationContext = null;
    private UserDao userDao = null;

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationContext == null || userDao == null) {
            applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");//得到spring容器
            userDao = (UserDao) applicationContext.getBean("userDao");//获取这个bean
        }
    }


    @RequestMapping(value = "/display")
    public ModelAndView showList() {
        List<User> userList = userDao.getUserList(0,100);
        ModelAndView modelAndView = new ModelAndView("database");
        modelAndView.addObject(userList);
        return modelAndView;
    }


    @RequestMapping(value = "/add")
    public String addUser(User user) {
        userDao.addUser(user);
        System.out.println(user);
        return "redirect:/database/display";
    }


    @RequestMapping(value = "/delete")
    public String deleteUser(String name) {
        userDao.delele(name);
        return "redirect:/database/display";
    }

}
