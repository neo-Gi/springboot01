package com.gi.springboot01.controller;


import com.gi.springboot01.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserController")
public class UserController {
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User("123","1234567890","13605153165");
        return  user;
    }
}
