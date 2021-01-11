package com.music.service;

import com.music.model.Role;
import com.music.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    
    @Autowired
    private RoleRepository roleRepository;

    public String addRole(Role role){
        roleRepository.save(role);
        return "<h1> Role added successfully </h1>";
    }
}
