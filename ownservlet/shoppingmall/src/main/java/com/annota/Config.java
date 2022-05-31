package com.annota;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages= {"com.annota"})
@PropertySource("classpath:info")
public class Config
{

//@Bean(name="com")
//public Company com() {
//	Company company=new Company();
//	return new Company();
//	
//}
//@Bean(name="software")
//public Software software() {
//	
//	return  new Software();
//}
//@Bean(name="hardware")
//public Hardware hardware() {
//	
//	return  new Hardware();
//}

}
