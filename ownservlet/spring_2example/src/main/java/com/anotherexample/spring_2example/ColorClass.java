package com.anotherexample.spring_2example;




public class ColorClass {
	private String color;
	private int price;
	//constructor injection

	//	public ColorClass(String color, int price) {
	//		
	//		this.color = color;
	//		this.price = price;
	//	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ColorClass [color=" + color + ", price=" + price + "]";
	}


}
