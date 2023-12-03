package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@Value("${wife.name}")
	private String wifeName;
	
	@GetMapping("/")
	public String hello() {
		return "Hello " + wifeName+", how r u, i am good.";
	}
	
}
