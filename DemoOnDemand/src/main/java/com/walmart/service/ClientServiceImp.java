package com.walmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.entity.user.Client;
import com.walmart.repository.ClientJPARepository;

@Service
public class ClientServiceImp implements ClientService{
	private ClientJPARepository clientJPA;
	
	@Autowired 
	ClientServiceImp(ClientJPARepository clientJPA){
		 this.clientJPA=clientJPA; 
		}
		 
	
	
	@Override
	public Client save(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findAll() {
		
		//return clientJPA.findAll();
		return clientJPA.findAllByOrderByLastNameAsc();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllclients() {
		// TODO Auto-generated method stub
		
	}

}
