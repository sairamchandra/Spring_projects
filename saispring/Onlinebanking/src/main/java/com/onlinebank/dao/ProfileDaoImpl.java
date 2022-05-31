package com.onlinebank.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.onlinebank.profile.MyProfile;
@Repository
public class ProfileDaoImpl implements ProfileDao {
	@Autowired
	JdbcTemplate jdbcTepmlate;

	
	
	@Override
	public MyProfile ShowProfile(int id) {
		String sql="select * from bankclients where id=?";
		MyProfile s=jdbcTepmlate.queryForObject(sql, new profileMapper(),id);
		return s;
	}

	
}
class profileMapper implements RowMapper<MyProfile> {

	public MyProfile mapRow(ResultSet rs, int arg1) throws SQLException {
		MyProfile myProfile = new MyProfile();
		myProfile.setId(rs.getInt("id"));
		myProfile.setUsername(rs.getString("username"));
		myProfile.setPasssword(rs.getString("password"));
		myProfile.setFullname(rs.getString("fullname"));
		myProfile.setPhone(rs.getLong("phone"));
		myProfile.setCity(rs.getString("city"));
		myProfile.setState(rs.getString("state"));
		myProfile.setEmail(rs.getString("email"));
		myProfile.setAccountnumber(rs.getInt("accountnumber"));
		myProfile.setAmount(rs.getInt("amount"));


		return myProfile;
	}
}