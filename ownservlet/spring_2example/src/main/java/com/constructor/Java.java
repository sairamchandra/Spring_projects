package com.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Technology {
	@Autowired
	private Html html;

	public Html getHtml() {
		return html;
	}

	public void setHtml(Html html) {
		this.html = html;
	}

	public void good() {
		System.out.println("i am good in java"+html);		
	}

}
