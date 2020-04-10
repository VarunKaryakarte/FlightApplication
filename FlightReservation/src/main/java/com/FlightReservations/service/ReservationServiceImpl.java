package com.FlightReservations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.FlightReservations.Model.FlightDetails;
import com.FlightReservations.Model.PassengerDetails;
import com.FlightReservations.Model.ReservationDetails;
import com.FlightReservations.Repository.FlightDetailsRepository;
import com.FlightReservations.Repository.PassengerDetailsRepository;
import com.FlightReservations.Repository.ReservationDetailsRepository;
import com.FlightReservations.dto.ReservationRequest;
@ComponentScan


@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightDetailsRepository flightRepository;

	@Autowired
	PassengerDetailsRepository passengerRepository;
	
	@Autowired
	ReservationDetailsRepository reservationRepository;
	
	@Override
	public ReservationDetails bookFlight(ReservationRequest request) {
		
		Long flightId = request.getFlightId();
		FlightDetails flight =	flightRepository.getOne(flightId);
		
		PassengerDetails passenger = new PassengerDetails();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassesngerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhoneNumber(request.getPassengerPhone());
		PassengerDetails savedPassenger = passengerRepository.save(passenger);
		
		ReservationDetails reservation = new ReservationDetails();
		reservation.setFlightId(flight);
		reservation.setPassengerId(savedPassenger);
		reservation.setCheckedIn(false);
		
		ReservationDetails savedReservation =reservationRepository.save(reservation);
		return savedReservation;
	}

}
