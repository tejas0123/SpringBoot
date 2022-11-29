package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerOrder;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	
	@Autowired
	CustomerRepository repository;

	public Iterable<CustomerOrder> fetchAllOrders() {
		return repository.findAll();
		
	}

	
	
	
}
