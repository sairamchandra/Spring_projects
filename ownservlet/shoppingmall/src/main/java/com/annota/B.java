package com.annota;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class B {
	@Bean
	public A a() {
		return new A();
	}


}
