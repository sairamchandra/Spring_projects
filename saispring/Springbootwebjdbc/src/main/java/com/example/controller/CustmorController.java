package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Custmor;
import com.example.service.CustmorService;

@RestController
@RequestMapping("/demo")
public class CustmorController  {
	@Autowired
	private CustmorService custservice;
	
	
	@ResponseBody
	@GetMapping("/view")
	public String Hello() {
	
		return"hello friends";
	}
	
	@GetMapping("/custs")  
	private List<Custmor> getAllBooks()   
	{  
		return custservice.getAll();  
	}  
}
