package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class regcontroller {
    @RequestMapping("/register")
	public String showform() {
	return "register";
}
	
}
