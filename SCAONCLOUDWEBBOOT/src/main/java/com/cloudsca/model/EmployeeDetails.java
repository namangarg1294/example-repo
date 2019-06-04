package com.cloudsca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class EmployeeDetails {

	@Id
	@Column(name="emp_id")
	int empId;
	@Column(name="emp_name")
	String empName;
	@Column(name="emp_phone_no")
	String empPhno;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPhno() {
		return empPhno;
	}
	public void setEmpPhno(String empPhno) {
		this.empPhno = empPhno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	String password;
	String role;
	
	
}
