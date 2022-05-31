package com.onlinebank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.onlinebank.model.AdminLogin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public AdminLogin admlogin(AdminLogin admlog) {

		String sql = "select * from admin where username='" + admlog.getUsername() + "' and password='" + admlog.getPassword()
		+ "'";

		List<AdminLogin> admninuser = jdbcTemplate.query(sql, new AdminLoginmapper());

		return admninuser.size() > 0 ? admninuser.get(0) : null;
	}


}



class AdminLoginmapper implements RowMapper<AdminLogin> {

	public AdminLogin mapRow(ResultSet rs, int arg1) throws SQLException {
		AdminLogin admlogin = new AdminLogin();

		admlogin.setUsername(rs.getString("username"));
		admlogin.setPassword(rs.getString("password"));



		return admlogin;
	}
}
