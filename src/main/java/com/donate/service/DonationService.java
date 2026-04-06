package com.donate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donate.model.Donation;
import com.donate.repository.DonationRepository;

@Service

public class DonationService {

 @Autowired
 private DonationRepository repo;


 public Donation saveDonation(
  Donation donation){

  donation.setStatus("Pending");

  return repo.save(donation);

 }
 public Donation updateStatus(Long id,String status){

	 Donation d =
	  repo.findById(id).orElse(null);

	 if(d!=null){

	  d.setStatus(status);

	  return repo.save(d);

	 }

	 return null;

	}


 public List<Donation> getAllDonations(){

  return repo.findAll();

 }

}