package com.flight.booking.system.ewallet.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flight.booking.system.ewallet.models.Ewallet;


@Repository
public interface EwalletRepository extends MongoRepository<Ewallet, String>{

	public Ewallet findByProfileId(int profileId);
}