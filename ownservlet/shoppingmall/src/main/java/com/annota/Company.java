package com.annota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Company {
@Value("${Company.name}")
String companyname;



@Autowired
@Qualifier("software")
Engineer Eng;
public Engineer getEng() {
	return Eng;
}

public void setEng(Engineer eng) {
	Eng = eng;
}


public String getCompanyname() {
	return companyname;
}



public void setCompanyname(String companyname) {
	this.companyname = companyname;
}





void showdetails() {
	System.out.println("this is company method"+" ");
	System.out.println("company name :"+companyname);
	Eng.Development();
}

@Override
public String toString() {
	return "Company [companyname=" + companyname + ", Eng=" + Eng + "]" ;
}

};

