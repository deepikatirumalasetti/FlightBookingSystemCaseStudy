package com.flightbooking.CheckinService.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flightbooking.CheckinService.entity.Checkin;
@Repository
public interface CheckinRepository extends MongoRepository<Checkin,Integer> {

	Optional<Checkin> findById(int bookingid);

	Checkin save(int bookingid);

	

}
