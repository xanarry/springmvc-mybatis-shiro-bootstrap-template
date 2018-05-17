package com.example.controller;

import com.example.dataBase.domain.User;
import com.example.dataBase.dao.UserDao;
import com.example.dataBase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DatabaseAccessController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/display")
    public ModelAndView showList() {
        List<User> userList = userService.getUserList(0,100);
        ModelAndView modelAndView = new ModelAndView("database");
        modelAndView.addObject(userList);
        return modelAndView;
    }


    @RequestMapping(value = "/add")
    public String addUser(User user) {
        userService.addUser(user);
        System.out.println(user);
        return "redirect:/database/display";
    }


    @RequestMapping(value = "/delete")
    public String deleteUser(String name) {
        userService.delele(name);
        return "redirect:/database/display";
    }

}
