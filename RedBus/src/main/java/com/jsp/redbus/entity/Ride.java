package com.jsp.redbus.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ride {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int rideId;
	
	@ManyToOne
	private Bus bus;
	private LocalTime startTime;
	private LocalTime endingTime;
	private String fromLoc;
	private String toLoc;
	
	@OneToMany(mappedBy = "ride")
	private List<Booking> bookings=new ArrayList<>();
	
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public int getRideId() {
		return rideId;
	}
	public void setRideId(int rideId) {
		this.rideId = rideId;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndingTime() {
		return endingTime;
	}
	public void setEndingTime(LocalTime endingTime) {
		this.endingTime = endingTime;
	}
	public String getFromLoc() {
		return fromLoc;
	}
	public void setFromLoc(String fromLoc) {
		this.fromLoc = fromLoc;
	}
	public String getToLoc() {
		return toLoc;
	}
	public void setToLoc(String toLoc) {
		this.toLoc = toLoc;
	}
	
}



// one to many we have to add mapped by