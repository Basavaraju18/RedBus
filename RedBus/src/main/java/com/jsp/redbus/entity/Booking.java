package com.jsp.redbus.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int bookingId;
	
	private LocalDateTime time_date;
	
	public LocalDateTime getTime_date() {
		return time_date;
	}
	public void setTime_date(LocalDateTime time_date) {
		this.time_date = time_date;
	}
	@ManyToOne
	private Bus bus;
	
	@ManyToOne
	private Seat seat;
	
	@ManyToOne
	private Traveller taveller;
	
	@ManyToOne
	private Ride ride;
	
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Traveller getTaveller() {
		return taveller;
	}
	public void setTaveller(Traveller taveller) {
		this.taveller = taveller;
	}
	public Ride getRide() {
		return ride;
	}
	public void setRide(Ride ride) {
		this.ride = ride;
	}
}
