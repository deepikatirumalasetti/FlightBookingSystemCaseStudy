package com.flight.booking.system.bookingmicroservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flight.booking.system.bookingmicroservice.entity.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking,Integer> {

	


	
}
