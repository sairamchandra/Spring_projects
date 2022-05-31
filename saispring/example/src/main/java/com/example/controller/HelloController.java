package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dao.StudentDao;
import com.example.model.Student;

@Controller
public class HelloController {
	@Autowired
	StudentDao stddao;

	@RequestMapping("/showStudents")
	public String showdetails(Model model) {
		List<Student> list=stddao.showStudents();
		model.addAttribute("students",list);
		return "StudentsList";
	}

	@RequestMapping(value = "/showform", method = RequestMethod.GET)
	public String saveResult(Model model) {
		Student sd=new Student();
		model.addAttribute("student", sd);
		return "register";
	}
	@RequestMapping(value = "/updatestud", method = RequestMethod.GET)
	public String update(@RequestParam("userId") int id, @ModelAttribute("student") Student sd,Model model) {
		Student student=stddao.getstudent(id);
		sd.setFname(student.getFname());
		sd.setLname(student.getLname());
		sd.setAge(student.getAge());
		sd.setCity(student.getCity());
		model.addAttribute("student",student);

		return "register";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveResults(@Validated @ModelAttribute("student") Student std, BindingResult br ) {

		if(br.hasErrors()) {
			return "register";
		}
		else if(std.getId()==0) {
			stddao.saveStudent(std);
			return "output";
		}
		else {
			stddao.update(std);
		}
			return "output";
		}
	}
