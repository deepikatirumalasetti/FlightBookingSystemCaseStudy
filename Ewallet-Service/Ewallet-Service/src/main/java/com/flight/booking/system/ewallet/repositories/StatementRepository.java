package com.flight.booking.system.ewallet.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flight.booking.system.ewallet.models.Statement;

public interface StatementRepository extends MongoRepository<Statement, Integer>{
	
	List<Statement> findByStatementId(int profileId);

}