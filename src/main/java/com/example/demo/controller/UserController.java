package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * class for handling queries to user table
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Method for adding a new user
    */
    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return userService.add(user);
    }

    /**
     * Method to get all users
    */
    @GetMapping("/users")
    public Iterable<User> getAll() {
        return userService.getAll();
    }

    /**
     * Get Current User Method
    */
    @GetMapping("/users/me")
    public User getCurrentUser() {
        return userService.getCurrentUser();
    }
}
