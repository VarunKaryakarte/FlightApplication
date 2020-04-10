package com.FlightReservations.Model;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ReservationDetails extends AbstractClass{

	@Column(name = "checked_in")
	private Boolean checkedIn;
	
	//@Column(name = "flight_id")
	@OneToOne
	private FlightDetails flightId;
	
	//@Column(name = "passenger_id")
	@OneToOne
	private PassengerDetails passengerId;
	
	@Column(name = "number_of_bags")
	private Integer numberOfBags;
	
	@Column(name = "created_time")
	private ZonedDateTime createdTime;
	
}
