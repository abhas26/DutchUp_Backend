package com.shalini.DutchUp.controller;

import org.springframework.web.bind.annotation.*;

import com.shalini.DutchUp.Repository.UserRepository;
import com.shalini.DutchUp.model.User;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // GET all users
    @RequestMapping("/users")
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}