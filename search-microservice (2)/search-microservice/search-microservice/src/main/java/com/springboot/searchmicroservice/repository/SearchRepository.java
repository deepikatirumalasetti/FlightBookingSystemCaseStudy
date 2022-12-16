 package com.springboot.searchmicroservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.searchmicroservice.entity.search;

import io.micrometer.core.instrument.search.Search;

@Repository
public interface SearchRepository extends MongoRepository <search, String> {

	Object save(Search search);

 
	
	}

	



