package com.spring.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.dao.userDaoIml;
import com.spring.mvc.model.User;

@Controller
public class HomeController {
	@Autowired
public 	static userDaoIml userdaoiml;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/registerprocess", method=RequestMethod.POST)
	public ModelAndView register(HttpServletRequest req, HttpServletResponse response,User u ) {
		userdaoiml.register(u);
		return new ModelAndView("display");
	}
}
