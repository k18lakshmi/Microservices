package com.tcs.foodapplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity Bean Class - A Bean Class representing Database Table
//Bean Class

@Entity
@Table(name = "food_item")
public class FoodItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id")
	private int id;
	
	private String name;
	private String category;
	private int price;
	
	@Column(name = "date_added_on")
	private String date;
	
	private int status;
	
	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItem(int id, String name, String category, int price, String date, int status) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.date = date;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FoodItem [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", status="
				+ status + "]";
	}
	
}
