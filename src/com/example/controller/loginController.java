package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class loginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletResponse response, String name, String password) {
        if (name.equals("abc") && password.equals("123")) {
            Cookie cookie = new Cookie("name", name);
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);
            return "redirect:/index";
        } else {
            return "redirect:/redirect";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("request: /logout");
        for (Cookie c : request.getCookies()) {
            c.setMaxAge(0);
            c.setValue("");
            response.addCookie(c);
        }
        return "redirect:/";
    }
}
