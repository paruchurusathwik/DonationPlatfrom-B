package com.donate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.donate.model.User;
import com.donate.service.UserService;

@RestController
@RequestMapping("/api/users")

@CrossOrigin(origins="http://localhost:5173")

public class UserController {

 @Autowired
 private UserService service;


 // REGISTER USER

 @PostMapping
 public User registerUser(

  @RequestBody User user

 ){

  return service.registerUser(user);

 }


 // GET USERS

 @GetMapping
 public List<User> getUsers(){

  return service.getAllUsers();

 }

}