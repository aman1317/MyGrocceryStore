package com.walmart.entity.inventory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
	@Column(name="inventory_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int inventoryId;

	
	@Column(name="product_id")
	private int productID;
	

	@Column(name="available_quantity")
	private int availableQty;

	
	@Column(name="reserved_quantity")
	private int reservedQty;
	
	@Column(name="date_last_updated")
	private long date_last_updated;

	public Inventory(int productID, int availableQty, int reservedQty, long date_last_updated) {
		super();
		this.productID = productID;
		this.availableQty = availableQty;
		this.reservedQty = reservedQty;
		this.date_last_updated = date_last_updated;
	}

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getAvailableQty() {
		return availableQty;
	}

	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}

	public int getReservedQty() {
		return reservedQty;
	}

	public void setReservedQty(int reservedQty) {
		this.reservedQty = reservedQty;
	}

	public long getDate_last_updated() {
		return date_last_updated;
	}

	public void setDate_last_updated(long date_last_updated) {
		this.date_last_updated = date_last_updated;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", productID=" + productID + ", availableQty=" + availableQty
				+ ", reservedQty=" + reservedQty + ", date_last_updated=" + date_last_updated + "]";
	}


}
