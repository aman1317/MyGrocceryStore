  package com.walmart.service;
  
  import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import
  org.springframework.stereotype.Service;

import com.walmart.common.exceptions.CategoryNotFoundException;
import
  com.walmart.entity.inventory.Category;
import
  com.walmart.repository.CategoryJPARepository;
  
  
  /*
   * We dont Need this anymore, if we are using the sping-data-rest, as it will
   * read all the JPA repository written in project and give basics CRUD functions
   * for all
   */




  
  @Service public class CategoryServiceImpl implements CategoryService{
 // private CategoryDao categoryDao; 
 private CategoryJPARepository  categoryJpaRepository;
  
  @Autowired CategoryServiceImpl(CategoryJPARepository categoryJpaRepository){
  this.categoryJpaRepository=categoryJpaRepository; }
  
  
  //No need to use @transactional as it will be handles by JPA repository
  
  
  
  @Override public Category save(Category grocery) {
	  return  categoryJpaRepository.save(grocery); 
	  }
  
  @Override public Category findById(int id) {
	  Optional<Category> result =  categoryJpaRepository.findById(id);
  
	  Category category = null; 
	  if(result.isPresent()) {
		 category=result.get(); 
	  }
	  else {
	  throw new CategoryNotFoundException("Category not found with ID "+id);
	  } 
	  return category;
  
  
  }
  
  @Override public List<Category> findAll() { return
  categoryJpaRepository.findAll(); }
  
  @Override public void deleteById(int id) {
  categoryJpaRepository.deleteById(id);
  
  }
  
  @Override public void deleteAllGrocceries() {
  categoryJpaRepository.deleteAll(); }
  
  
/*
 * 
 * @Override public List<Category> findAll() { return categoryDao.findAll(); }
 * 
 * 
 * @Override public Category findById(int id) { return categoryDao.findById(id);
 * }
 * 
 * @Override public List<Category> findByName(String name) { return
 * categoryDao.findByName(name);
 * 
 * }
 * 
 * @Override
 * 
 * @Transactional public Category save(Category category) { return
 * categoryDao.save(category);
 * 
 * }
 * 
 * 
 * @Override
 * 
 * @Transactional public void deleteById(int id) { categoryDao.deleteById(id);
 * 
 * }
 * 
 * 
 * @Override
 * 
 * @Transactional public int deleteAllGrocceries() { return
 * categoryDao.deleteAllGrocceries(); }
 * 
 */
  }
 

