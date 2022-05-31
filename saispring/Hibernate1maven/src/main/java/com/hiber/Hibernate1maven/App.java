package com.hiber.Hibernate1maven;

import java.util.Random;

import org.hibernate.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import  org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Student st=new Student();
		st.setId(39);
		st.setName("sairamchandra");
		st.setCity("ts");
		RegularStudent rs=new RegularStudent();
		
		rs.setFee(12);
		rs.setAddress("hyd");
		NullStudent Ns=new NullStudent();
		Ns.setStdmarks(45);
		Ns.setGrade("pass");
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(st);
		session.save(rs);
		session.save(Ns);
		tx.commit();
	}
}
