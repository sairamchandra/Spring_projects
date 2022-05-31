package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;
import com.example.springsecurity.model.User;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	@Autowired
public UserService service;


@GetMapping("/all")
 public List<User> getAllUser(){
	 return this.service.getAllUsers();
 }
@GetMapping("/{username}")
public User getUser(@PathVariable("username") String username ) {
	return this.service.getUser(username);
}
@GetMapping("/")
public User add(@RequestBody User user ) {
	return this.service.adduser(user);
}


}
