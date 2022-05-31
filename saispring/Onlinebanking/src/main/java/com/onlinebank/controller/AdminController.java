package com.onlinebank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onlinebank.dao.AdminDao;
import com.onlinebank.model.AdminLogin;

@Controller
public class AdminController {
	@Autowired
	AdminDao admdao;
	@RequestMapping(value = "/admlogin", method = RequestMethod.GET)
	public ModelAndView admshowLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("AdminLogin");
		mav.addObject("admlogin", new AdminLogin());

		return mav;
	}

	@RequestMapping(value = "/admloginProcess", method = RequestMethod.POST)
	public ModelAndView admloginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("admlogin") AdminLogin admlogin) {
		ModelAndView mav = null;

		AdminLogin user = admdao.admlogin(admlogin);

		if (null != user) {
			mav = new ModelAndView("AdminWelcomepage");
			
		} else {
			mav = new ModelAndView("error");
			mav.addObject("message", "Username or Password is wrong!!");
		}

		return mav;
	}
}
