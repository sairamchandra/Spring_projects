package com.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class React implements Technology {
	@Autowired
	private Javascript javascript;

	public Javascript getJavascript() {
		return javascript;
	}

	public void setJavascript(Javascript javascript) {
		this.javascript = javascript;
	}

	public void good() {
		System.out.println("i am good in React"+"   "+javascript);

	}

}
