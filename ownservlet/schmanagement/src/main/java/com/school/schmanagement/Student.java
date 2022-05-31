package com.school.schmanagement;

public class Student {
String stdname;
String stdid;
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public String getStdid() {
	return stdid;
}
public void setStdid(String stdid) {
	this.stdid = stdid;
}
public Teacher getTeacher() {
	return teacher;
}
public void setTeacher(Teacher teacher) {
	this.teacher = teacher;
}
Teacher teacher;
public void show() {
	System.out.println(stdname+" "+ stdid+" "+teacher);
}
@Override
public String toString() {
	return "Student [stdname=" + stdname + ", stdid=" + stdid + ", teacher=" + teacher + "]";
}

}
