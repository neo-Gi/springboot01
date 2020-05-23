package com.gi.springboot01.controller;


import com.gi.springboot01.domain.User;
import com.gi.springboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(){
        User user = userService.getUser();
        return  user;
    }
}
