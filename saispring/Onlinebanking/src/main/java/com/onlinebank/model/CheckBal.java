package com.onlinebank.model;

public class CheckBal {
private int accountnumber;
private String username;
public int getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(int accountnumber) {
	this.accountnumber = accountnumber;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public CheckBal(int accountnumber, String username) {
	super();
	this.accountnumber = accountnumber;
	this.username = username;
}
public CheckBal() {
	
}
}
