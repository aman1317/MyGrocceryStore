package com.walmart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.walmart.entity.user.Client;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class ClientDaoImpl implements ClientDao{

	private EntityManager entitymanager;
	

	 @Autowired 
	 ClientDaoImpl(EntityManager entitymanager){
	 this.entitymanager=entitymanager; 
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
		
		TypedQuery<Client> theQuery=entitymanager.createQuery("from Client",Client.class);
		List<Client> listOfClients = theQuery.getResultList(); 
		return listOfClients;
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
