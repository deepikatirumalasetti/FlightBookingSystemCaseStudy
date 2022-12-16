 package com.springboot.searchmicroservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.searchmicroservice.entity.search;
import com.springboot.searchmicroservice.repository.SearchRepository;

import io.micrometer.core.instrument.search.Search;



@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	
	private SearchRepository searchRepository;

	public UserController(SearchRepository searchRepository) {
		super();
		this.searchRepository = searchRepository;
	}
	
	@GetMapping("/findAllflights")
	public List<search> getFlights() {
		return searchRepository.findAll();
	}
 

	@GetMapping("/findAllflights/{id}")
	public Optional<search> getFlights(@PathVariable String id) {
		return searchRepository.findById(id);
	}
	
//	@RequestMapping(value= "/getby/{origin}/{destination}", method= RequestMethod.GET)
//	public List<Search> getdeatilsByDestination(@PathVariable("origin") String origin,
//			@PathVariable("destination") String Destination) {
//			return searchRepository.findBySort(origin, Destination);
//}

}