package com.donate.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donate.model.User;

public interface UserRepository
 extends JpaRepository<User,Long>{

 // used in register validation
 Optional<User> findByEmail(String email);


 // used in login
 User findByEmailAndPassword(

  String email,

  String password

 );

}