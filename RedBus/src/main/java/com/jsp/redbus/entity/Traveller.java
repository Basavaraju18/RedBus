package com.jsp.redbus.entity;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Traveller {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int travellerId;
	
	private String name;
	private int age;
	private String gender;
	private String phn;
	
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	@OneToMany(mappedBy = "taveller")
	private List<Booking> booking;
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	public int getTravellerId() {
		return travellerId;
	}
	public void setTravellerId(int travellerId) {
		this.travellerId = travellerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
