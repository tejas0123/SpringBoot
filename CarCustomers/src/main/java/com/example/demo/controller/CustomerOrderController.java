package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Cars;

import com.example.demo.entity.CustomerOrder;
import com.example.demo.service.CustomerOrderService;

@RestController
@EnableCaching
public class CustomerOrderController {

	@Autowired
	CustomerOrderService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/newOrder")
	public CustomerOrder orderItem(@RequestBody  CustomerOrder order)
	{
		String name = order.getItem();
		System.out.println(name);
		Cars car = restTemplate.getForObject("http://localhost:7000/carByName/"+name, Cars.class);
		System.out.println(car.Model);
		System.out.println(car.Brand);
		System.out.println(car.name);
		System.out.println(car.price);
		order.setAmount(car.price * order.getQuantity());
		order.setBalance(order.getAmount());
		return service.placeOrder(order);
	}
	
	@GetMapping("/allOrders")
	@Cacheable(value = "CustomerOrder")
	public List<CustomerOrder> fetchAllOrders()
	{
		return service.getAllOrders();
	}
	
	@GetMapping("/ordersByCustomer/{custName}")
	@Cacheable(value = "CustomerOrder")
	public List<CustomerOrder> getOrdersByCustomerName(@PathVariable String custName)
	{
		return service.fetchOrdersBycustName(custName);
	}
	
	
	
}
