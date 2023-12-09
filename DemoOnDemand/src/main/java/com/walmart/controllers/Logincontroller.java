package com.walmart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Logincontroller {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage(Model theModel) {
		
		return "login-page";
	}
	
	@GetMapping("//accessDenied")
	public String accessDenied(Model theModel) {
		
		return "access-denied";
	}
}
