package com.example.hexacode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import  com.example.hexacode.Entity.Collaborator;
import  com.example.hexacode.Entity.Rating;
import  com.example.hexacode.Entity.User;
import  com.example.hexacode.repository.CollaboratorRepository;
import  com.example.hexacode.repository.UserRepository;
import  com.example.hexacode.service.IRatingService;



@RequestMapping("/rating")
@org.springframework.web.bind.annotation.RestController
public class RatingController {
	
	@Autowired
	IRatingService iRatingService ;
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	CollaboratorRepository  collaboratorRepository ;
	
	
	
	@ResponseBody
	@PostMapping(value= "/save-Rating/{userId}/{collabId}")
	public Rating saveRating( @RequestBody Rating rating, @PathVariable("userId") Long userId,@PathVariable("collabId") Long collabId ){
		
		Rating rte = iRatingService.findRatingByUserAndCollaborator(userId, collabId);
		
			if (rte != null){
				
				rte.setStars(rating.getStars());
				
				iRatingService.addRating(rte, userId, collabId);
				
		        return rte ;
				}
		
		else {			
			User u = userRepository.findById(userId).orElse(null);		
			Collaborator c=collaboratorRepository.findById(collabId).orElse(null);
			
			rating.setUser(u);		
			rating.setCollaborator(c);		
			
			iRatingService.addRating(rating, userId, collabId);
			
        	return rating ;
	
		}
		
		
	//	return iRatingService.addRating(rating, userId, collabId);
	
	}
	@ResponseBody
	@PutMapping(value = "/calculMoyRating/{collabId}")
	public int calculMoyRating (@PathVariable("collabId") Long collabId){
		
		Collaborator collaborator = collaboratorRepository.findById(collabId).get() ;
		collaborator.setRate(iRatingService.calculMoyRating(collabId));
		
		
	return iRatingService.calculMoyRating(collabId);
	}
	@ResponseBody
	@GetMapping(value = "/meilleur-Collab")
	public String meilleurCollab(){
	 return	iRatingService.meilleurCollab();
	}

	
}
