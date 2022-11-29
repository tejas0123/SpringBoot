package com.example.demo.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerOrder;

import com.example.demo.service.CustomerService;

@RestController
public class CustomerController 
{
	
	@Autowired
	CustomerService service;

	@GetMapping("/getAllOrders")
	public List<CustomerOrder> getAllUsers()
	{
		Iterable<CustomerOrder> it = service.fetchAllOrders();
		List<CustomerOrder> list = new ArrayList<CustomerOrder>();
		for(CustomerOrder cust : it)
		{
			list.add(cust);
		}
		return list;
	}
}
