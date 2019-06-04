package com.cloudsca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudsca.model.BatchDetails;
import com.cloudsca.model.CourseDetails;
import com.cloudsca.repos.CourseDetailsRepository;

@Service
public class CourseDetailsService {
	@Autowired
	private CourseDetailsRepository courseDetailsRepository;
	
	public List<CourseDetails> getAllCourses(){
		List<CourseDetails>list=new ArrayList<>();
		courseDetailsRepository.findAll().forEach(list::add);
		return list;
	}
	

}
