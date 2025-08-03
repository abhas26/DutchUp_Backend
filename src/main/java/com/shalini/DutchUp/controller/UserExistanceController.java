package com.shalini.DutchUp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.shalini.DutchUp.Repository.UserRepository;
import com.shalini.DutchUp.model.User;

@RestController
public class UserExistanceController {
    private final UserRepository userRepository;
    public UserExistanceController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // GET all users
    @CrossOrigin(origins = "*")
    @GetMapping("/api/checkUserExistance")
    public boolean getCheckUserExistance(@RequestParam String UID) {
        return userRepository.existsByContactNo(UID) || userRepository.existsByEmailID(UID);
    }
    @GetMapping("/api/getAllUsers")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}