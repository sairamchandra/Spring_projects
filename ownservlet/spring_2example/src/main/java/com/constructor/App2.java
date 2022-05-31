package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		ApplicationContext apli=new ClassPathXmlApplicationContext("Demo2.xml");
		Technology t1= (Technology) apli.getBean("react");
	    t1.good();
//		Html h=(Html) apli.getBean("html");
//		System.out.println(h);
//	    Javascript js1=(Javascript) apli.getBean("Js"); 
//	    System.out.println(js1);
	}
}
