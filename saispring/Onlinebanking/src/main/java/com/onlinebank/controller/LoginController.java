package com.onlinebank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.Session;
import com.onlinebank.dao.AdminDao;
import com.onlinebank.dao.ClientDao;
import com.onlinebank.model.AdminLogin;
import com.onlinebank.model.Client;
import com.onlinebank.model.Login;

@Controller
public class LoginController {
	@Autowired
	ClientDao clientdaoser;
	@Autowired
	AdminDao admdao;
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());

		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Login login , HttpSession seasion,Model model) {
		ModelAndView mav = null;

		Client user = clientdaoser.validateUser(login);

		if (null != user) {
			seasion.setAttribute("clientsea", user);
			mav = new ModelAndView("welcome");
			mav.addObject("id", user.getId());
			mav.addObject("fullname", user.getFullname());
			mav.addObject("username", user.getUsername());
			mav.addObject("phone", user.getPhone());
			mav.addObject("city", user.getCity());
			mav.addObject("email", user.getEmail());
			mav.addObject("state", user.getState());
			mav.addObject("accountnumber", user.getAccountnumber());
			mav.addObject("amount", user.getAmount());
			
		} else {
			mav = new ModelAndView("error");
			mav.addObject("message", "Username or Password is wrong!!");
		}

		return mav;
	}
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpSession session) {
		request.getSession().invalidate();
		return "redirect:welcometobankmain";

	}


}
