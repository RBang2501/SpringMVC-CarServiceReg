package com.example.website.service;
import com.example.website.domain.User;

public interface UserSignup {
    public User getUser();
    public Integer signup(String name, String gender);
}
