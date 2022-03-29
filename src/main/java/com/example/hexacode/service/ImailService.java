package com.example.hexacode.service;



import  com.example.hexacode.Entity.Reservation;

public interface ImailService {

	 public void sendSimpleMessage( String to, String subject, String text);
	  public String sendHtmlEmail( Reservation res ,long id);
}
