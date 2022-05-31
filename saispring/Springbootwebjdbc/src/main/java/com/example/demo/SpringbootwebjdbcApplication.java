package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.exemple.*"})
public class SpringbootwebjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebjdbcApplication.class, args);
	}

}
