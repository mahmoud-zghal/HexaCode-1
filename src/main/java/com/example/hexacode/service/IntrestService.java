package com.example.hexacode.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  com.example.hexacode.Entity.Event;
import  com.example.hexacode.Entity.Follows;
import  com.example.hexacode.Entity.Interest;
import  com.example.hexacode.Entity.User;
import  com.example.hexacode.repository.IFollowsRepository;
import  com.example.hexacode.repository.IIntrestRepository;
import  com.example.hexacode.repository.IUserRepository;

@Service
public class IntrestService implements IInterestService{
	@Autowired
	IIntrestRepository intrestRepo;
	
	@Autowired
	IUserRepository userRepo;
	
	@Autowired
	IFollowsRepository followRep;
	
	public void addIntrest(Interest in){
		intrestRepo.save(in);
	}
	
	public void updateIntrest(Interest in){
		intrestRepo.save(in);
	}
	
	public void deleteIntrest(Long id){
		intrestRepo.deleteById(id);
	}
	
	
	public List<Interest> retrieveAllIntrests() {
		
		List<Interest> intrests =  intrestRepo.findAll();
		return intrests;
	}
	
	public void Follow(Long idUser ,Long idIntrest){
		Interest i= intrestRepo.findById(idIntrest).orElse(null);
		User user=userRepo.findById(idUser).orElse(null);
		Follows f=new Follows();
		f.setIntrestFollowed(i);
		f.setUserFollowing(user);
		followRep.save(f);
		
	}
	
	public void Unfollow(Long id){
		followRep.deleteById(id);
	}
	
	public List<Interest> GetAllFollows(Long idUser){
		List<Interest> follows=followRep.getIntrestsByUser(idUser);
		return follows;
		
	}
	
	
	
	

}
