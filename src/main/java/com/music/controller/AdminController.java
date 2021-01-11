package com.music.controller;

import com.music.model.User;
import com.music.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/admin/add")
    public String addUserByAdmin(@RequestBody User user){  
        return userService.addUserByAdmin(user);
    }
}
