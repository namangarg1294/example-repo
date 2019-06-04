package com.cloudsca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class StudentDetails {
	public StudentDetails(String studentContactNumber, String studentName, String email) {
		super();
		this.studentContactNumber = studentContactNumber;
		this.studentName = studentName;
		this.email = email;
	}

	public StudentDetails() {
		
	}

	public String getStudentContactNumber() {
		return studentContactNumber;
	}

	public void setStudentContactNumber(String studentContactNumber) {
		this.studentContactNumber = studentContactNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
	@Column(name="student_contact_no")
	String studentContactNumber;
	
	@Column(name="student_name")
	String studentName;
	
	@Column(name="student_email_id")
	String email;

}
