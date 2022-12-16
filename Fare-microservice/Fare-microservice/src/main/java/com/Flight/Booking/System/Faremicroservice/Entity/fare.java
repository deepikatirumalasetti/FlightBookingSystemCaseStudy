package com.Flight.Booking.System.Faremicroservice.Entity;
import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

import nonapi.io.github.classgraph.json.Id;



	@Document(collection="payment")
	public class fare{
		@Id
	    private int id;
	    private String flightName;
	    private LocalDate flightDate;
	    private String fare;
	    private String farestatus;
	    
	    
		@Override
		public String toString() {
			return "fares [id=" + id + ", flightName=" + flightName + ", flightDate=" + flightDate + ", fare="
					+ fare + ", farestatus=" + farestatus + "]";
		}


		public fare(int id, String flightName, LocalDate flightDate, String fare, String farestatus) {
			super();
			this.id = id;
			this.flightName = flightName;
			this.flightDate = flightDate;
			this.fare = fare;
			this.farestatus = farestatus;
		}


		public int getid() {
			return id;
		}


		public void setid(int id) {
			this.id = id;
		}


		public String getFlightName() {
			return flightName;
		}


		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}


		public LocalDate getFlightDate() {
			return flightDate;
		}


		public void setFlightDate(LocalDate flightDate) {
			this.flightDate = flightDate;
		}


		public String getFare() {
			return fare;
		}


		public void setFare(String fare) {
			this.fare = fare;
		}


		public String getFarestatus() {
			return farestatus;
		}


		public void setFarestatus(String farestatus) {
			this.farestatus = farestatus;
		}



	
}