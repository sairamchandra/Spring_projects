package com.example.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Student;

public class StdsRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setId(	rs.getInt("id"));
		student.setFname(rs.getString("fname"));
		student.setLname(rs.getString("lname"));
		student.setAge( rs.getInt("age"));
		student.setCity(	rs.getString("city"));
		return student;
	}

}
