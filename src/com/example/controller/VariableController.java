package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VariableController {
    @RequestMapping(value = "/getparam")
    public String getparam(@RequestParam(name = "name", required = false) String name,
                           @RequestParam(name = "age", required = false) int age,
                           @RequestParam(name = "address", required = false) String address,
                           ModelMap modelMap) {
        modelMap.put("message", name + " " + age + " " + address);
        return "showMessage";
    }

    @RequestMapping(value = "/pathvariable/user/{name}/{age}/{address}", method = RequestMethod.GET)
    public String pathvariable(@PathVariable String name, @PathVariable int age, @PathVariable String address, ModelMap modelMap) {
        modelMap.addAttribute("message", name + " " + age + " " + address);
        return "showMessage";
    }
}
