package org.bhavesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringFrameworkUdemyApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkUdemyApplication.class, args);
	}
	
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(SpringFrameworkUdemyApplication.class);
	  }

}
