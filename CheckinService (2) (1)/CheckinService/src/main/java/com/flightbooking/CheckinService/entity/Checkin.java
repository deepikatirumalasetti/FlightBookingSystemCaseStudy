package com.flightbooking.CheckinService.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="status")
public class Checkin {

	String lastName;
	String firstName;
	String seatNumber;
	Date checkInTime;
	String flightNumber;
	String flightDate;
	@Id
	int bookingId;
	
	public Checkin() {
		
	}

	public Checkin(String lastName, String firstName, String seatNumber, Date checkInTime, String flightNumber,
			String flightDate, int bookingId) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.seatNumber = seatNumber;
		this.checkInTime = checkInTime;
		this.flightNumber = flightNumber;
		this.flightDate = flightDate;
		this.bookingId = bookingId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Date getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	@Override
	public String toString() {
		return "Checkin [lastName=" + lastName + ", firstName=" + firstName + ", seatNumber=" + seatNumber
				+ ", checkInTime=" + checkInTime + ", flightNumber=" + flightNumber + ", flightDate=" + flightDate
				+ ", bookingId=" + bookingId + "]";
	}

}
