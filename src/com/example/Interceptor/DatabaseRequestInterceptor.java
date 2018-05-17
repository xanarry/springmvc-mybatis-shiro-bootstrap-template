package com.example.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseRequestInterceptor implements HandlerInterceptor {
    /*
    * preHandle方法：进入Handler方法之前执行。可以用于身份认证、身份授权。比如如果认证没有通过表示用户没有登陆，需要此方法拦截不再往下执行（return false），否则就放行（return true）。
    * */
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

    /*
    * postHandle方法：进入Handler方法之后，返回ModelAndView之前执行。可以看到该方法中有个modelAndView的形参。应用场景：从modelAndView出发：将公用的模型数据（比如菜单导航之类的）在这里传到视图，也可以在这里同一指定视图。
    * */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("post specific request interceptor: " + httpServletRequest.getRequestURI());
    }

    /*
    * afterCompletion方法：执行Handler完成之后执行。应用场景：统一异常处理，统一日志处理等。
    * */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("after specific request interceptor: " + httpServletRequest.getRequestURI());

    }
}
