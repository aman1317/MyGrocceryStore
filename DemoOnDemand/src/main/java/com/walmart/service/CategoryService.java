/*
 * We dont Need this anymore, if we are using the sping-data-rest, as it will
 * read all the JPA repository written in project and give basics CRUD functions
 * for all
 */


  package com.walmart.service;
  
  import java.util.List;
  
  import com.walmart.entity.inventory.Category;
  
  public interface CategoryService {
  
  public Category save(Category grocery);
  
  public Category findById(int id); public List<Category> findAll();
  
  public void deleteById(int id); public void deleteAllGrocceries();
  
  
  }
 

