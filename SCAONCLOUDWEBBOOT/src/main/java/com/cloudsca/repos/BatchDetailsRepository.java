package com.cloudsca.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cloudsca.model.BatchDetails;


public interface BatchDetailsRepository extends CrudRepository<BatchDetails,String> {

	@Transactional(propagation = Propagation.REQUIRED)
	 <S extends BatchDetails> S save(S entity);
		
//	@Query(value="SELECT * FROM batch_details b WHERE b.course_id =?1", nativeQuery = true)
//	List<BatchDetails> findAllbatchesByCourseId(int x);
	
}
