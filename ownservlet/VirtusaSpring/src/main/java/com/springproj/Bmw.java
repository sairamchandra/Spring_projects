package com.springproj;

import org.springframework.stereotype.Component;

@Component
public class Bmw implements Car {
	public void drive() {
		System.out.println("i am bmw car");
	}
}
