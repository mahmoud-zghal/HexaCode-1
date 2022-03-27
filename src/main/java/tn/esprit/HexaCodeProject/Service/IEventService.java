package tn.esprit.HexaCodeProject.Service;

import java.util.List;

import tn.esprit.HexaCodeProject.Entity.Event;

public interface IEventService {

	void addEvent(Event e);

	void UpdateEvent(Event e);
	
	void deleteEvent(Long id);
	
	List<Event> retrieveAllEvents();

}
