package com.walmart.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
@Id
@Column(name="user_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;

@Column(name="first_name")
private String firstName;

@Column(name="last_name")
private String lastName;

@Column(name="email")
private String email;

@Column(name="password")
private String password;



public Client() {
	super();
}



public Client(String first_name, String last_name, String email, String password) {
	super();
	this.firstName = first_name;
	this.lastName = last_name;
	this.email = email;
	this.password = password;
}



public int getUserId() {
	return userId;
}



public void setUserId(int userId) {
	this.userId = userId;
}



public String getFirstName() {
	return firstName;
}



public void setFirstName(String first_name) {
	this.firstName = first_name;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String last_name) {
	this.lastName = last_name;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



@Override
public String toString() {
	return "Client [userId=" + userId + ", first_name=" + firstName + ", last_name=" + lastName + ", email=" + email
			+ ", password=" + password + "]";
}





}