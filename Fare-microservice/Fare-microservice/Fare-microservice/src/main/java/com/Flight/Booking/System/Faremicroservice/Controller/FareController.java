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

import com.Flight.Booking.System.Faremicroservice.Entity.fares;
import com.Flight.Booking.System.Faremicroservice.Repository.FareRepository;
import com.Flight.Booking.System.Faremicroservice.Service.FareService;


@RestController
@RequestMapping("/details")
public class FareController{

   @Autowired
   FareService fareservice;
  
   public FareController(FareService fareservice) {    
	   super();
		this.fareservice = fareservice;
	}

@PostMapping("/flightFares")
    public fares adding(@RequestBody fares fares) {
        return fareservice.saveFares(fares);
    }   
   

   @GetMapping("/{fareid}")
    public Optional  findByfareId(@PathVariable int fareid){
        return fareservice.findByFareId(fareid);
    }

   @DeleteMapping("/delete/{fareid}")
    public void fare(@PathVariable int fareid) {
        fareservice.deletefare(fareid);
    }

   @PutMapping("/update/{id}")
    public fares fares(@RequestBody fares faresid1,@PathVariable("id") int id) {
        return this.fareservice.updateFaresId(faresid1);
    }
    @GetMapping("getallFares")
    public List<fares> getAllfares(){
        return fareservice.getAllFares();

    }
}
