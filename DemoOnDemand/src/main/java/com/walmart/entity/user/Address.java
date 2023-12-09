package com.walmart.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {

@Id
@Column(name="address_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int addressId;

		
@Column(name="street_number")
private int streetNumber;
	

@Column(name="main_line")
private int mainLine;
	
@Column(name="city")
private int city;

@Column(name="province")
private String province;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(int streetNumber, int mainLine, int city, String province) {
	super();
	this.streetNumber = streetNumber;
	this.mainLine = mainLine;
	this.city = city;
	this.province = province;
}

public int getAddressId() {
	return addressId;
}

public void setAddressId(int addressId) {
	this.addressId = addressId;
}

public int getStreetNumber() {
	return streetNumber;
}

public void setStreetNumber(int streetNumber) {
	this.streetNumber = streetNumber;
}

public int getMainLine() {
	return mainLine;
}

public void setMainLine(int mainLine) {
	this.mainLine = mainLine;
}

public int getCity() {
	return city;
}

public void setCity(int city) {
	this.city = city;
}

public String getProvince() {
	return province;
}

public void setProvince(String province) {
	this.province = province;
}

@Override
public String toString() {
	return "Address [addressId=" + addressId + ", streetNumber=" + streetNumber + ", mainLine=" + mainLine + ", city="
			+ city + ", province=" + province + "]";
}



}
