package com.example.hexacode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  com.example.hexacode.Entity.Event;
import  com.example.hexacode.Entity.EventComment;
import  com.example.hexacode.repository.IEventCommentRepository;
import  com.example.hexacode.repository.IEventRepository;

@Service
public class EventCommentService implements IEventComment{
	
	@Autowired
	IEventCommentRepository eventCommRepo;
	@Autowired
	IEventRepository eventrepo;
	
	public void addEventComment(EventComment ec,Long idEvent){
		
		Event ev= eventrepo.findById(idEvent).orElse(null);
		
		ec.setEvent(ev);
		eventCommRepo.save(ec);
		
	}
	
	public void updateEventComment(EventComment ec){
		eventCommRepo.save(ec);
	}
	
	public void deleteEventeComment(long id){
		eventCommRepo.deleteById(id);
	}
	public List<EventComment> retrieveAllEventComments() {
		
		List<EventComment> eventComments =  eventCommRepo.findAll();
		return eventComments;
	}

	

	
	

}
