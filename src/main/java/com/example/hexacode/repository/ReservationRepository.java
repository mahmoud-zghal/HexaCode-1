package com.example.hexacode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.example.hexacode.Entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation , Long>{
}
