package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Category;

public interface CategoryDao {
	public void save (Category category);
	public Category findById(Integer id);
	public List<Category> findAll();
	public List<Category> findByName(String name);
	public void update(Category category);
	public void deleteById(Integer id);
	public int deleteAllCategories();
	
	
	
	

}
