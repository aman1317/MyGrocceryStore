package com.walmart.entity.inventory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {


	
@Id
@Column(name="product_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int productId;

@Column(name="product_name")
private String productName;

@Column(name="product_desc")
private String productDesc;


@Column(name="product_price")
private String productPrice;


@Column(name="category_id")
private String categoryId;


public Product(String productName, String productDesc, String productPrice, String categoryId) {
	super();
	this.productName = productName;
	this.productDesc = productDesc;
	this.productPrice = productPrice;
	this.categoryId = categoryId;
}


public Product() {
	super();
	// TODO Auto-generated constructor stub
}


public int getProductId() {
	return productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}


public String getProductName() {
	return productName;
}


public void setProductName(String productName) {
	this.productName = productName;
}


public String getProductDesc() {
	return productDesc;
}


public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}


public String getProductPrice() {
	return productPrice;
}


public void setProductPrice(String productPrice) {
	this.productPrice = productPrice;
}


public String getCategoryId() {
	return categoryId;
}


public void setCategoryId(String categoryId) {
	this.categoryId = categoryId;
}


@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
			+ ", productPrice=" + productPrice + ", categoryId=" + categoryId + "]";
}





}
