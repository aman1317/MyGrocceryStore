package com.walmart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	
	
	@GetMapping("/")
	public String hello(Model theModel) {
		
		return "home";
	}
}
