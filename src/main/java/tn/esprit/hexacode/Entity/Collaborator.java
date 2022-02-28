package tn.esprit.hexacode.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Collaborator implements Serializable {
private static final long serialVersionUID = 1L;
    
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String offre;
    private Long rating;

    @ManyToOne
	private Department department1 ; 
	
	
@OneToMany(mappedBy="collaborator")
private Set<Event> event ;
}
