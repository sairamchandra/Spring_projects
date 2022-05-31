package com.example.model;

import org.hibernate.validator.constraints.Range;

import com.example.Cityvalid;
import com.example.lnamevalid;
import com.example.nameValidation;

public class Student {
	private int id;
	@nameValidation
	private String fname;
	@lnamevalid(message = "yours name should be capital")
	private String lname;

	@Range(min = 21, max = 150,message = "age is not matched")
	private Integer age;
	@Cityvalid(message = "yours city wiil be end with pur	")
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", city=" + city + "]";
	}



}
