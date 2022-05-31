package com.school.schmanagement;

public class Teacher {
String techname;
String sub;


public String getTechname() {
	return techname;
}
public void setTechname(String techname) {
	this.techname = techname;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}


public School getSchool() {
	return school;
}
public void setSchool(School school) {
	this.school = school;
}

School school;


@Override
public String toString() {
	return "Teacher [techname=" + techname + ", sub=" + sub + ", school=" + school + "]";
}


}
