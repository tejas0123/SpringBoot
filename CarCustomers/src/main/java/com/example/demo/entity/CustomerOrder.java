package com.example.demo.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Orders")
public class CustomerOrder implements Serializable{
	@Id
	private String id;
	private String custName;
	private String item;
	private int quantity;
	private float amount;
	private float balance;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public CustomerOrder(String id, String custName, String item, int quantity, float amount) {
		super();
		this.id = id;
		this.custName = custName;
		this.item = item;
		this.quantity = quantity;
		this.amount = amount;
	}
	
	public CustomerOrder()
	{
		
	}
	
	public CustomerOrder(String id, String custName, String item, int quantity, float amount, float balance) {
		super();
		this.id = id;
		this.custName = custName;
		this.item = item;
		this.quantity = quantity;
		this.amount = amount;
		this.balance = balance;
	}
}
	
	
	
	