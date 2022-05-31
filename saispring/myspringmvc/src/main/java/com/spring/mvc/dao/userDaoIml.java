package com.spring.mvc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.mvc.model.User;

public class userDaoIml implements userDao {
	@Autowired
	DataSource dataSource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void register(User u) {
		String sql="insert into user(username,password,firstname,lastname,email,address,phone) values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,u.getUsername(),u.getPassword(),u.getFirstname(),u.getLastname(),u.getEmail(),u.getAddress(),u.getPhone());

	}

}
