package com.Flight.Booking.System.Faremicroservice.Entity;


import java.sql.Date;
import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;



	@Document(collection="payment")
	public class fares{
	    private int fareId;
	    private String FlightName;
	    private LocalDate FlightDate;
	    
	    private String Fare;



	   @Override
	    public String toString() {
	        return "fares [fareId=" + fareId + ", FlightName=" + FlightName+ ", FlightDate=" + FlightDate + ", Fare=" + Fare
	                + "]";
	    }
	    public fares(int fareid, String flightName, String flightDate, String fare) {
	        super();
	        fareId = fareId;
	        FlightName = flightName;
	        FlightDate = LocalDate.parse(flightDate);
	        Fare = fare;
	    }

	   public int getfareId() {
	        return fareId;
	    }
	    public void setId(int fareid) {
	        fareId = fareid;
	    }
	    public String getFlightName() {
	        return FlightName;
	    }
	    public void setFlightName(String flightName) {
	        FlightName = flightName;
	    }
	    public LocalDate getFlightDate() {
	        return FlightDate;
	    }
	    public void setFlightDate(String flightDate) {
	        FlightDate =LocalDate.parse(flightDate);
	    }
	    public String getFare() {
	        return Fare;
	    }
	    public void setFare(String fare) {
	        Fare = fare;
    }
}