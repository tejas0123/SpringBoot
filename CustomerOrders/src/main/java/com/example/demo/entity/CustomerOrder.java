package com.example.demo.entity;
import javax.persistence.*;
@Entity
@Table
public class CustomerOrder {
	
	@Id
	@GeneratedValue
	private int id;

	@Column
	private String cust_Name;
	
	@Column
	private String item;
	
	@Column
	private int quantity;

	@Column
	private float amount;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public CustomerOrder(int id, String cust_Name, String item, int quantity, float amount) {
		super();
		this.id = id;
		this.cust_Name = cust_Name;
		this.item = item;
		this.quantity = quantity;
		this.amount = amount;
	}
	
	public CustomerOrder()
	{
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	
	
}
