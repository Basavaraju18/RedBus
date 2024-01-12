package com.jsp.redbus.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Seat {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int seatNumber;
	@ManyToOne
	private Bus bus;
	
	@OneToMany
	private List<Booking> bookings;
	
	public List<Booking> getBooking() {
		return bookings;
	}
	public void setBooking(List<Booking> booking) {
		this.bookings = booking;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	

}
