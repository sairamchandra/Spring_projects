package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Student;
import com.example.rowmapper.StdsRowMapper;
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void saveStudent(Student stud) {
		String sql="insert into students1(fname,lname,age,city) values(?,?,?,?)";
		jdbcTemplate.update(sql,stud.getFname(),stud.getLname(),stud.getAge(),stud.getCity());
	}



	@Override
	public List<Student>  showStudents() {
		String sql="select * from students1";

		List<Student> stdlist=	jdbcTemplate.query(sql,new  StdsRowMapper());
		return stdlist;
	}



	@Override
	public Student getstudent(int id) {
		String sql="select * from students1 where id =?";
		Student s=jdbcTemplate.queryForObject(sql, new StdsRowMapper(),id);
		return s;
	}



	@Override
	public void update(Student std) {
		String sql="update std set fname=? ,lname=?,age=?,city=? where id=?";
		jdbcTemplate.update(sql,std.getFname(),std.getLname(),std.getAge(),std.getCity());
	}}



