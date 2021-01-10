package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class newController {
    @RequestMapping("/in")
    public String ind(){
        return "/web/html/index.html";
    }
}
