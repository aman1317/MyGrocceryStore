package com.walmart.entity.orders;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {
	
	
	@Id
	@Column(name="invoice_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int invoiceId;

	
	@Column(name="order_id")
	private int orderID;
	

	@Column(name="total_amount")
	private int totalAmount;

	
	@Column(name="reserved_quantity")
	private int reservedQty;
	
	@Column(name="date_last_updated")
	private long dateLastUpdated;
	
	//billing_address


	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice(int orderID, int totalAmount, int reservedQty, long date_last_updated) {
		super();
		this.orderID = orderID;
		this.totalAmount = totalAmount;
		this.reservedQty = reservedQty;
		this.dateLastUpdated = date_last_updated;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getReservedQty() {
		return reservedQty;
	}

	public void setReservedQty(int reservedQty) {
		this.reservedQty = reservedQty;
	}

	public long getDate_last_updated() {
		return dateLastUpdated;
	}

	public void setDate_last_updated(long date_last_updated) {
		this.dateLastUpdated = date_last_updated;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", orderID=" + orderID + ", totalAmount=" + totalAmount
				+ ", reservedQty=" + reservedQty + ", date_last_updated=" + dateLastUpdated + "]";
	}
	
	
	
	
	
	
}
