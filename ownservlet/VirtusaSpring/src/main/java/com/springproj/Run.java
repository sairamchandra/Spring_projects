package com.springproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		ApplicationContext apli=new ClassPathXmlApplicationContext("Demo.xml");

		Car c1=(Car) apli.getBean("audi");
		c1.drive();

	}
}
