package com.flightbooking.CheckinService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.CheckinService.entity.Checkin;
import com.flightbooking.CheckinService.repository.CheckinRepository;

@Service
public class CheckinService {

	@Autowired
	private CheckinRepository checkinrepository;
	 
	public Optional<Checkin>findByBookingId(int bookingid){
		
	 return checkinrepository.findById(bookingid);
	}
	
	public Checkin updateBookingId(int bookingid) {
		return checkinrepository.save(bookingid);
	}

	public Checkin savecheckin(Checkin checkin) {
		
		return checkinrepository.save(checkin);
	}
}
