package com.FlightReservations.Model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "flight")
public class FlightDetails extends AbstractClass{
	
	@Column(name = "flight_number")
	private String flightNumber;
	
	@Column(name = "operating_airlines")
	private String operatingAirlines;
	
	@Column(name = "arrival_city")
	private String arrivalCity;
	
	@Column(name = "departure_city")
	private String departureCity;
	
	@Column(name = "date_of_departure")
	private Date dateOfDeparture;
	
	@Column(name = "estimated_arrival_time")
	private Timestamp arrivalTime;
		
	
}
