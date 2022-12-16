package com.Flight.Booking.System.Faremicroservice.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Flight.Booking.System.Faremicroservice.Entity.Booking;
import com.Flight.Booking.System.Faremicroservice.Entity.fare;
import com.Flight.Booking.System.Faremicroservice.Repository.FareRepository;

@Service
public class FareService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	String url1="http://bookingmicroservices/book/";
	
@Autowired
    private FareRepository farerepository;

   public fare saveFares(fare fares1) {
       return farerepository.save(fares1);
  }

    public List<fare> getAllFares() {
        return farerepository.findAll();
    }

	public Optional<fare> findByFareId(int fareid) {
		return farerepository.findById(fareid);
	}


	public void deletefare(int fareid) {
		farerepository.deleteById(fareid);
		
	}

	public List<Booking> getAllbooking() {
		Booking[] booking=restTemplate.getForObject(url1+"/getallbookings",Booking[].class);
    	return(Arrays.asList(booking));
    }

	

	
//	public fares updateFaresId(fares faresid1) {
//		return (fares) farerepository.save(faresid1);
//	}

	

	

}
