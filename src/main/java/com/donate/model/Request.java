package com.donate.model;

import jakarta.persistence.*;

@Entity
@Table(name="requests")

public class Request {

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;

 private String title;
 private String category;
 private String urgency;
 private String recipientName;
 private String status;
 private String date;

 public Request(){}

 public Long getId(){ return id; }
 public void setId(Long id){ this.id=id; }

 public String getTitle(){ return title; }
 public void setTitle(String title){ this.title=title; }

 public String getCategory(){ return category; }
 public void setCategory(String category){ this.category=category; }

 public String getUrgency(){ return urgency; }
 public void setUrgency(String urgency){ this.urgency=urgency; }

 public String getRecipientName(){ return recipientName; }
 public void setRecipientName(String recipientName){ this.recipientName=recipientName; }

 public String getStatus(){ return status; }
 public void setStatus(String status){ this.status=status; }

 public String getDate(){ return date; }
 public void setDate(String date){ this.date=date; }

}