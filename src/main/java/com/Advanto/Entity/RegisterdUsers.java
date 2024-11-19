package com.Advanto.Entity;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RegisterdUsers {

	@Id
	int adharNo;
	String name;
	int age;
	
	String bordingpoint;
	String destinationpoint;
	
	//@Temporal(value = TemporalType.DATE)
	LocalDate ddateofDeparture;
	boolean payment;
	public RegisterdUsers(int adharNo, String name, int age, String bordingpoint, String destinationpoint,
			LocalDate ddateofDeparture, boolean payment) {
		super();
		this.adharNo = adharNo;
		this.name = name;
		this.age = age;
		this.bordingpoint = bordingpoint;
		this.destinationpoint = destinationpoint;
		this.ddateofDeparture = ddateofDeparture;
		this.payment = payment;
	}
	public RegisterdUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
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
	public String getBordingpoint() {
		return bordingpoint;
	}
	public void setBordingpoint(String bordingpoint) {
		this.bordingpoint = bordingpoint;
	}
	public String getDestinationpoint() {
		return destinationpoint;
	}
	public void setDestinationpoint(String destinationpoint) {
		this.destinationpoint = destinationpoint;
	}
	public LocalDate getDdateofDeparture() {
		return ddateofDeparture;
	}
	public void setDdateofDeparture(LocalDate ddateofDeparture) {
		this.ddateofDeparture = ddateofDeparture;
	}
	public boolean isPayment() {
		return payment;
	}
	public void setPayment(boolean payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "RegisterdUsers [adharNo=" + adharNo + ", name=" + name + ", age=" + age + ", bordingpoint="
				+ bordingpoint + ", destinationpoint=" + destinationpoint + ", ddateofDeparture=" + ddateofDeparture
				+ ", payment=" + payment + "]";
	}
	
	
	
	
	
	
	
	
}
