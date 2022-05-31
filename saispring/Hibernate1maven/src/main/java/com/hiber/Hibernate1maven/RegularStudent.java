package com.hiber.Hibernate1maven;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;  
@Entity
@Table(name="regularstd")  
//@AttributeOverrides({  
//    @AttributeOverride(name="id", column=@Column(name="id")),  
//    @AttributeOverride(name="name", column=@Column(name="name")),
//    @AttributeOverride(name="city", column=@Column(name="city")) 
//})  
@PrimaryKeyJoinColumn(name="id")  
public class RegularStudent extends Student {
	
private int fee;
private String address;
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public RegularStudent(int fee, String address) {
	super();
	this.fee = fee;
	this.address = address;
}
public RegularStudent() {
	super();
}

}
