package com.donate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donate.model.Donation;

public interface DonationRepository extends JpaRepository<Donation,Long>{

}