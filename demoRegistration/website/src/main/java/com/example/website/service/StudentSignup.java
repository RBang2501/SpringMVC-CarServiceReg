package com.example.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.website.domain.User;

@Service
public class StudentSignup implements UserSignup {

    @Autowired
    User studentUser;
    
    @Override
    public boolean signup(String name, String gender){
        if(studentUser.createUser(name, gender)){
            studentUser.saveUser();
            return true;
        }
        else return false;
        
    }

    @Override
    public User getUser(){
        return studentUser;
    }
    
}
