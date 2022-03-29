package  com.example.hexacode.service;

import java.util.List;

import  com.example.hexacode.Entity.Collaborator;

public interface ICollaboratorService {
	List< com.example.hexacode.Entity.Collaborator> RetrieveAllCollaborator();
	Collaborator addCollaborator (Collaborator c); 
	Collaborator retrieveCollaborator (Long id );
	Collaborator modifyCollaborator (Collaborator c) ;
	 void deleteCollaborator (Long id) ;


}
