package com.donate.model;

import jakarta.persistence.*;

@Entity
@Table(name="donations")

public class Donation {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String title;

 private String category;

 private int quantity;

 private String donorName;

 private String date;

 private String status;


 public Donation(){}


 public Long getId(){
  return id;
 }


 public void setId(Long id){
  this.id=id;
 }


 public String getTitle(){
  return title;
 }


 public void setTitle(String title){
  this.title=title;
 }


 public String getCategory(){
  return category;
 }


 public void setCategory(String category){
  this.category=category;
 }


 public int getQuantity(){
  return quantity;
 }


 public void setQuantity(int quantity){
  this.quantity=quantity;
 }


 public String getDonorName(){
  return donorName;
 }


 public void setDonorName(String donorName){
  this.donorName=donorName;
 }


 public String getDate(){
  return date;
 }


 public void setDate(String date){
  this.date=date;
 }


 public String getStatus(){
  return status;
 }


 public void setStatus(String status){
  this.status=status;
 }

}