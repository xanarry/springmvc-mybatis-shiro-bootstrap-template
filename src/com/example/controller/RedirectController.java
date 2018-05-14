package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RedirectController {
    @RequestMapping("/redirect")
    public ModelAndView redirect(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("redirected");
        System.out.println(request.getHeader("referer"));
        modelAndView.addObject("referer", request.getHeader("referer"));
        return modelAndView;
    }
}
