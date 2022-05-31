package com.anotherexample.spring_2example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
   	ApplicationContext apli=new ClassPathXmlApplicationContext("Demo.xml");
   	Tv t1=(Tv) apli.getBean("lg");
   	t1.play();
    	
    }
}
