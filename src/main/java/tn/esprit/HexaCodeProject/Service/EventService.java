package tn.esprit.HexaCodeProject.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.HexaCodeProject.Entity.Event;
import tn.esprit.HexaCodeProject.Entity.InvitationStatus;
import tn.esprit.HexaCodeProject.Entity.Participant;
import tn.esprit.HexaCodeProject.Repository.IEventRepository;
import tn.esprit.HexaCodeProject.Repository.IParticipantRepository;

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
    
    
    
    
    
    
    




	
	
	
	
	

}
