package com.cloudsca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudsca.model.StudentDetails;
import com.cloudsca.repos.StudentDetailsRepository;

@Service
public class StudentDetailsService {

	@Autowired
	private StudentDetailsRepository studentDetailsRepository;
	
	public List<StudentDetails> getAllStudents(){
		List<StudentDetails>list=new ArrayList<>();
		 studentDetailsRepository.findAll().forEach(list::add);
		 return list;
	}
	
	
}
