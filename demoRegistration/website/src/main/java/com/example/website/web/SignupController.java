package com.example.website.web;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.website.service.UserSignup;

import jakarta.websocket.server.PathParam;

import com.example.website.domain.User;
import com.example.website.domain.StudentUser;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;



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
    public String registerUser(@ModelAttribute(value = "user") StudentUser studentUser){
        Integer userId = studentSignup.signup(studentUser.getName(), studentUser.getGender());
        if(userId != -1){
            ModelAndView modelAndView = new ModelAndView("redirect:welcome?id=" + String.valueOf(userId));
            return modelAndView.getViewName();
        }
        else return "signup";

        // return "welcome";
        // }
        // else return "signup";

    }

    @RequestMapping("/welcome")
    public String getWelcomePage(@RequestParam("id") String userId, ModelMap map){
        map.addAttribute("userId", userId);
        return "welcome";
    }
    
    @RequestMapping("/instructors")
    public String getInstructorsPage(ModelMap map){
        HashMap<String, Object> instructor1 = new HashMap<String, Object>();
        instructor1.put("name", "Instructor1"); instructor1.put("age", 21); instructor1.put("id", 1);

        HashMap<String, Object> instructor2 = new HashMap<String, Object>();
        instructor2.put("name", "Instructor2"); instructor2.put("age", 21); instructor2.put("id", 2);

        ArrayList<HashMap<String, Object>> listOfInstructors = new ArrayList<>();
        listOfInstructors.add(instructor1);
        listOfInstructors.add(instructor2);

        map.addAttribute("listOfInstructors", listOfInstructors);

        return "instructor";
    }
    
    @RequestMapping("/profile/{profileId}")
    public String getProfilePage(@PathVariable("profileId") String profileId, ModelMap map){
        map.addAttribute("profileId", profileId);
        return "profile";
    }
    
}
