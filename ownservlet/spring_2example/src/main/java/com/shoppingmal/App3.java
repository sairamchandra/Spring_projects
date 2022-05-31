package com.shoppingmal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App3 {
	public static void main(String[] args) {
		ApplicationContext app =new ClassPathXmlApplicationContext("Demo3.xml");
	    Mall mm=(Mall) app.getBean("max");
		mm.shop();
	}
}
