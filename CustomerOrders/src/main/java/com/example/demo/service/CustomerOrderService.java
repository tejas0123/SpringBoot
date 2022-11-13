package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.CustomerOrder;
import com.example.demo.repository.CustomerOrderRepository;

@Service
public class CustomerOrderService {

	@Autowired
	private CustomerOrderRepository repository;
	
	
	
	public CustomerOrder placeOrder(CustomerOrder order)
	{
		return repository.save(order);
	}
	
	public List<CustomerOrder> getAllOrders()
	{
		return repository.findAll();
	}
	
	
}
