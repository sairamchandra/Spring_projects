package com.shop.Mall;

import org.springframework.stereotype.Component;

@Component
public class Deemart implements Mall {

	public void shop() {
System.out.println("i am from deemart");		
	}

	@Override
	public String toString() {
		return "Deemart [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
