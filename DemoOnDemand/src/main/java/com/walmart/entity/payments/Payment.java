package com.walmart.entity.payments;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {
	
	@Id
	@Column(name="transaction_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionId;

	
	@Column(name="order_id")
	private int orderID;
	

	@Column(name="transaction_amount")
	private int transactionAmount;

	
	@Column(name="reserved_quantity")
	private int reservedQty;
	
	@Column(name="transaction_date")
	private long transactionDate;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int orderID, int transactionAmount, int reservedQty, long transactionDate) {
		super();
		this.orderID = orderID;
		this.transactionAmount = transactionAmount;
		this.reservedQty = reservedQty;
		this.transactionDate = transactionDate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public int getReservedQty() {
		return reservedQty;
	}

	public void setReservedQty(int reservedQty) {
		this.reservedQty = reservedQty;
	}

	public long getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(long transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "Payment [transactionId=" + transactionId + ", orderID=" + orderID + ", transactionAmount="
				+ transactionAmount + ", reservedQty=" + reservedQty + ", transactionDate=" + transactionDate + "]";
	}
	
	
	
}
