package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hibcustmor")
public class Custmor {
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Id
	private Integer custNo;
	private String custname;
	private String CustCountry;
	public Custmor() {

	}
	public Custmor(Integer custNo, String custname, String custCountry) {
		super();
		this.custNo = custNo;
		this.custname = custname;
		CustCountry = custCountry;
	}
	@Override
	public String toString() {
		return "Custmor [custNo=" + custNo + ", custname=" + custname + ", CustCountry=" + CustCountry + "]";
	}
	public Integer getCustNo() {
		return custNo;
	}
	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustCountry() {
		return CustCountry;
	}
	public void setCustCountry(String custCountry) {
		CustCountry = custCountry;
	}

}
