package com.walmart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.entity.user.Client;

public interface ClientJPARepository  extends JpaRepository<Client, Integer>{

	public List<Client> findAllByOrderByLastNameAsc();
}
