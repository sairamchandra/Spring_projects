package com.onlinebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.onlinebank.dao.ClientDao;
import com.onlinebank.dao.DepositDaoImpl;
import com.onlinebank.dao.ProfileDao;
import com.onlinebank.model.Client;
import com.onlinebank.model.Deposit;
import com.onlinebank.profile.MyProfile;

@Controller
public class DepositController {
	@Autowired
	DepositDaoImpl depo1;
	@Autowired
	ClientDao clidentdao;

    /* It updates model object. */   
	@GetMapping("/addat")
	public String showdepoform(Model model) {
		Deposit de=new Deposit();
		model.addAttribute("depo",de);
		return "Deposit";
	}
	@GetMapping("/deposited")
	public String shoeclient(Model model) {
		List<Client> list=clidentdao.showclients();
		model.addAttribute("clients",list);
		return "clientdetails";
	}
    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("depo") Deposit deposit){    
        depo1.addamt(deposit);  
        
        return "showdetails";    
    } 
    
    
    @Autowired
	ProfileDao profiledao;
	@RequestMapping(value="/bal")    
    public String show(MyProfile myprofile,Model m){ 
		
		m.addAttribute("checkbal",myprofile);  
        return "checkbalance";    
    } 
	@RequestMapping(value = "/showbal", method = RequestMethod.GET)
	public String update(@RequestParam("id") int id, @ModelAttribute("student") MyProfile sd,Model model) {
		MyProfile student=profiledao.ShowProfile(id);
		
		
		model.addAttribute("check",student);

		return "Balance";
	}
	
}
