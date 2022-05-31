package Anyname;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Client {

	public static void main(String[] args) {
		//object creation done by the developer 
//		Employee  eClient= new Employee();
//		eClient.setId(1);
//		eClient.setEname("sairamchandra");
//		eClient.setEmail("dspsai@gmail.com");
//		System.out.println("employee is:"+eClient);
		// spring way using IOC

//		Resource res= new ClassPathResource("Demo.xml");
//		BeanFactory fact=new XmlBeanFactory(res);
		ApplicationContext context= new ClassPathXmlApplicationContext("Demo.xml");
		EMployees e1=(EMployees)context.getBean("list");
		System.out.println(e1);
		
	

//		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
//		cxt.close();
	}

}
