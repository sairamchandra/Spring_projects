package com.anotherexample.spring_2example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Intex implements Tv {
	@Autowired
	private ColorClass color;
	@Autowired
	private ColorClass price;
	
public ColorClass getColor() {
		return color;
	}

	public void setColor(ColorClass color) {
		this.color = color;
	}

	public ColorClass getPrice() {
		return price;
	}

	public void setPrice(ColorClass price) {
		this.price = price;
	}



public void play() {
	System.out.println("my tv is intex"+" "+color+price);
	
}
}
