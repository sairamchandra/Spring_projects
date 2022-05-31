package com.onlinebank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.onlinebank.model.Client;
import com.onlinebank.model.Login;
@Repository
public class ClientDaoImpl implements ClientDao {
	@Autowired
	private	JdbcTemplate jdbcTemplate;

	@Override
	public void saveAccount(Client client) {
		String sql="insert into bankclients(username,password,fullname,phone,city,state,email,accountnumber) values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,client.getUsername(),client.getPasssword(),client.getFullname(),client.getPhone(),client.getCity(),client.getState(),client.getEmail(),client.getAccountnumber());
	}


	public Client validateUser(Login login) {

		String sql = "select * from bankclients where username='" + login.getUsername() + "' and password='" + login.getPassword()
		+ "'";

		List<Client> users = jdbcTemplate.query(sql, new ClientMapper());

		return users.size() > 0 ? users.get(0) : null;
	}




	@Override
	public List<Client>  showclients() {
		String sql="select * from bankclients";

		List<Client> stdlist=	jdbcTemplate.query(sql,new  ClientMapper());
		return stdlist;
	}
}

class ClientMapper implements RowMapper<Client> {

	public Client mapRow(ResultSet rs, int arg1) throws SQLException {
		Client client = new Client();
		client.setId(rs.getInt("id"));
		client.setUsername(rs.getString("username"));
		client.setPasssword(rs.getString("password"));
		client.setFullname(rs.getString("fullname"));
		client.setPhone(rs.getLong("phone"));
		client.setCity(rs.getString("city"));
		client.setState(rs.getString("state"));
		client.setEmail(rs.getString("email"));
		client.setAccountnumber(rs.getString("accountnumber"));
		client.setAmount(rs.getInt("amount"));


		return client;
	}
}