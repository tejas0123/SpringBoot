package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Cars;

public interface CarInterface extends MongoRepository<Cars, Integer>{

	Cars findByName(String name);

}
