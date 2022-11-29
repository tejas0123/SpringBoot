package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cars;
import com.example.demo.repository.CarInterface;

@Service
public class CarService 
{
	@Autowired
	CarInterface repository;

	public Cars insertNewCar(Cars car) {
		return repository.insert(car);
	}

	public List<Cars> fetchAllCars() {
		return repository.findAll();
	}

	public Cars fetchCarByName(String name) {
		return repository.findByName(name);
	}
	
}
