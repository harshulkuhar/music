package com.music.security;

import com.music.security.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeResource {
    
    @Autowired
    private MyUserDetailsService userDetailsService;

    @GetMapping("/")
    public String home(){
        return ("<h1> Welcome to HOMEEEEEE </h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1> Welcome USERR </h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1> Welcome ADMINNN </h1>");
    }

    @PostMapping("/user")
    public void addUser(User user){
        userDetailsService.addUser(user);
    }

}
