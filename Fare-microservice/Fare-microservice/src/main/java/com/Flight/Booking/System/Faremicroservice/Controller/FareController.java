package com.Flight.Booking.System.Faremicroservice.Controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Flight.Booking.System.Faremicroservice.CustomException.CustomException;
import com.Flight.Booking.System.Faremicroservice.Entity.Booking;
import com.Flight.Booking.System.Faremicroservice.Entity.fare;
import com.Flight.Booking.System.Faremicroservice.Repository.FareRepository;
import com.Flight.Booking.System.Faremicroservice.Service.FareService;

import ch.qos.logback.core.joran.spi.ActionException;


@RestController
@RequestMapping("/payment")
public class FareController{

   @Autowired
   FareService fareservice;

	@PostMapping("/flightFares")
	    public fare adding(@RequestBody fare fares) {
	        return fareservice.saveFares(fares);
	    }   
	   

	   @GetMapping("/{fareid}")
	    public Optional <fare>  findByfareId(@PathVariable int fareid) throws CustomException {
	        return Optional.of(fareservice.findByFareId(fareid)
	        		.orElseThrow(() ->new CustomException()));
	    }

      @DeleteMapping("/delete/{fareid}")
    public void fare(@PathVariable int fareid) {
        fareservice.deletefare(fareid);
    }
//
//   @PutMapping("/update/{id}")
//    public fares fares(@RequestBody fares faresid1,@PathVariable("id") int id) {
//        return this.fareservice.updateFaresId(faresid1);
//    }
   @GetMapping("/getallfares")
   public List<fare> getAllfare(){
       return fareservice.getAllFares();

   }
   
	@GetMapping("/seebookings")
	public List<Booking> getAllbooking() {
		return fareservice.getAllbooking();
	}
   
}
