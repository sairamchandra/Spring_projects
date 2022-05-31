package com.example.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	protected void cofigure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/user/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	}
	
	  @Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication().withUser("sai").password("virtusa").roles("NORMAL");
			auth.inMemoryAuthentication().withUser("ram").password("{noop}vir").roles("ADMIN");

	  }
}
