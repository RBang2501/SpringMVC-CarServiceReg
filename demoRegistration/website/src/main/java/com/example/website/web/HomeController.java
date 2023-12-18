package com.example.website.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;;

@Controller
public class HomeController {
    
    @RequestMapping("/home")
    public String getHomePage(){
        return "home";
    }
}
