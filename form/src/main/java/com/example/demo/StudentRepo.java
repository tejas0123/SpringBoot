package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

	Student findByName(String name);

	Optional<Student> findByUSN(String uSN);
	
}
