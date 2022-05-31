package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springsecurity.model.User;
@Service	
public class UserService {
	List<User> list=new ArrayList<>();


	public UserService() {
		list.add(new User("sai","sai123","dspsai9440@gmail.com"));
		list.add(new User("sai2","sai1234","dspsai944@gmail.com"));
	}

	public List<User> getAllUsers(){
		return this.list;
	}

	public User getUser(String username) {
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);




	}

	public User adduser(User user) {
		this.list.add(user);
		return user;
	}
}
