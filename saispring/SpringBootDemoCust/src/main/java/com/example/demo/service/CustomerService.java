package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Custmor;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repo;

	public List<Custmor> getAll(){
		List<Custmor> customer = repo.findAll();
		System.out.println(customer);
		return repo.findAll();

	}
	public Optional<Custmor> getById(Integer id){
		return repo.findById(id);
	}
	public Custmor addUser(Custmor custmor) {
		return repo.save(custmor);
	}
	public void delbyid(Integer id){
		repo.deleteById(id);
	}
	
	
	public List<Custmor> getByName(String name) {
		return repo.findBycustName(name);
	}
	public List<Custmor> getByCountry(String country){
		return repo.findBycustCountry(country);
	}
	public List<Custmor> getByNameAndCountry(String name ,String country){
		return repo.findBycustNameAndCustCountry(name,country);
	}
	
//	   public void updateid(Integer id, Custmor custmor) {
//		   Custmor cust = CustomerRepository.findById(id).get();
//	       
//	        CustomerRepository.save(cust);
//	    }
//	
	
}
