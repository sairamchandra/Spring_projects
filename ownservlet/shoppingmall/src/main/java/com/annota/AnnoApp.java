package com.annota;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shopingmal.Mall;

public class AnnoApp {

	public static void main(String[] args) {

		ApplicationContext apli=new AnnotationConfigApplicationContext(Config.class);
		Company com= apli.getBean("company",Company.class);
	com.showdetails();
	A a= apli.getBean("a",A.class);
	
	System.out.println(a);
		

	}

}
