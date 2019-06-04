package com.cloudsca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsca.model.BatchDetails;
import com.cloudsca.services.BatchDetailsService;
@RestController
public class BatchDetailsController {
@Autowired
private BatchDetailsService batchDetailsService;
@RequestMapping("/batches")
public List<BatchDetails> getAll(){
	return batchDetailsService.getAllBatches();
}
@RequestMapping(value="/batches/{id}")
public BatchDetails getBatchById(@PathVariable String id) {
	
	return batchDetailsService.getBatchById(id);
}
//@RequestMapping("/batches/courses/{x}")
//public List<BatchDetails> getBatchByCourseId(@PathVariable int x)  {
//	
//	return batchDetailsService.getBatchByCourseId(x);
//}
@RequestMapping("/batches/yo")
public void getBatchById() {
	
	batchDetailsService.insertBatchCourse();
}
}
