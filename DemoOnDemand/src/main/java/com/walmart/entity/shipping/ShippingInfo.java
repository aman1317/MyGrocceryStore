package com.walmart.entity.shipping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shippinginfo")
public class ShippingInfo {
	
@Id
@Column(name="shipping_info_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int shippingInfoId;
		
		@Column(name="order_id")
		private int orderID;
		
		@Column(name="tracking_number")
		private int trackingNumber;
		
		@Column(name="shipping_date")
		private long shippingDate;
		//shipping_address

		public ShippingInfo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ShippingInfo(int orderID, int trackingNumber, long shippingDate) {
			super();
			this.orderID = orderID;
			this.trackingNumber = trackingNumber;
			this.shippingDate = shippingDate;
		}
		public int getShippingInfoId() {
			return shippingInfoId;
		}
		public void setShippingInfoId(int shippingInfoId) {
			this.shippingInfoId = shippingInfoId;
		}
		public int getOrderID() {
			return orderID;
		}
		public void setOrderID(int orderID) {
			this.orderID = orderID;
		}
		public int getTrackingNumber() {
			return trackingNumber;
		}
		public void setTrackingNumber(int trackingNumber) {
			this.trackingNumber = trackingNumber;
		}
		public long getShippingDate() {
			return shippingDate;
		}
		public void setShippingDate(long shippingDate) {
			this.shippingDate = shippingDate;
		}
		@Override
		public String toString() {
			return "ShippingInfo [shippingInfoId=" + shippingInfoId + ", orderID=" + orderID + ", trackingNumber="
					+ trackingNumber + ", shippingDate=" + shippingDate + "]";
		}
		
}
