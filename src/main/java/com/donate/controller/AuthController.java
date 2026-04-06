package com.donate.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.donate.model.User;
import com.donate.service.UserService;

@RestController

@RequestMapping("/api/auth")

@CrossOrigin(origins="http://localhost:5173")

public class AuthController {

 @Autowired
 private UserService service;



 @PostMapping("/login")

 public User login(
  @RequestBody User user
 ){

  User existingUser =
   service.loginUser(

    user.getEmail(),
    user.getPassword()

   );


  if(existingUser==null){

   throw new RuntimeException(
    "Invalid email or password"
   );

  }


  return existingUser;

 }

}