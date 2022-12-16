package com.flight.booking.system.bookingmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flight.booking.system.bookingmicroservice.config.JwtUtil;
import com.flight.booking.system.bookingmicroservice.entity.AuthenticationRequest;
import com.flight.booking.system.bookingmicroservice.entity.AuthenticationResponse;
import com.flight.booking.system.bookingmicroservice.entity.Booking;
import com.flight.booking.system.bookingmicroservice.entity.User1;
import com.flight.booking.system.bookingmicroservice.repository.UserRepo;
import com.flight.booking.system.bookingmicroservice.service.BookingService;
import com.flight.booking.system.bookingmicroservice.service.MyUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/book")
public class BookingController {
    
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private MyUserDetailsService userDetailsService;
	@Autowired
	private JwtUtil jwtTokenUtil;
	@Autowired
	private UserRepo repo;
	
    @Autowired
    private BookingService bookingService;
   
    @GetMapping("/getallbookings")
    public List<Booking> findAllbooking() {
        return bookingService.findAllBookings();
        }
    
    @GetMapping("/get/{bookingId}")
    public Booking getByBookingId(@PathVariable("id") int bookingid) {
        return bookingService.getByBookingId(bookingid);
     }
    
    @PostMapping("/booking")
    public Booking adding(@RequestBody Booking booking) {
    return bookingService.saveBooking(booking);
    }
    
    @DeleteMapping("/delete/{id}")
    public Booking deleteById(@PathVariable int id) {
    	bookingService.deletebookingById(id);
    	return  bookingService.getByBookingId(id);
    }


    @PutMapping("/update/{bookingid}")  
    public Booking update(@RequestBody  Booking bookingid1,@PathVariable int bookingid)  {  
    return bookingService.updatebooking(bookingid1); 
    }
    

	@PostMapping("/reg")
	private ResponseEntity<?> subscribe(@RequestBody AuthenticationRequest request)
	{
        System.out.println("Deepika");
		String username = request.getUsername();
		String password = request.getPassword();

		User1 model = new User1();
		model.setUsername(username);
		model.setPassword(password);

		try {
			repo.save(model);
		} catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error while subsribing the user with username " + username));
		}
		    return ResponseEntity.ok(new AuthenticationResponse("client subscribed with username " + username));
	}
	@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
		try
		{
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
	}
		catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}


		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}

    
}


