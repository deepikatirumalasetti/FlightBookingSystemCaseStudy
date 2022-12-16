package com.springboot.searchmicroservice.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.searchmicroservice.entity.Booking;
import com.springboot.searchmicroservice.entity.search;
import com.springboot.searchmicroservice.repository.SearchRepository;
import com.springboot.searchmicroservice.service.SearchService;

import io.micrometer.core.instrument.search.Search;

@RestController
@RequestMapping("/see")
public class SearchController {
 
	@Autowired
	private SearchService service;

	Logger log = LoggerFactory.getLogger(SearchController.class);
	
	@PostMapping("/flightSearch")
	public search adding(@RequestBody search search) {
		return service.saveSearch(search);
	} 

	
	@GetMapping("/{id}")
	public Optional<search> flightSearch2(@PathVariable String id) {
		return service.findSearchById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
      service.deleteSearchById(id);
	}
	
	@PutMapping("/update/{id}")
	public search update(@RequestBody search search,@PathVariable String id) {
		
		return service.updateSearch(search);
	}
	@GetMapping("getallsearches")
	public List<search> getAllsearch()
	{
		log.info("getting all the messages");
		return service.getAllSearches();
	}
	
	@GetMapping("/seebookings")
	public List<Booking> getAllbooking() {
		log.info("getting all the messages");
		return service.getAllbooking();
	}
	
}

