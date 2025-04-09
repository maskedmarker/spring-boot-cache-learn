package org.example.learn.spring.boot.cache.hello.controller;

import org.example.learn.spring.boot.cache.hello.model.User;
import org.example.learn.spring.boot.cache.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/findAllUsers")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }
}
