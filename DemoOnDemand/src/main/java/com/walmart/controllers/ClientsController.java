package com.walmart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.walmart.entity.user.Client;
import com.walmart.service.ClientService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/clients")
public class ClientsController {
	
	private ClientService clientservice;

	@Autowired
	ClientsController(ClientService clientService){
		this.clientservice=clientService;
	}
	
		
	
	
	
	
	
	@GetMapping("/list")
	public String listOfClients(Model theModel) {
		
		List<Client> theClients = clientservice.findAll();
		
		theModel.addAttribute("clients", theClients);
		return "list-employees";
	}
	
	@GetMapping("/{clientID}")
	public String getClient(@RequestParam("clientID") int clientID) {

		clientservice.findById(clientID);
		return "list-employees";
	}
	
	
	@PostMapping("/save")
	public String saveClient(@ModelAttribute("client") Client theClient) {
		clientservice.save(theClient);
		return "list-employees";
		}
	
	@PutMapping("/save")
	public String updateClient(@ModelAttribute("client") Client theClient) {
		clientservice.save(theClient);
		return "list-employees";
		}

	
	@DeleteMapping("/{clientID}")
	public String deleteClient(@RequestParam("clientID") int clientID) {

		clientservice.deleteById(clientID);
		return "list-employees";
	}
	
	@DeleteMapping("/delete")
	public String deleteAllClient() {

		clientservice.deleteAllclients();
		return "list-employees";
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
