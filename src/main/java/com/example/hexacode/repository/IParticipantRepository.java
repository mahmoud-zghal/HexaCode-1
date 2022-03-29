package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import  com.example.hexacode.Entity.Participant;
@Repository
public interface IParticipantRepository extends JpaRepository<Participant, Long> {
	
}
