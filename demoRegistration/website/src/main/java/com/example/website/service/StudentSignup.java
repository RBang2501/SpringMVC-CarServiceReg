package com.example.website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.website.domain.User;

@Service
public class StudentSignup implements UserSignup {

    @Autowired
    User studentUser;
    
    @Override
    public Integer signup(String name, String gender){
        if(studentUser.createUser(name, gender)){
            return studentUser.saveUser();
            // return true;
        }
        // else return false;
        else return -1;
        
    }

    @Override
    public User getUser(){
        return studentUser;
    }
    
}
