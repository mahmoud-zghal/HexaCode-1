package com.example.hexacode.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  com.example.hexacode.Entity.Event;
import  com.example.hexacode.Entity.InvitationStatus;
import  com.example.hexacode.Entity.Participant;
import  com.example.hexacode.repository.IEventRepository;
import  com.example.hexacode.repository.IParticipantRepository;

@Service
public class EventService implements IEventService {
	
	@Autowired
	IEventRepository EventRepo ;
	
	@Autowired
	IParticipantRepository particpantRepo;
	
	
	public void addEvent(Event e){
		EventRepo.save(e);
	}
	
	public void UpdateEvent(Event e){
		EventRepo.save(e);
	}
	
	public void deleteEvent(Long id){
		EventRepo.deleteById(id);
	}
	
    public List<Event> retrieveAllEvents() {
		
		List<Event> events =  EventRepo.findAll();
		return events;
	}
    
    
    public Event OverralEventRating(Long idEvent){
    	Event event=EventRepo.findById(idEvent).orElse(null);
    	Set<Participant> x = event.getParticipants();
    	
    	double moy=0;
    	double total=0;
    	for (Participant i : x){
    		int r = i.getRating();
    		total=total+r;
    		moy=total/x.size();
    		 
    	}
    	event.setNote(moy);
    	EventRepo.save(event);
    	return event;
    	
    }
    
    
    
    
    
    
    




	
	
	
	
	

}
