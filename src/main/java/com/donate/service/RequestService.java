package com.donate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donate.model.Request;
import com.donate.repository.RequestRepository;

@Service

public class RequestService {

 @Autowired
 private RequestRepository repo;


 public Request saveRequest(
  Request request){

  request.setStatus("Pending");

  return repo.save(request);

 }
 
 public Request updateStatus(Long id,String status){

	 Request r =
	  repo.findById(id).orElse(null);

	 if(r!=null){

	  r.setStatus(status);

	  return repo.save(r);

	 }

	 return null;

	}


 public List<Request> getRequests(){

  return repo.findAll();

 }

}