package com.onlinebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mysql.cj.xdevapi.Client;
import com.onlinebank.dao.ProfileDao;
import com.onlinebank.profile.MyProfile;

@Controller
@RequestMapping("/client")
public class ProfileController {
//	@Autowired
//	ProfileDao profiledao;
//	@RequestMapping(value="/bal")    
//    public String show(Model m){ 
//		m.addAttribute("checkbal");  
//        return "checkbalance";    
//    } 
//	
//	@RequestMapping(value="/showbal")    
//    public String edit(MyProfile myprofile,Model m){    
//       profiledao. ShowProfile(myprofile);  
//        m.addAttribute("checkbal");  
//        return "Balance";    
//    }   
}
