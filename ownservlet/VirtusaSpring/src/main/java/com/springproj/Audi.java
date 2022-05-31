package com.springproj;

import org.springframework.stereotype.Component;

@Component
public class Audi implements Car{
	public void drive() {
		System.out.println("i am audi car");
	}
}
