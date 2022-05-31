package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repositry.CustmorRepositry;
import com.example.demo.model.Custmor;

@Service
public class CustmorService {
	@Autowired
	private CustmorRepositry repo;
	public List<Custmor> getAll(){
		List<Custmor> cust=repo.findAll();
		System.out.println(cust);
		return repo.findAll();

	}
}
