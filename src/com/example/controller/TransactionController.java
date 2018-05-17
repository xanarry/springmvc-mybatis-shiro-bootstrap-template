package com.example.controller;

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

        modelMap.put("message", "执行完成");
        return "showMessage";
    }
}
