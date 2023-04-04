package com.driver.repository;

import com.driver.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
   // Integer addPassenger(Passenger passenger);

    // Integer addPassenger(Passenger passenger);
}
