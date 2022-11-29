package com.example.demo.kafkaListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


import com.example.demo.entity.CustomerOrder;
import com.example.demo.repository.CustomerRepository;

@Component
public class KafkaConsumer {

	
	@Autowired CustomerRepository repository;
	
	@KafkaListener(topics = "topic", groupId = "group_id", containerFactory="customerOrderListener")
	public void consume(CustomerOrder order)
	{
		System.out.println("Order Id: "+order.getId());
		System.out.println("Customer Name: "+order.getCustName());
		System.out.println("Car name: "+order.getItem());
		System.out.println("Quantity: "+order.getQuantity());
		System.out.println("Final Amount: "+order.getAmount());
		System.out.println("Balance :"+order.getBalance());
		System.out.println("Order Received");
		repository.save(order);
		System.out.println("Order Saved");
	}
}
