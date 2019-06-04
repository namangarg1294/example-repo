package com.cloudsca.repos;

import org.springframework.data.repository.CrudRepository;

import com.cloudsca.model.StudentDetails;

public interface StudentDetailsRepository extends CrudRepository<StudentDetails, String> {

}
