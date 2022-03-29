package com.example.hexacode.service;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bytebuddy.utility.RandomString;
import  com.example.hexacode.Entity.Event;
import  com.example.hexacode.Entity.InvitationStatus;
import  com.example.hexacode.Entity.Participant;
import  com.example.hexacode.Entity.Status;
import  com.example.hexacode.Entity.User;
import  com.example.hexacode.repository.IEventRepository;
import  com.example.hexacode.repository.IParticipantRepository;
import  com.example.hexacode.repository.IUserRepository;

@Service
public class ParticipantService implements IParticipantService {
	
	@Autowired
	IParticipantRepository particpantRepo;
	
	@Autowired
	IEventRepository EventRepo ;
	
	@Autowired
	IUserRepository userRepo;
	
	public Participant participate(Long idUser,Long idEvent){
    	
    	Event event=EventRepo.findById(idEvent).orElse(null);
    	Participant p= new Participant();
    	if(event.getStatus()==Status.PUBLIC){
    		User user=userRepo.findById(idUser).orElse(null);
        	
        	p.setInvitationStatus(InvitationStatus.PARTICPATING);
        	p.setEvents(event);
        	p.setUsers(user);
        	
        	particpantRepo.save(p);
        	
    	}
    	return p;
    	
    }
	
	public void Unparticipate(Long id){
		Participant p= particpantRepo.findById(id).orElse(null);
		if (p.getInvitationStatus()==InvitationStatus.PARTICPATING){
			particpantRepo.deleteById(id);
		}
    	
    	
    }
	
		public Participant sendInvitation(Long idUser,Long idEvent){
		Event event=EventRepo.findById(idEvent).orElse(null);
		User user=userRepo.findById(idUser).orElse(null);
		Participant p= new Participant();
    	p.setInvitationStatus(InvitationStatus.PENDING);
    	p.setEvents(event);
    	p.setUsers(user);
    	particpantRepo.save(p);
    	return p;
		
	}
		
		public Set<Participant>RecieveInvitation(Long idUser){
			
			User user=userRepo.findById(idUser).orElse(null);
			
			
			Set<Participant> x = user.getParticipants();
			
			return x;
			
			
			
			
			
			
			
			
			
			
		}
		
		
	
	
	
	public Participant AcceptInvitation(Long idPart){
		Participant p= particpantRepo.findById(idPart).orElse(null);
		
		if (p.getInvitationStatus()==InvitationStatus.PENDING){
		p.setInvitationStatus(InvitationStatus.ACCEPTED);
		particpantRepo.save(p);
		}
		return p;
	}
	
	
	public void DeclineInvitation(Long id){
		
		Participant p= particpantRepo.findById(id).orElse(null);
		if (p.getInvitationStatus()==InvitationStatus.PENDING){
			particpantRepo.deleteById(id);
		}
		
		
		
	}
	
	
	
	public void RateEvent(Long idPart,int rate){
    	Participant p=particpantRepo.findById(idPart).orElse(null);
    	Event e=p.getEvents();
    	
    	Date todayDate = new Date();
    	if(p.getInvitationStatus()==InvitationStatus.PARTICPATING || p.getInvitationStatus()==InvitationStatus.ACCEPTED){
    		if(e.getEnd_date().compareTo(todayDate)==-1){
    			p.setRating(rate);
    			particpantRepo.save(p);
    			
    		}
    	}}

	
	
	
	
	
	
	

}
