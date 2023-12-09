  package com.walmart.dao;
  
  import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Repository;
  
  import com.walmart.common.exceptions.CategoryNotFoundException; import
  com.walmart.entity.inventory.Category;
  
  import jakarta.persistence.EntityManager; import
  jakarta.persistence.TypedQuery;
  
  
  /*
   * We dont Need this anymore, if we are using the sping-data-jpa, as it will
   * read all the JPA repository written in project and give basics CRUD functions
   * for all
   */
  
  @Repository public class CategoryDaoImplementation implements CategoryDao{
  
  private EntityManager entitymanager;
  
  @Autowired CategoryDaoImplementation(EntityManager entitymanager){
  this.entitymanager=entitymanager; }
  
  
  @Override public Category save(Category category) { return
  entitymanager.merge(category);
  
  }
  
  @Override public Category findById(int id) { return
  entitymanager.find(Category.class,id);
  
  }
  
  @Override public List<Category> findByName(String categoryName) {
  
  TypedQuery<Category> theQuery=entitymanager. createQuery("from Category where categoryName=:theCategoryName",Category.class); 
  theQuery.setParameter("theCategoryName", categoryName);
  return  theQuery.getResultList(); }
  
  @Override public List<Category> findAll() { 
  TypedQuery<Category>  theQuery=entitymanager.createQuery("from Category",Category.class);
  List<Category> listOfCategory = theQuery.getResultList(); return
  listOfCategory;
  
  }
  
  
  @Override public void deleteById(int id) { Category category = findById(id);
  if(null==category) { 
	  throw new CategoryNotFoundException("Invalid Category ID to delete "+id); 
	}
  entitymanager.remove(category);
  
  }
  
  
  @Override public int deleteAllGrocceries() {
	  int numberOfRowsDeleted =  entitymanager.createQuery("delete from Category").executeUpdate();
	  return  numberOfRowsDeleted; 
  }
  }
 

