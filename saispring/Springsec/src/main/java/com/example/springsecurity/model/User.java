package com.example.springsecurity.model;

import javax.persistence.Entity;
	
@Entity
public class User {
String Username;
String password;
String email;
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User(String username, String password, String email) {
	super();
	Username = username;
	this.password = password;
	this.email = email;
}
public User() {
	
}
}
