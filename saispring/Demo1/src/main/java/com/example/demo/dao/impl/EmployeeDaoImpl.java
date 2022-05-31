package com.example.demo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public void createEmployee(Employee employee) {
		String Create_Empploye_Sql="insert into employee_table(employee_name,email,salary)values(?,?,?)";
		int update=jdbctemplate.update(Create_Empploye_Sql,employee.getEmployee_name(),employee.getEmail(),employee.getSalary());
		if(update==1) {
			System.out.println("employee created");
		}else {
			System.out.println("employee not created");
		}

		//del client
		//edit clint
	
			
	}
	

}
