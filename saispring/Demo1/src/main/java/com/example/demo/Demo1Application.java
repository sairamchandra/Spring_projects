package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDAO;
	
	public static void main(String[] args) {
		System.out.println("i am in main");
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("after calling Run");
		}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("i am in Run");
		cerateEmployee();
	}

	private void cerateEmployee() {
		System.out.println("i am in Create");
		Employee employee = new Employee();
		employee.setEmployee_name(" ram chandra");
		employee.setEmail("dspsai65@gmail.com");
		employee.setSalary(2450.11);
		employeeDAO.createEmployee(employee);
	}	
}
