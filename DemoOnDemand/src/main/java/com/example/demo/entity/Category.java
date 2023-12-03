package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
@Id
@Column(name="category_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int categoryId;

@Column(name="category_name")
private String categoryName;

@Column(name="category_desc")
private String categoryDesc;




public Category() {
	super();
}



public Category(String categoryName, String categoryDesc) {
	super();
	this.categoryName = categoryName;
	this.categoryDesc = categoryDesc;
}



public int getCategoryId() {
	return categoryId;
}

public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}

public String getCategoryName() {
	return categoryName;
}

public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}

public String getCategoryDesc() {
	return categoryDesc;
}

public void setCategoryDesc(String categoryDesc) {
	this.categoryDesc = categoryDesc;
}

@Override
public String toString() {
	return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDesc=" + categoryDesc
			+ "]";
}

	
	

}
