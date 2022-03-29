package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.example.hexacode.Entity.Interest;
@Repository
public interface IIntrestRepository extends JpaRepository<Interest, Long>{
	

}
