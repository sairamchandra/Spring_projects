package com.hiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;

import javassist.runtime.Desc;

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
		Session session=factory.openSession();
		Criteria crit = session.createCriteria(Student.class);
		ProjectionList prolist=Projections.projectionList();
		prolist.add(Projections.rowCount());
		prolist.add(Projections.max("age"));
		prolist.add(Projections.min("age"));
		crit.setProjection(prolist);
		//		crit.setProjection(Projections.rowCount());
		//crit.setProjection(Projections.max("age"));
		//		crit.setProjection(Projections.min("age"));
		List<Object[]> results = crit.list();
		  Iterator iterator = results.iterator();
	        while (iterator.hasNext()) {
	            Object[] obj = (Object[]) iterator.next();
	            System.out.println("count  :" + obj[0] + " max age : " + obj[1] + " min Age : " + obj[2]);
	        }
//		for (Object[] objects : results) {
//			System.out.println("count : "+objects[0]);
//			       System.out.println("min age : "+objects[1]);
//			       System.out.println("max age : "+objects[2]);t
//			   	
//		}  
//	 
		//		for(Student std:results) {
		//			System.out.println(std);
		//		}
		//		String query1="from Student";
		//		Query q1=session.createQuery(query1);
		//		List<Student> list1=q1.list();
		//		Iterator<Student> itr=list1.iterator();    
		//		while(itr.hasNext()){    
		//			Student q=itr.next();    
		//			System.out.println("Question Name: "+q.getName());   
		//		}
		//		String query2="from Student as s";
		//		Query q2=session.createQuery(query2);
		//		List<Student> list2=q2.list();
		//		String query3="from Student s";
		//		Query q3=session.createQuery(query2);
		//		List<Student> list3=q3.list();
		//		Iterator<Student> itr1=list3.iterator();    
		//		while(itr1.hasNext()){    
		//			Student q4=itr.next();    
		//			System.out.println("Question Name: "+q4.getName());   
		//		}
		//		delete
		//		Transaction t=session.beginTransaction();    
		//		String hql = "Delete Student  where id=1 ";   
		//	           
		//	Query query5 = session.createQuery(hql);
		//	
		//	int result = query5.executeUpdate();
		//	System.out.println("Rows affected: " + result);
		//	t.commit();
		//order
		//	String hql2 = "FROM Student s WHERE s.id > 1 ORDER BY s.city DESC";
		//	Query query = session.createQuery(hql2);
		//	List results = query.list();
		//	
		//	System.out.println(results);
		//	
		//group
		//	String hql4 = "SELECT s.name FROM Student s " +
		//            "GROUP BY s.id";
		//Query query6 = session.createQuery(hql4);
		//List resultsg = query6.list();
		//System.out.println(resultsg);
		//pegnition
		//String hql7 = "FROM Student";
		//Query query9 = session.createQuery(hql7);
		//query9.setFirstResult(0);
		//query9.setMaxResults(9);
		//List results10 = query9.list();
		//System.out.println(results10);
	}
}
