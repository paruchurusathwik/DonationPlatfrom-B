package com.donate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.donate.model.Donation;
import com.donate.service.DonationService;

@RestController

@RequestMapping("/api/donations")

@CrossOrigin(origins="http://localhost:5173")

public class DonationController {

 @Autowired
 private DonationService service;


 // save donation

 @PostMapping

 public Donation addDonation(

  @RequestBody Donation donation){

  return service.saveDonation(donation);

 }


 // get all donations

 @GetMapping

 public List<Donation> getDonations(){

  return service.getAllDonations();

 }
 
 @PutMapping("/{id}")

 public Donation updateDonation(

  @PathVariable Long id,

  @RequestBody Donation donation){

  return service.updateStatus(

   id,
   donation.getStatus()

  );

 }

}