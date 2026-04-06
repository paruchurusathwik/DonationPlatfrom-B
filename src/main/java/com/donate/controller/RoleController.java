package com.donate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.donate.model.Role;
import com.donate.service.RoleService;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:5173") // React frontend URL
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Get all roles
    @GetMapping
    public List<Role> getRoles() {
        return roleService.getAllRoles();
    }

    // Add role
    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    // Get role by id
    @GetMapping("/{id}")
    public Role getRole(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }

    // Delete role
    @DeleteMapping("/{id}")
    public String deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
        return "Role deleted successfully";
    }
}