package Anyname;


import java.util.Iterator;
import java.util.*;

public class Employee {
	int id;
	String ename,email;

	Department department;
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", email=" + email + ", department=" + department + "]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}




	







}
