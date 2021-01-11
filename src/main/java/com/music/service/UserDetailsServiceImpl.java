package com.music.service;

import com.music.model.User;
import com.music.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        UserDetailsImpl userDetails = null;
        if(user != null){
            userDetails = new UserDetailsImpl();
            userDetails.setUser(user);
        }else{
            throw new UsernameNotFoundException("User does not exist with name "+username);
        }
        return userDetails;
    }
    
}
