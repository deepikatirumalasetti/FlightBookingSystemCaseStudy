package com.flight.booking.system.bookingmicroservice.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flight.booking.system.bookingmicroservice.entity.User1;
import com.flight.booking.system.bookingmicroservice.repository.UserRepo;


@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User1 user =repo.findByUsername(username);
		if(user==null)
		{
			return null;
		}
		String name = user.getUsername();
		String pwd = user.getPassword();

		return new User(name, pwd, new ArrayList<>());

	}
}
