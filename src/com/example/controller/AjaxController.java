package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class AjaxController {
    @ResponseBody
    @RequestMapping(value = "/requestJson", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String work(String name) {
        return String.format("{\"name\": \"%s\",\"age\": 23,\"address\": \"chongqing, 中国\"}", name);
    }
}
