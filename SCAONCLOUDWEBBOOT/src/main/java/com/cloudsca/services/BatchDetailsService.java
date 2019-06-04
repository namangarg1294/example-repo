package com.cloudsca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cloudsca.dao.BatchDao;
import com.cloudsca.model.BatchDetails;
import com.cloudsca.model.CourseDetails;
import com.cloudsca.repos.BatchDetailsRepository;
import com.cloudsca.repos.CourseDetailsRepository;

@Service
public class BatchDetailsService {
@Autowired
private BatchDetailsRepository batchDetailsRepository;
@Autowired
private CourseDetailsRepository courseDetailsRepository;
@Autowired
private BatchDao bd;
public List<BatchDetails> getAllBatches(){
	List<BatchDetails>list=new ArrayList<>();
	batchDetailsRepository.findAll().forEach(list::add);
	if("yo".equals(new String("yo")))
		throw new RuntimeException("No");
	return list;
}
public BatchDetails getBatchById(String id){
	
	return bd.getBatchById(id);
	
}

@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public void insertBatchCourse(){
	
BatchDetails bd=new BatchDetails();
bd.setBatchId("xyz");
bd.setCentreId(1);
bd.setDays("MWF");
bd.setIs_active("1");
bd.setStarting_date("12-12-12");
bd.setTime("4:00");
CourseDetails cd=new CourseDetails();
cd.setCourseFee(5000);
cd.setCourseId(1000);
cd.setCourseName("Hawa me");
cd.setNoOfLectures(50);
try {
courseDetailsRepository.save(cd);}
catch(Exception e) {
	
}
try {
batchDetailsRepository.save(bd);}
catch(Exception e) {
	
}

}

	/*
	 * public List<BatchDetails> getBatchByCourseId(int x){
	 * 
	 * return batchDetailsRepository.findAllbatchesByCourseId(x);
	 * 
	 * }
	 */


}
