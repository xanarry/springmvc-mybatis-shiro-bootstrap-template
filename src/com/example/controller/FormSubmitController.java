package com.example.controller;

import com.example.dao.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormSubmitController {
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String getForm() {
        return "form";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public String getSubmit(@RequestParam("name") String name,
                            @RequestParam("age") int age,
                            @RequestParam("email") String email,
                            @RequestParam("password") String password,
                            @RequestParam("hobby") String hobby,
                            @RequestParam("sex") String sex,
                            @RequestParam("address") String address,
                            ModelMap model
    ) {
        User p = new User();
        p.setName(name);
        p.setAge(age);
        p.setEmail(email);
        p.setSex(sex);
        p.setPassword(password);
        p.setAddress(address);
        p.setHobby(hobby);
        System.out.println(p);

        model.addAttribute("message", p.toString());
        //return "showMessage";
        return "use full param: " + p.toString();
    }


    @RequestMapping(value = "/submit2", method = RequestMethod.POST)
    @ResponseBody
    public String getSubmitBySimpleParam(String name, int age, String email, String password, String hobby, String sex, String address) {
        User p = new User();
        p.setName(name);
        p.setAge(age);
        p.setEmail(email);
        p.setSex(sex);
        p.setPassword(password);
        p.setAddress(address);
        p.setHobby(hobby);
        System.out.println(p);
        return "use simple param: " + p.toString();
    }


    @RequestMapping(value = "/submit3", method = RequestMethod.POST)
    @ResponseBody
    public String getSubmitByParamBean(User person) {
        System.out.println(person);
        return "use PersonBean: " + person.toString();
    }
}