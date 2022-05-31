package com.anotherexample.spring_2example;

public class ConInj {
 
private String version;

public ConInj(String version) {
	
	this.version = version;
}

@Override
public String toString() {
	return "ConInj [version=" + version + "]";
}
 
	
	
}
