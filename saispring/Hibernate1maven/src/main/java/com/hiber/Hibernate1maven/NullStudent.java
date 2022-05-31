package com.hiber.Hibernate1maven;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="nullstd")  
//@AttributeOverrides({  
//    @AttributeOverride(name="id", column=@Column(name="id")),  
//    @AttributeOverride(name="name", column=@Column(name="name")),
//    @AttributeOverride(name="city", column=@Column(name="city")) 
//}) 
@PrimaryKeyJoinColumn(name="id") 
public class NullStudent extends Student {
	private int stdmarks;
	private String grade;
	public NullStudent() {
		super();
	}
	public int getStdmarks() {
		return stdmarks;
	}
	public void setStdmarks(int stdmarks) {
		this.stdmarks = stdmarks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public NullStudent(int stdmarks, String grade) {
		super();
		this.stdmarks = stdmarks;
		this.grade = grade;
	}
	

}
