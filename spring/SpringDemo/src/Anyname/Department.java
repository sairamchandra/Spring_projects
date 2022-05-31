package Anyname;

import org.springframework.stereotype.Component;

@Component
public class Department {
String deptname,depthead;
int deptid;
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public String getDepthead() {
	return depthead;
}
public void setDepthead(String depthead) {
	this.depthead = depthead;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
@Override
public String toString() {
	return "Department [deptname=" + deptname + ", depthead=" + depthead + ", deptid=" + deptid + "]";
}




}
