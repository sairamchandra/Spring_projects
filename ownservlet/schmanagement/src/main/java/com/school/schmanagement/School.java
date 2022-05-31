package com.school.schmanagement;

public class School {
String schname;

public String getSchname() {
	return schname;
}

public void setSchname(String schname) {
	this.schname = schname;
}

@Override
public String toString() {
	return "School [schname=" + schname + "]";
}

}
