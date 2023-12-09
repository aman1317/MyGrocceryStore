package com.walmart.entity.inventory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="category")
public class Category {
	
@Id
@Column(name="category_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int categoryId;

@Column(name="category_name")
@NotNull(message="is required")
@Size(min=1, message="is required")
private String categoryName;


@Column(name="category_desc")
@Pattern(regexp = "^[a-zA-Z0-9]{25}", message="only 5 chars/digits")
//@CategoryDesc
//@CategoryDesc(value="TOPS", message="Must start with TOPS")
private String categoryDesc;


/*
 * we can use the following validation to any int value , if we are expecting
 * from user to validate int value entered/chosen by user
 * 
 * @Min(value=0, message="must be greater than or equal to zero")
 * 
 * @Max(value=10, message="must be less than or equal to 10")
 * 
 */


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
