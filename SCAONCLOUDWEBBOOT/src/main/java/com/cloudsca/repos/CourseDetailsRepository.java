package com.cloudsca.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cloudsca.model.CourseDetails;

public interface CourseDetailsRepository extends CrudRepository<CourseDetails, Integer> {

	@Transactional(propagation = Propagation.REQUIRED)
	<S extends CourseDetails> S save(S entity);
	

	
	
}
