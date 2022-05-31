package com.school.schmanagement;

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
       Student s1=(Student) apli.getBean("std");
       System.out.println(s1);
       Student s2=(Student) apli.getBean("std1");
       System.out.println(s2);
    }
}
