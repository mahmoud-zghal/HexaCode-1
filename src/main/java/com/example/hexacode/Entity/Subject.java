package tn.esprit.hexacode.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject implements Serializable{
	
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String title;
private String subtitle;
private LocalDateTime date;
private boolean status;

@ManyToOne
private User user;

@OneToMany(mappedBy = "subject")
private Set<Response> response;

}
