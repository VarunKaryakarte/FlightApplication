package com.FlightReservations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightReservations.Model.ReservationDetails;

public interface ReservationDetailsRepository extends JpaRepository<ReservationDetails,Long> {

}
