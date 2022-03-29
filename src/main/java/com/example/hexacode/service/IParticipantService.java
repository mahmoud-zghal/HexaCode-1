package com.example.hexacode.service;

import java.util.Set;

import  com.example.hexacode.Entity.Event;
import  com.example.hexacode.Entity.Participant;

public interface IParticipantService {
	Participant participate(Long idUser,Long idEvent);
	
	void Unparticipate(Long id);
	
	Participant sendInvitation(Long idUser,Long idEvent);
	
	Participant AcceptInvitation(Long idPart);
	
	void DeclineInvitation(Long id);
	
	void RateEvent(Long idPart,int rate);

	Set<Participant>RecieveInvitation(Long idUser);
}
