package com.annota;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
@Autowired
	Company com;
public Company getCom() {
	return com;
}
public void setCom(Company com) {
	this.com = com;
}

@Override
public String toString() {
	return "A [com=" + com + "]";
}

}
