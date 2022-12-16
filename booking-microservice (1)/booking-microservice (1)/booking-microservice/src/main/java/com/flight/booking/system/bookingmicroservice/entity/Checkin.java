package com.flight.booking.system.bookingmicroservice.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="status")
public class Checkin {
	
	private String lastname;
	private String firstname;
	private int seatnumber;
	private LocalTime checkintime;
    private int flightnumber;
    private LocalDate flightdate;
	private int Bookingid;
	private String flightstatus;
	
	@Override
	public String toString() {
		return "Checkin [lastname=" + lastname + ", firstname=" + firstname + ", seatnumber=" + seatnumber
				+ ", checkintime=" + checkintime + ", flightnumber=" + flightnumber + ", flightdate=" + flightdate
				+ ", Bookingid=" + Bookingid + ",flightstatus=" +flightstatus+"]";
	}
	public Checkin(String lastname, String firstname, int seatnumber, LocalTime checkintime, int lightnumber,
			LocalDate flightdate, int bookingid) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.seatnumber = seatnumber;
		this.checkintime = checkintime;
		this.flightnumber = flightnumber;
		this.flightdate = flightdate;
		Bookingid = bookingid;
		this.flightstatus=flightstatus;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	public LocalTime getCheckintime() {
		return checkintime;
	}
	public void setCheckintime(LocalTime checkintime) {
		this.checkintime = checkintime;
	}
	public int getLightnumber() {
		return flightnumber;
	}
	public void setLightnumber(int lightnumber) {
		this.flightnumber = lightnumber;
	}
	public LocalDate getFlightdate() {
		return flightdate;
	}
	public void setFlightdate(LocalDate flightdate) {
		this.flightdate = flightdate;
	}
	public int getBookingid() {
		return Bookingid;
	}
	public void setBookingid(int bookingid) {
		Bookingid = bookingid;
	}
	public String getFlightstatus() {
		return flightstatus;
	}
	public void setFlightstatus(String flightstatus) {
		this.flightstatus = flightstatus;
	}
	
	

}
