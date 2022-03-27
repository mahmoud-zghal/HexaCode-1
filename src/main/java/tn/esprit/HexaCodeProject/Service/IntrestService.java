package tn.esprit.HexaCodeProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import tn.esprit.HexaCodeProject.Entity.Interest;
import tn.esprit.HexaCodeProject.Repository.IIntrestRepository;

@Service
public class IntrestService implements IInterestService{
	@Autowired
	IIntrestRepository intrestRepo;
	
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
	
	
	
	

}
