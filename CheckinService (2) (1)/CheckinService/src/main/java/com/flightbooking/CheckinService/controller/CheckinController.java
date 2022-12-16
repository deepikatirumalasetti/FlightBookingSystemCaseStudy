package com.flightbooking.CheckinService.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.CheckinService.entity.Checkin;
import com.flightbooking.CheckinService.exception.CustomException;
import com.flightbooking.CheckinService.service.CheckinService;

@RestController
@RequestMapping("/checkin")
public class CheckinController {
	
@Autowired
   CheckinService checkinservice;

@PostMapping("/flightcheckin")
  public Checkin adding(@RequestBody Checkin checkin) {
	return checkinservice.savecheckin(checkin); 
 }
 
 @GetMapping("/{bookingid}")
 public Optional <Checkin> findBybookingid(@PathVariable int bookingid)throws CustomException{
	 return Optional.of(checkinservice.findByBookingId(bookingid))
	  .orElseThrow(()->new CustomException()); 
 }
 
 @PutMapping("/update/{bookingid}")
 public Checkin checkin(@RequestBody Checkin bookingid,@PathVariable("bookingid") int bookingid1) 
 {
	  return checkinservice.updateBookingId(bookingid1);
 }
}
