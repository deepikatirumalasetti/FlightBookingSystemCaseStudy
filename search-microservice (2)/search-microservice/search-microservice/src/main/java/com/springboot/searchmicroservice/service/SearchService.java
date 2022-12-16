package com.springboot.searchmicroservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.searchmicroservice.entity.Booking;
import com.springboot.searchmicroservice.entity.search;
import com.springboot.searchmicroservice.repository.SearchRepository;

import io.micrometer.core.instrument.search.Search;

@Service
public class SearchService {

 
	@Autowired
	 RestTemplate restTemplate;
	
	String url1="http://bookingmicroservices/book";
	
	@Autowired
	private SearchRepository repository;

	
	public search saveSearch(search search1)
	{
		return repository.save(search1);
	}
	
	public Optional<search>  findSearchById(String id) {
		return repository.findById(id);
	}
	
	
	public search updateSearch(search search1)
	{
		return repository.save(search1);
	}
	
    public List<search> getAllSearches()
     {
	return repository.findAll();
     }

	public Object addsearch(search search) {
		return repository.save(search);
	}	

  

	public List<Booking> getAllbooking() {
		Booking[] booking=restTemplate.getForObject(url1+"/getallbookings",Booking[].class);
    	return(Arrays.asList(booking));
    }


	public void deleteSearchById(String id) {
		repository.deleteById(id);
		
	}

	public Object getsearch(search search) {
		return repository.save(search);
	}

	public Object deletesearch(search search) {
		return repository.save(search);
	}

	 
	
		
	}