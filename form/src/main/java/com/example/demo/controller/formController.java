package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.StudentRepo;
import com.example.demo.entity.Student;

@RestController
public class formController {
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public ModelAndView form()
	{
		ModelAndView mav = new ModelAndView("form");
		return mav;
	}
	
	@RequestMapping("/addStudent")
	public ModelAndView addStudent(Student stud)
	{ 
		repo.save(stud);
		ModelAndView mv = new ModelAndView("registered");
		mv.addObject("obj", stud);
		
		return mv;
	}
	
	@GetMapping("/findStudentByName/{name}")
	public Student findByName(@PathVariable String name)
	{
		return repo.findByName(name);
	}
	
	@GetMapping("/findStudentById/{id}")
	public Student findStudentById(@PathVariable int id)
	{
		return repo.findById(id).orElse(null);
	}
	
	@GetMapping("/findAll")
	public List<Student> findAll()
	{
		return repo.findAll();
	}
	

	@GetMapping("/findStudentByUSN/{USN}")
	public Student findStudentById(@PathVariable String USN)
	{
		return repo.findByUSN(USN).orElse(null);
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public Boolean deleteStudentById(@PathVariable int id)
	{
		repo.deleteById(id);
		return true;
		
	}
	
}
