package com.music.controller;

import com.music.model.Role;
import com.music.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    
    @Autowired
    private RoleService roleService;

    @PostMapping("/admin/role/add")
    public String addRole(Role role){
        return roleService.addRole(role);
    }
}
