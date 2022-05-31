package springmvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class springMvcInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		DispatcherServlet dispatcherServlet=new DispatcherServlet();
		ServletRegistration.Dynamic mycustomdispatcher=servletContext.se
	}

}
