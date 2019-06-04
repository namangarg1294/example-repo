package com.cloudsca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_transaction")
public class StudentTransaction {

  @Id
  @Column(name="transaction_id")
  String TransactionId;
  
  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="student_id")
  StudentDetails studentDetails;
  
  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="employee_id")
  EmployeeDetails employeeDetails;
  
  @OneToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="batch_id")
  BatchDetails batchDetails;
  
  @Column(name="centre_id")
  int centreId;
  @Column(name="gross_amount")
  int grossAmount;
  @Column(name="date_of_payement")
  String date;
public String getTransactionId() {
	return TransactionId;
}
public void setTransactionId(String transactionId) {
	TransactionId = transactionId;
}
public StudentDetails getStudentDetails() {
	return studentDetails;
}
public void setStudentDetails(StudentDetails studentDetails) {
	this.studentDetails = studentDetails;
}
public EmployeeDetails getEmployeeDetails() {
	return employeeDetails;
}
public void setEmployeeDetails(EmployeeDetails employeeDetails) {
	this.employeeDetails = employeeDetails;
}
public BatchDetails getBatchDetails() {
	return batchDetails;
}
public void setBatchDetails(BatchDetails batchDetails) {
	this.batchDetails = batchDetails;
}
public int getCentreId() {
	return centreId;
}
public void setCentreId(int centreId) {
	this.centreId = centreId;
}
public int getGrossAmount() {
	return grossAmount;
}
public void setGrossAmount(int grossAmount) {
	this.grossAmount = grossAmount;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
	
	
}
