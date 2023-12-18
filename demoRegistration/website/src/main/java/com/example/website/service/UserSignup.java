package com.example.website.service;
import com.example.website.domain.User;

public interface UserSignup {
    public User getUser();
    public boolean signup(String name, String gender);
}
