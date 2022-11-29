package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerOrder;
import com.example.demo.repository.CustomerOrderRepository;



@Service
public class CustomerOrderService {
	
	@Autowired
	CustomerOrderRepository repository;
	
	@Autowired
	KafkaTemplate<String, CustomerOrder> kafkaTemplate;
	
	private static final String topic = "topic";
	


	public CustomerOrder placeOrder(CustomerOrder order) {
		
		kafkaTemplate.send(topic, order);
		return repository.save(order);
	}

	public List<CustomerOrder> getAllOrders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}



	public List<CustomerOrder> fetchOrdersBycustName(String custName) {
		// TODO Auto-generated method stub
		return  repository.findBycustName(custName);
	}

}
