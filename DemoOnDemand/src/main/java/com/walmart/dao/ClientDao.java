package com.walmart.dao;

import java.util.List;

import com.walmart.entity.user.Client;

public interface ClientDao {
	public Client save(Client client);
	 
	 public Client findById(int id);
	 public List<Client> findAll();
	  
	 public void deleteById(int id);
	 public void deleteAllclients();
}
