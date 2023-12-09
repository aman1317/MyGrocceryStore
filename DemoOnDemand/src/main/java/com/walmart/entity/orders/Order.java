package com.walmart.entity.orders;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "order")
public class Order {


	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)	
@Column(name="order_id")
private int orderId;

@Column(name="user_id")
private int userId;

@Column(name="order_date")
private Long orderDate;

@Column(name="order_status")
private int orderStatus;

@Column(name="total_amount")
private int totalAmount;

public Order(int userId, Long orderDate, int orderStatus, int totalAmount) {
	super();
	this.userId = userId;
	this.orderDate = orderDate;
	this.orderStatus = orderStatus;
	this.totalAmount = totalAmount;
}

public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public Long getOrderDate() {
	return orderDate;
}

public void setOrderDate(Long orderDate) {
	this.orderDate = orderDate;
}

public int getOrderStatus() {
	return orderStatus;
}

public void setOrderStatus(int orderStatus) {
	this.orderStatus = orderStatus;
}

public int getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", userId=" + userId + ", orderDate=" + orderDate + ", orderStatus="
			+ orderStatus + ", totalAmount=" + totalAmount + "]";
}









}
