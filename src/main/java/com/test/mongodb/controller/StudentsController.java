package com.test.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.mongodb.model.Students;
import com.test.mongodb.repository.StudentsRepository;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	private StudentsRepository studentRepository;
	
	
	@GetMapping("/")
	public List<Students> getAllStudents(){
		return studentRepository.findAll();
	}
	
	

}
