package com.example.springwebsocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
    @RequestMapping("/test12")
    public String test(){
        return "/test12";
    }
}
