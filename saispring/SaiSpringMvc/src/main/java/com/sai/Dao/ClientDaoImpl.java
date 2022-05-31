package com.sai.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sai.model.Client;
@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveClient(Client client) {
		String sql="insert into example(username,password,name,age,city) values(?,?,?,?,?)";
		jdbcTemplate.update(sql,client.getUsername(),client.getPassword(),client.getName(),client.getAge(),client.getCity());
	}
	
}
