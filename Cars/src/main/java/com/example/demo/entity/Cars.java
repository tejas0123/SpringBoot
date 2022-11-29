package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cars")
public class Cars implements Serializable
{
	@Id
	private String id;
	private String name;
	private String Model;
	private int Year_launched;
	private int price;
	private String Category;
	private String Brand;
	
	public Cars(String id, String name, String model, int year_launched, int price, String category, String brand) {
		super();
		this.id = id;
		this.name = name;
		Model = model;
		Year_launched = year_launched;
		this.price = price;
		Category = category;
		Brand = brand;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getYear_launched() {
		return Year_launched;
	}
	public void setYear_launched(int year_launched) {
		Year_launched = year_launched;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}

	public Cars()
	{
		
	}
}
