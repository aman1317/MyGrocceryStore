package com.walmart.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.walmart.entity.inventory.Category;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
public class Testcontroller {
	
	@Value("${wife.name}")
	private String wifename;
	
	
	@GetMapping("/hello")
	public String hello(Model theModel) {
		theModel.addAttribute("theDate", new java.util.Date());
		return "helloworld";
	}
	
	@GetMapping("/processform")
	public String processForm(HttpServletRequest httprequest, Model theModel) {
		
		String studentName = httprequest.getParameter("studentname");
		studentName= studentName.toUpperCase();
		List<Category> categories= new ArrayList<>();
		
		theModel.addAttribute("catgeories",categories);
		theModel.addAttribute("uppercasename",studentName);
		theModel.addAttribute("theDate", new java.util.Date());
		
		
		return "helloworld";
	}

	@GetMapping("/processformwithnewway")
	public String readFromRequestParam(@RequestParam("studentname") String theStudentName , Model theModel) {
		
		//String studentName = httprequest.getParameter("studentname");
		theStudentName= theStudentName.toUpperCase();
		List<Category> categories= new ArrayList<>();
		
		theModel.addAttribute("catgeories",categories);
		theModel.addAttribute("uppercasename",theStudentName);
		theModel.addAttribute("theDate", new java.util.Date());
		
		
		return "helloworld";
	}

	@GetMapping("/showform")
	public String showForm(Model theModel) {
		
		Category theCategory= new Category();
		theModel.addAttribute("category",theCategory);
		theModel.addAttribute("wifeName",wifename);
		return "student-form";
	}
	
	@PostMapping("/processStudentForm")
	public String processStudentForm(@Valid @ModelAttribute("category") Category theCategory , BindingResult bindingresult, Model theModel) {
		
		System.out.println("Hello Aman here");
		//System.out.println("Category is "+theCategory.getCategoryName()+ "and "+theCategory.getCategoryDesc());
		System.out.println("Binding results are   "+bindingresult.toString());
		System.out.println("errors exists ??   "+bindingresult.hasErrors());
		if(bindingresult.hasErrors()) {
			return "student-form";
		}
		else {
		return "category-confirm";
		}
	}
	
	
	@InitBinder
	public void initbinder(WebDataBinder webdatabinder) {
		/*
		 * This method is used before every URL request in Project, Its like interceptor
		 * of Angular, we can add the logic how we want to treat each request before
		 * actually going through the API
		 */		
		
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webdatabinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}


	
	
	
	
	
}
