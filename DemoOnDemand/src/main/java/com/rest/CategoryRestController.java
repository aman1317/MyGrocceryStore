
  package com.rest;
  
  import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.bind.annotation.DeleteMapping;
import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.PathVariable;
import  org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.PutMapping;
import  org.springframework.web.bind.annotation.RequestBody;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RestController;

import com.walmart.common.exceptions.CategoryNotFoundException;
import  com.walmart.entity.inventory.Category;
import  com.walmart.service.CategoryService;
  
	/*  We dont Need this anymore, if we are using the sping-data-rest, as it will
	  read all the JPA repository written in project and give basics CRUD functions
	  for all
	*/ 

  @RestController
  
  @RequestMapping("/walmart") public class CategoryRestController {
  
  private CategoryService  categoryService;
  
  
  @Autowired CategoryRestController(CategoryService categoryService) {
  this.categoryService=categoryService; 
  }
  
  
  
  @GetMapping("/categories") public List<Category> getCategories() {
  return categoryService.findAll(); 
  }
  
  
  @GetMapping("/categories/{categoryId}") public Category getCategory(@PathVariable int categoryId) {
  
  Category category = categoryService.findById(categoryId);
  
  if(null==category) { throw new
  CategoryNotFoundException("Category not found with ID "+categoryId); } return
  category;
  
  
  }
  
  @PostMapping("/categories") public Category saveCategory(@RequestBody  Category category) {
  
  category.setCategoryId(0);
	/*
	 * In case they pass id in JSON .. set it to 0, this is to force a save of new
	 * item..instead of update
	 */
  Category savedCategory =  categoryService.save(category);
  
  return savedCategory;
  
  
  }
  
  @PutMapping("/categories") public Category updateCategory(@RequestBody  Category category) {
	  Category savedCategory = categoryService.save(category);
	  return savedCategory; 
  }
  
  @DeleteMapping("/categories/{categoryId}") public String  deleteCategory(@PathVariable int categoryId) {
  categoryService.deleteById(categoryId);
  return  "Category Deleted with category Id "+ categoryId; 
  }
  
  
  
  
  
  
  }
 