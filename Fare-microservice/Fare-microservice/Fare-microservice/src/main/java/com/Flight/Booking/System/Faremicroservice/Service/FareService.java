package com.Flight.Booking.System.Faremicroservice.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flight.Booking.System.Faremicroservice.Entity.fares;
import com.Flight.Booking.System.Faremicroservice.Repository.FareRepository;

@Service
public class FareService {
	
@Autowired
    private FareRepository farerepository;

   public fares saveFares(fares fares1) {
        return (fares) farerepository.save(fares1);
   }

     public List<fares> getAllFares() {
         return farerepository.findAll();
     }

	public Optional findByFareId(int fareid) {
		return farerepository.findById(fareid);
	}


	public void deletefare(int fareid) {
		farerepository.deleteById(fareid);
		
	}

	public fares updateFaresId(fares faresid1) {
		return (fares) farerepository.save(faresid1);
	}

	

	

}
