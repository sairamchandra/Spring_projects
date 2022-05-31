package Anyname;

import java.util.List;
import java.util.Iterator;

public class EMployees {
	String details;
	public String getDetails() {
		return details;
	}
	public EMployees() {}

	public void setDetails(String details) {
		this.details = details;
	}


	private List<Employee> employees;


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public EMployees(String details, List<Employee> employees) {
		super();
		this.details = details;
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "EMployees [details=" + details + ", employees=" + employees + "]";
	}

	public void show() {


		System.out.println("all employess details :");
		Iterator<Employee> itr=employees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");

		}
	}



}
