package com.example.hexacode.service;

import java.util.List;


import  com.example.hexacode.Entity.Reservation;

public interface IReservationService {
	List<Reservation> RetrieveAllReservation ();
	Reservation addReservation (Reservation r); 
	Reservation retrieveReservation (Long id );
	Reservation modifyReservation (Reservation r) ;
	 void deleteReservation (Long id) ;

}
