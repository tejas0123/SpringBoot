package com.example.demo.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cars;
import com.example.demo.service.CarService;

@RestController
@EnableCaching
public class CarController 
{
	@Autowired
	CarService service;

	@PostMapping("/addCar")
	public Cars addCar(@RequestBody Cars car)
	{
		System.out.println(car.getModel());
		return service.insertNewCar(car);
	}
	
	@GetMapping("/allCars")
	@Cacheable(value = "Cars")
	public List<Cars> getAllCars()
	{
		return service.fetchAllCars();
	}
	
	@GetMapping("/carByName/{name}")
	@Cacheable(value = "Cars")
	public Cars getCarByName(@PathVariable String name)
	{
		return service.fetchCarByName(name);
	}
}
