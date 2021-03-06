package com.FlightReservations.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlightReservations.Model.FlightDetails;
import com.FlightReservations.Model.ReservationDetails;
import com.FlightReservations.Repository.FlightDetailsRepository;
import com.FlightReservations.dto.ReservationRequest;
import com.FlightReservations.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	FlightDetailsRepository flightRepository;
	
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping(value = "/showCompleteReservation" )
	public String showCompleteReservation( Long flightId , ModelMap modelMap) {
		FlightDetails flight = flightRepository.getOne(flightId);
		modelMap.addAttribute("flight" , flight);
		return "completeReservation";
	}
	
	
	@RequestMapping(value = "/completeReservation" , method= RequestMethod.POST)
	public String completeReservation(ReservationRequest request , ModelMap modelMap) {
		
		ReservationDetails  reservation =reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Reservation created successfully and id is " +reservation.getId());
		return "reservationConfirmation";
	}

}
