package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="hibcustmor")
public class Custmor {
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Id
	private Integer custNo;
	@Size(min = 2, max = 14)
	private String custName;
	private String custCountry;
	
	public Custmor() {

	}
	@Override
	public String toString() {
		return "Custmor [custNo=" + custNo + ", custName=" + custName + ", custCountry=" + custCountry + "]";
	}
	public Custmor(Integer custNo, String custName, String custCountry) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custCountry = custCountry;
	}
	public Integer getCustNo() {
		return custNo;
	}
	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustCountry() {
		return custCountry;
	}
	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}

}
