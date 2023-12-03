package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Category;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
public class CategoryDaoImplementation implements CategoryDao{

	private EntityManager entitymanager;
	
	@Autowired
	CategoryDaoImplementation(EntityManager entitymanager){
		this.entitymanager=entitymanager;
	}
	
	
	@Override
	@Transactional
	public void save(Category category) {
		  try {
	            System.out.println("aman here before persist");
	            entitymanager.persist(category);
	            System.out.println("aman here after persist");
	        } catch (Exception e) {
	            e.printStackTrace(); // Log or handle the exception appropriately
	        }		
		
		
		
		
	}


	@Override
	public Category findById(Integer id) {
		  try {
	            return entitymanager.find(Category.class,id);
	        } catch (Exception e) {
	            e.printStackTrace(); // Log or handle the exception appropriately
	        }
		return null;		
	}


	@Override
	public List<Category> findAll() {
		  try {
	          TypedQuery<Category> theQuery=entitymanager.createQuery("from Category",Category.class);
	          return theQuery.getResultList();
	        } catch (Exception e) {
	            e.printStackTrace(); // Log or handle the exception appropriately
	        }
		return null;	
	}


	@Override
	public List<Category> findByName(String categoryName) {
		  try {
	          TypedQuery<Category> theQuery=entitymanager.createQuery("from Category where categoryName=:theCategoryName",Category.class);
	         theQuery.setParameter("theCategoryName", categoryName);
	          
	          return theQuery.getResultList();
	        } catch (Exception e) {
	            e.printStackTrace(); // Log or handle the exception appropriately
	        }
		return null;	
	}


	@Override
	@Transactional
	public void update(Category category) {
		entitymanager.merge(category);
		
		
	}


	@Override
	@Transactional
	public void deleteById(Integer id) {
		Category category = findById(id);
		entitymanager.remove(category);

	}


	@Override
	@Transactional
	public int deleteAllCategories() {
	           int numberOfRowsDeleted = entitymanager.createQuery("delete from Category").executeUpdate();
	          return numberOfRowsDeleted;
	}

}
