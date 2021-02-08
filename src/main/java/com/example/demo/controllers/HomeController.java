package com.example.demo.controllers;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value= "/login")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login1.html");
        modelAndView.addObject("message", "POSHOL UO");
        return modelAndView;
    }
}
