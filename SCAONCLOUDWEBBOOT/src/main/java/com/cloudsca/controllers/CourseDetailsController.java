package com.cloudsca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsca.model.CourseDetails;
import com.cloudsca.services.CourseDetailsService;

@RestController
public class CourseDetailsController {

@Autowired
private CourseDetailsService courseDetailsService;

@RequestMapping("/courses")
public List<CourseDetails> getAllCourses(){
	return courseDetailsService.getAllCourses();
}
}
