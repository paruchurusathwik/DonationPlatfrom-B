package com.donate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.donate.model.Request;
import com.donate.service.RequestService;

@RestController

@RequestMapping("/api/requests")

@CrossOrigin(origins="http://localhost:5173")

public class RequestController {

 @Autowired
 private RequestService service;


 @PostMapping
 public Request addRequest(
  @RequestBody Request request){

  return service.saveRequest(request);

 }


 @GetMapping
 public List<Request> getAll(){

  return service.getRequests();

 }
 
 @PutMapping("/{id}")

 public Request updateRequest(

  @PathVariable Long id,

  @RequestBody Request request){

  return service.updateStatus(

   id,
   request.getStatus()

  );

 }

}