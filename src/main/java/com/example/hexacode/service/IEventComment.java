package  com.example.hexacode.service;

import java.util.List;

import  com.example.hexacode.Entity.Event;
import  com.example.hexacode.Entity.EventComment;

public interface IEventComment  {
	void addEventComment(EventComment ec,Long idEvent);
	
	void updateEventComment(EventComment ec);
	
	void deleteEventeComment(long id);
	
	List<EventComment> retrieveAllEventComments();
	
	
}
