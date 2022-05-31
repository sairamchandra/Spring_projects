package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Custmor;


public interface CustomerRepository extends JpaRepository<Custmor,Integer>{

	List<Custmor> findBycustName(String name);
	List<Custmor> findBycustCountry(String country);
	List<Custmor> findBycustNameAndCustCountry(String name, String country);


}
