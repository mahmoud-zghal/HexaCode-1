package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.example.hexacode.Entity.Offers;
@Repository
public interface OfferRepository extends JpaRepository<Offers , Long>{

}
