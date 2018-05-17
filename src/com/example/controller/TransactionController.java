package com.example.controller;

import com.example.dataBase.domain.User;
import com.example.dataBase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransactionController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/transaction", method = RequestMethod.GET)
    public String perform(ModelMap modelMap) {
        User u = new User();
        u.setName("tess");
        u.setAge(37);
        u.setEmail("hahah@ha.com");
        u.setAddress("asdfasdfasdfasdf");
        u.setHobby("play");
        u.setPassword("12345");
        userService.testTransaction(u, "test");
        modelMap.put("message", "执行完成");
        return "showMessage";
    }
}
