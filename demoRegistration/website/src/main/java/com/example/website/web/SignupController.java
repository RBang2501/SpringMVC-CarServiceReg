package com.example.website.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.website.service.UserSignup;
import com.example.website.domain.User;
import com.example.website.domain.UserStudent;

import org.springframework.ui.Model;



@Controller
public class SignupController {
    
    @Autowired
    UserSignup studentSignup;

    @RequestMapping("/signup")
    public String getSignupPage(Model uiModel){
        User user = studentSignup.getUser();
        uiModel.addAttribute("user", user);
        return "signup";
    }    

    @RequestMapping("/registerUser")
    public String registerUser(@ModelAttribute(value = "user") UserStudent studentUser){
        if(studentSignup.signup(studentUser.getName(), studentUser.getGender())){
            return "welcome";
        }
        else return "signup";

    }
    
    
}
