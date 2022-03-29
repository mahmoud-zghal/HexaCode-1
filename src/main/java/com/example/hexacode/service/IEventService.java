package com.example.hexacode.service;

import java.util.List;

import  com.example.hexacode.Entity.Event;

public interface IEventService {

	void addEvent(Event e);

	void UpdateEvent(Event e);
	
	void deleteEvent(Long id);
	
	List<Event> retrieveAllEvents();
	
	Event OverralEventRating(Long idEvent);

}
