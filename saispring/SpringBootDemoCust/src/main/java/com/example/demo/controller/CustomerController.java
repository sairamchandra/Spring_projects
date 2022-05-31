package com.example.demo.controller;

import static org.springframework.http.ResponseEntity.status;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Custmor;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/demo")
public class CustomerController {
	@Autowired
	private CustomerService service;

	@GetMapping("/checking")
	public String hello() {
		return "hello Teams";
	}

	@RequestMapping(value ="/findAll")
	public String getAll(Model model){
		model.addAttribute("list",service.getAll());
		return "index";
	}
	@GetMapping("custmor/{id}")
	public ResponseEntity<?> getCustById(@PathVariable Integer id){
		
		return status(200).body(service.getById(id));	
		}
	@PostMapping("/add")
	public ResponseEntity<?> addUser(@Valid @RequestBody Custmor custmor){
		return status(200).body(service.addUser(custmor));	
		}
	 @DeleteMapping({"/{CustmorId}"})
	 public ResponseEntity<Custmor> delbycustid(@PathVariable("CustmorId") Integer CustmorId){
		service.delbyid(CustmorId);
		 return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
			}
	 
	 @GetMapping("/byname/{name}")
		public ResponseEntity<?> getCustByName(@PathVariable String name){
			return status(200).body(service.getByName(name));
		}
		
		@GetMapping("/bycountry/{country}")
		public ResponseEntity<?> getCustByCountry(@PathVariable String country){
			return status(200).body(service.getByCountry(country));
		}
		
		@GetMapping("/bynameandcountry/{name}/{country}")
		public ResponseEntity<?> getCustByNameAndCountry(@PathVariable String name,@PathVariable String country){
			return status(200).body(service.getByNameAndCountry(name,country));
		}
	 
//	 @PutMapping({"/{CustmorId}"})
//	    public ResponseEntity<Custmor> updateTodo(@PathVariable("CustmorId") Integer CustmorId, @RequestBody Custmor custmor) {
//	        service.updateid(CustmorId, custmor);
//	        return new ResponseEntity<>(service.getTodoById(CustmorId), HttpStatus.OK);
//	    }
}
