package com.walmart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="reviews")
public class Reviews {
	
@Id
@Column(name="review_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int reviewId;

		
		@Column(name="product_id")
		private int productID;
		

		@Column(name="user_id")
		private int userId;

		
		@Column(name="rating")
		private int rating;
		
		@Column(name="comment")
		private String comment;

		public Reviews() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Reviews(int productID, int userId, int rating, String comment) {
			super();
			this.productID = productID;
			this.userId = userId;
			this.rating = rating;
			this.comment = comment;
		}

		public int getReviewId() {
			return reviewId;
		}

		public void setReviewId(int reviewId) {
			this.reviewId = reviewId;
		}

		public int getProductID() {
			return productID;
		}

		public void setProductID(int productID) {
			this.productID = productID;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		@Override
		public String toString() {
			return "Reviews [reviewId=" + reviewId + ", productID=" + productID + ", userId=" + userId + ", rating="
					+ rating + ", comment=" + comment + "]";
		}
	
	
}
