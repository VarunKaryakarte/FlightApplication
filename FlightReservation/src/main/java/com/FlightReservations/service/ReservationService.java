package com.FlightReservations.service;

import com.FlightReservations.Model.ReservationDetails;
import com.FlightReservations.dto.ReservationRequest;

public interface ReservationService {

	public ReservationDetails bookFlight(ReservationRequest request);
}
