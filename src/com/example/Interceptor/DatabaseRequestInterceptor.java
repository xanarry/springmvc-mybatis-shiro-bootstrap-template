package com.example.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseRequestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("pre specific request interceptor: " + httpServletRequest.getRequestURI());
        Cookie[] cookies = httpServletRequest.getCookies();
        for (Cookie c : cookies) {
            System.out.println(c.getName() + " " + c.getValue());
            if (c.getValue().equals("abc")) {
                return true;
            }
        }
        httpServletResponse.sendRedirect("/redirect");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("post specific request interceptor: " + httpServletRequest.getRequestURI());
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("after specific request interceptor: " + httpServletRequest.getRequestURI());

    }
}
