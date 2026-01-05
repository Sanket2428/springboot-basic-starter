package com.lectures.SampleProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Categories")
public class Category {
	@Id //primary key 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryID;
	public Category() {
		super();
	}
	private String categoryName;
	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	public Long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
	}
	
	
}
