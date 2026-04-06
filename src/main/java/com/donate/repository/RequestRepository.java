package com.donate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donate.model.Request;

public interface RequestRepository
 extends JpaRepository<Request,Long>{

}