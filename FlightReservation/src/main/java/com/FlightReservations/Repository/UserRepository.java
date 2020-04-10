package com.FlightReservations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightReservations.Model.User;

public interface UserRepository extends JpaRepository<User , Long>{

	User getByEmail(String email);

}
