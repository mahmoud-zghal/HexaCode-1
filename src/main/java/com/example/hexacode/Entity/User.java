package com.example.hexacode.Entity;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static javax.persistence.FetchType.EAGER;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User  implements Serializable{
	
	private static final long serialVersionUID = 1L;
    
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String lastname;
	private String username ;
	private String password ;
	private String email ;

	@Temporal(TemporalType.DATE)
	private Date Dob;
	private String PhotoProfile;
	private String Headline;
	private String current_position;
	private String education;
	private String location;
	private String contact_info;
	private String experience;
	private int points=0 ;
	private int cultural_points=0 ;
	private int sport_points=0 ;
	private int art_points=0 ;
	private int professionel_points=0 ;


	private String resetPasswordToken;


	@ManyToMany(fetch = EAGER)
	private Collection<Role> roles = new ArrayList<>();
	@ManyToOne
	private Badge badge ; 
	@ManyToOne
	private Department department ; 
	
	@ManyToMany
	private Set<Interest> activity ;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Event> events ; 

	@OneToMany
	private Set<Subject> subject;



	@OneToMany
	private Set<Quizz> quizzes;

	@OneToMany
	private Set<Trophy> trophies;


	@OneToMany(mappedBy = "sender")
	private Set<Messages> messages1;

	@OneToMany(mappedBy = "receiver")
	private Set<Messages> messages2;

	@OneToMany
	private Set<Article> articles;

	@OneToMany
	private Set<CommentsLikes> commentslikes ;


	@OneToMany(mappedBy = "user")
	private Set<Article_Comment> article_commentSet;

       @OneToMany(mappedBy = "user2")
	private Set<Reservation> reservation ;
	
	@OneToMany(mappedBy = "user")
	private Set<Rating> rating;

	@JsonIgnore
	@OneToMany
	private Set<Bookmarks>bookmarks;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="users")
	private Set<Participant>Participants;
	
	@JsonIgnore
	@OneToMany
	private Set<Follows>Follows;
	
}
