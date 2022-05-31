package com.onlinebank.dao;

import java.util.List;

import com.onlinebank.model.Client;
import com.onlinebank.model.Login;

public interface ClientDao {
	public void saveAccount(Client client);
	Client validateUser(Login login);
	List<Client> showclients();
}
