package com.donate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donate.model.User;
import com.donate.repository.UserRepository;

@Service

public class UserService {

 @Autowired
 private UserRepository repo;



 /* REGISTER USER */

 public User registerUser(User user){

  return repo.save(user);

 }



 /* GET ALL USERS */

 public List<User> getAllUsers(){

  return repo.findAll();

 }



 /* FIND BY EMAIL */

 public User findByEmail(String email){

  return repo.findByEmail(email)

   .orElse(null);

 }



 /* LOGIN USER */

 public User loginUser(

  String email,

  String password

 ){

  return repo.findByEmailAndPassword(

   email,

   password

  );

 }

}