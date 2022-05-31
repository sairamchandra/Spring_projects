package com.shopingmal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
	public static void main( String[] args )
	{


		ApplicationContext app =new ClassPathXmlApplicationContext("sample.xml");
		Mall m1=(Mall) app.getBean("deemart");
		m1.shop();
	}

}

