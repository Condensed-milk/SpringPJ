package com.tamago.JavaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.tamago.JavaApp"})
@RestController
public class JavaAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JavaAppApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)  {
		return application.sources(JavaAppApplication.class);
	}
}
