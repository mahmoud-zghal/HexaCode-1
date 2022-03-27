package tn.esprit.HexaCodeProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import tn.esprit.HexaCodeProject.Entity.Interest;
import tn.esprit.HexaCodeProject.Service.IInterestService;

@RestController
@RequestMapping(value = "Intrest")
public class IntrestRestController {
	@Autowired
	IInterestService intrestservice;
	
	@PostMapping (value ="/add_intrest")
	public void addIntrest(@RequestBody Interest in)
	{
		intrestservice.addIntrest(in);
	}
	
	@PutMapping(value="/update_intrest")
	public void updateIntrest(@RequestBody Interest in)
	{
		intrestservice.updateIntrest(in);
	}
	
	
	@RequestMapping(value = "/delete_intrest/{id}", method = RequestMethod.DELETE)
	public void deleteIntrest(@PathVariable long id)
	{
		intrestservice.deleteIntrest(id);
	}
	

}
