package com.example.website.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.website.domain.UserStudent;


@Repository
@Scope("singleton")
public class StudentDAO implements DAO<UserStudent> {

    private List<UserStudent> database = new ArrayList<UserStudent>();

    @Override
    public Optional<UserStudent> get(Integer id) {
        if(!database.isEmpty()){
            return Optional.of(database.get(id));
        }
        else return Optional.empty();
    }

    @Override
    public Integer save(UserStudent temp) {
        int userId = database.size();
        temp.setId(userId);
        database.add(temp);
        System.out.println(temp.getName() + " is saved to Database Successfully !") ;
        return userId;
    }
    
}


