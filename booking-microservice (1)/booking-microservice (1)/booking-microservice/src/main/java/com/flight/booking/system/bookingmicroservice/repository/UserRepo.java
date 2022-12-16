package com.flight.booking.system.bookingmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flight.booking.system.bookingmicroservice.entity.User1;



public interface UserRepo extends MongoRepository<User1, String> {

	User1 findByUsername(String username);

}
