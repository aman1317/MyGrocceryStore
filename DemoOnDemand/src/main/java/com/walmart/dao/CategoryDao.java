

  package com.walmart.dao;
  
  import java.util.List;
  
  import com.walmart.entity.inventory.Category;
  
  /*
   * We dont Need this anymore, if we are using the sping-data-jpa, as it will
   * read all the JPA repository written in project and give basics CRUD functions
   * for all
   */


  public interface CategoryDao {
  
  
  public Category save(Category grocery);
  
  public Category findById(int id); public List<Category> findByName(String
  name); public List<Category> findAll();
  
  public void deleteById(int id); public int deleteAllGrocceries();
  
  
  
  
  
  
  
  
  }
 

