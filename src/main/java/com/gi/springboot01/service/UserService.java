package com.gi.springboot01.service;

import com.gi.springboot01.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser() {
        User user = new User("123","1234567890","13605153165");
        return user;
    }
}
