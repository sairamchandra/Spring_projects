package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDao {
public void saveStudent(Student stud);
List<Student> showStudents();
Student getstudent(int id);
public void update(Student std);
}
