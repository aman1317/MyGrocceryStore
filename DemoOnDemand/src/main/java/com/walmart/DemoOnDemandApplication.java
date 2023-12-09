package com.walmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.rest"})
public class DemoOnDemandApplication {

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoOnDemandApplication.class, args);
	}

}
