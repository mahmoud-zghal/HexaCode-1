package com.example.hexacode.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import  com.example.hexacode.Entity.Event;

import  com.example.hexacode.service.IEventService;

@RestController
@RequestMapping(value = "Event")
public class EventRestController {
	@Autowired
	private IEventService eventServ;
	

	
	@PostMapping (value ="/add_event")
	public void addEvent(@RequestBody Event e){
		eventServ.addEvent( e);
	}
	
	@PutMapping(value="/update_event")
	public void updateEvent(@RequestBody Event e){
		eventServ.UpdateEvent(e);
	}
	
	@DeleteMapping(value="/delete_event")
	public void deleteEvent(@RequestBody long id){
		eventServ.deleteEvent(id);
	}
	
	@GetMapping("/get_all_events")
    @ResponseBody
    public List<Event> retrieveAllEvents() {
        List<Event> events = eventServ.retrieveAllEvents();
        System.out.println(events);
        return events;
    }
	
	@PutMapping(value="/EventRationg")
	public Event OverralEventRating(Long idEvent){
		
		Event e=eventServ.OverralEventRating(idEvent);
		return e;
		
	}
	

}
