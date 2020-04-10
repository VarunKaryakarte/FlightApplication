package com.FlightReservations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightReservations.Model.PassengerDetails;

public interface PassengerDetailsRepository extends JpaRepository<PassengerDetails, Long>{

}
