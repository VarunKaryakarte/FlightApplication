package com.FlightReservations.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReservationRequest {

	private Long flightId;
	
	private String passengerFirstName;
	
	private String passesngerLastName;
	
	private String passengerPhone;
	
	private String passengerEmail;
	
	private String nameOnTheCard;
	
	private String cardNumber;
	
	private String expiryDate;
	
	private String securityCode;
	
	
	
}
