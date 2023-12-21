package com.example.website.domain;

import org.springframework.stereotype.Component;

@Component
public class StudentMessage implements Message{
    
    private String message;

    @Override
    public void setUserId(int id) {
        this.message = "Hi Welcome the Supoort Page ! " + String.valueOf(id);
    }

    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    
}
