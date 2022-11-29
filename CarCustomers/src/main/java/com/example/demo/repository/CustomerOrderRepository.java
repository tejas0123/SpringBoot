package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.CustomerOrder;


public interface CustomerOrderRepository extends MongoRepository<CustomerOrder, String>{


	List<CustomerOrder> findBycustName(String custName);
	

}
