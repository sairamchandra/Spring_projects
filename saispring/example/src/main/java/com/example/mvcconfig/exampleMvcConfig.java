package com.example.mvcconfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class exampleMvcConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
Class[] config= {studentConfi.class};
		return config;
	}

	@Override
	protected String[] getServletMappings() {
	String[] map= {"/"};
		return map;
	}

}
