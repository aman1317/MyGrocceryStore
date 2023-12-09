package com.walmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.entity.inventory.Category;

//@RepositoryRestResource(path = "custom-categories")
public interface CategoryJPARepository extends JpaRepository<Category, Integer>{
	// Category findByCategoryName(String categoryName);
}
