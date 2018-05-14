package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
    @RequestMapping(value = "/interceptor")
    public String dowork(ModelMap modelMap) {
        System.out.println("GET interceptor");
        modelMap.put("message", "pass interceptor");
        return "showMessage";
    }
}
