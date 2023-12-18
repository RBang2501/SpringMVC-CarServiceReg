package com.example.website.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.website.repository.DAO;

@Component
public class UserStudent implements User{
    @Autowired
    DAO<UserStudent> studentDAO; 

    private String name;
    private String gender;
    private Integer id;

    public Integer getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    @Override
    public boolean createUser(String name, String gender) {
        this.name = name;
        this.gender = gender;
        return true;
    }

    @Override
    public Integer saveUser() {
        this.id = 0;
        return this.studentDAO.save(this);
    }
    
}
