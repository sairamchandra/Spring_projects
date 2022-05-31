package com.onlinebank.model;

public class Deposit {
private String username;
private int id;
private int amount;
private int accountnumber;

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
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Deposit [username=" + username + ", amount=" + amount + ", accountnumber=" + accountnumber + "]";
}
public Deposit(String username, int amount, int accountnumber) {
	
	this.username = username;
	this.amount = amount;
	this.accountnumber = accountnumber;
}
public Deposit() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
