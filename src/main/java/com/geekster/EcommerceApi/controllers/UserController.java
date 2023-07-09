package com.geekster.EcommerceApi.controllers;

import com.geekster.EcommerceApi.models.Order;
import com.geekster.EcommerceApi.models.User;
import com.geekster.EcommerceApi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody User userObj) {
        return userService.createUser(userObj);
    }

    @GetMapping("getUserById/{id}")
    public Optional<User> userList(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}