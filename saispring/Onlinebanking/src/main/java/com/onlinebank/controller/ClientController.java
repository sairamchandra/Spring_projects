package com.onlinebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlinebank.dao.ClientDao;
import com.onlinebank.model.Client;


@Controller
public class ClientController {
	@Autowired
	ClientDao clientdao;

	@RequestMapping("/show")
	public String showdetails(Model model) {
		List<Client> list=clientdao.showclients();
		model.addAttribute("clients",list);
		return "profile";
	}

	@GetMapping(value = "/devlopers")
	public String showClients() {

		return "developers";
	}
	@GetMapping(value = "/welcometobankmain")
	public String welcome() {

		return "welcometobank";
	}
	@GetMapping(value = "/registerhere")
	public String showClient(Model model) {
		Client client=new Client();
		model.addAttribute("client", client);
		return "addAccount";
	}

	@PostMapping(value = "/saveAccount")
	public String SaveClient(Client client) {
		clientdao.saveAccount(client);
		return "saved";
	}
}
