package com.cloudsca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsca.model.StudentDetails;
import com.cloudsca.services.StudentDetailsService;

@RestController
public class StudentDetailsController {
	@Autowired
	private StudentDetailsService studentDetailsService;
	
	@RequestMapping("/students")
	public List<StudentDetails> getAll(){
		return studentDetailsService.getAllStudents();
	}

}
