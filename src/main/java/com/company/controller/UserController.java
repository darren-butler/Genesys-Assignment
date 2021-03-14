package com.company.controller;

import com.company.model.User;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/user")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/api/user/{id}")
    public User getUser(@PathVariable("id") String userId) {
        return  userRepository.getUserById(userId);
    }

    @PutMapping("/api/user/{id}")
    public String updateUser(@PathVariable("id") String userId, @RequestBody User user) {
        return userRepository.update(userId, user);
    }

    @DeleteMapping("/api/user/{id}")
    public String deleteUser(@PathVariable("id") String userId) {
        return userRepository.delete(userId);
    }


}
