package com.springboot.searchmicroservice.entity;

import java.util.List;
import java.util.stream.Collector;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="flight")
public class search { 
	private String id;
	private String flightName;
	private String flightDate;
	private String destination; 
	private String origin;
	private String fare;
	@Override
	public String toString() {
		return "search [flightName=" + flightName + ", flightDate=" + flightDate + ", destination=" + destination
				+ ", origin=" + origin + ", id=" + id + ", fare=" + fare + "]";
	}
	public search(String flightName, String flightDate, String destination, String origin, String id, String fare) {
		super();
		this.flightName = flightName;
		this.flightDate = flightDate;
		this.destination = destination;
		this.origin = origin;
		this.id = id;
		this.fare = fare;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}

	
}
