package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping("/users")
    public Iterable<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/users/me")
    public User getCurrentUser() {
        return userService.getCurrentUser();
    }
}
