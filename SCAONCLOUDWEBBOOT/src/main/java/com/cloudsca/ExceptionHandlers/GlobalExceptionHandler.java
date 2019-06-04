package com.cloudsca.ExceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cloudsca.model.CourseDetails;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<CourseDetails> handling(){
		return new ResponseEntity<CourseDetails>(new CourseDetails(1,"Error Accoured"),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
