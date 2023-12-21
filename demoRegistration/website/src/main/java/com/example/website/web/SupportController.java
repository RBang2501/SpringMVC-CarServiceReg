package com.example.website.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.website.service.SupportMessage;

// import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
public class SupportController {

    @Autowired
    SupportMessage supportMessage;
    
    // @RequestMapping("/support")
    // public String getSupportPage(@RequestParam("id") String id, Model uiModel){
    //     String finalMessage = this.supportMessage.createMessage(Integer.parseInt(id));
    //     uiModel.addAttribute("message", finalMessage);
    //     uiModel.addAttribute("message", "This is final message" + id);
    //     return "support";
    // }

    @RequestMapping("/support")
    public String getSupportPage(@RequestParam("id") String id, ModelMap map){
        // String finalMessage = this.supportMessage.createMessage(Integer.parseInt(id));
        map.addAttribute("message", "Hello Welcome to the Support Page" + id);
        return "support";
    }



}
