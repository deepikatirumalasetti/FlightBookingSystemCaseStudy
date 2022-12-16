package com.Flight.Booking.System.Faremicroservice.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Flight.Booking.System.Faremicroservice.Entity.fare;

@Repository
public interface FareRepository extends MongoRepository<fare,String> {

	void deleteById(int fareid);

	Optional<fare> findById(int fareid);



	

		
	
	
}