package com.example.prod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prod.model.User;
import com.example.prod.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService UserService;
    
    @GetMapping("/")
    public User getUser() {
        return UserService.get(1);
    }

    @GetMapping("/post")
    public User postUser(@RequestBody User user) {
        return UserService.post(user);
    }
}
