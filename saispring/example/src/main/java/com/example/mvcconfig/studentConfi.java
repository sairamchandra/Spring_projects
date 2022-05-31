package com.example.mvcconfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example.*")
public class studentConfi implements  WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver  viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());


		return jdbcTemplate;
	}

	DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("Sairamchandra65@");
		dataSource.setUrl("jdbc:mysql://localhost:3306/demovirtusa");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	}
	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {

	  	  registry.addResourceHandler("/myStyleFol/**").addResourceLocations("/resources/");
	  }
}
