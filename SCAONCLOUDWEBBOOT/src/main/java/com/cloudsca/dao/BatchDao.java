package com.cloudsca.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cloudsca.model.BatchDetails;

@Repository
public class BatchDao {

  @PersistenceContext	
  private EntityManager em;
  
  public BatchDetails getBatchById(String id) {
	  
	  return em.find(BatchDetails.class, id);
  }
  
}
