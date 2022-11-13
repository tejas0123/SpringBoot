package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Product;
import com.example.demo.entity.CustomerOrder;
import com.example.demo.service.CustomerOrderService;

@RestController
public class CustomerOrderController {

	@Autowired
	CustomerOrderService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/newOrder")
	public CustomerOrder orderItem(@RequestBody  CustomerOrder order)
	{
		String productName = order.getItem();
		Product product = restTemplate.getForObject("http://localhost:9000/productByName/"+productName, Product.class);
		order.setAmount((float) product.price * order.getQuantity());
		return service.placeOrder(order);
	}
	
	@GetMapping("/allOrders")
	public List<CustomerOrder> fetchAllOrders()
	{
		return service.getAllOrders();
	}
	
	
}
