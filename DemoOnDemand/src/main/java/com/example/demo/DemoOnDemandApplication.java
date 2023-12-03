package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.CategoryDao;
import com.example.demo.entity.Category;

@SpringBootApplication
public class DemoOnDemandApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOnDemandApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandlineRunner( CategoryDao categorydao) {
		return runner-> {
			createCategory(categorydao);
		
		};
	}

	private void createCategory(CategoryDao categorydao) {
		
		Category category = new Category("chocolate","Sweeeeeets");
		categorydao.save(category);
		System.out.println("Category created with ID "+ category.getCategoryId());
		Category savedCategory = categorydao.findById(category.getCategoryId());
		System.out.println("Category found with ID "+ savedCategory.getCategoryId()+ "saved category is " +savedCategory);
		
		List<Category> allCategoriesSaved = categorydao.findAll();
		System.out.println("all categories saved are "+allCategoriesSaved);
		
		List<Category> allCategoriesbyName = categorydao.findByName("chocolate");
		System.out.println("all categories found by name are "+ allCategoriesbyName);
		
		
		
		
		
	}
}
