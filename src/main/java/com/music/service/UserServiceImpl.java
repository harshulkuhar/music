package com.music.service;

import com.music.model.User;
import com.music.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public String addUserByAdmin(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword())); 
        userRepository.save(user);
        return "<h1>User added successfully</h1>";
    }
}
