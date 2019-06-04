package com.cloudsca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="batch_details")
public class BatchDetails {
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
//	public EmployeeDetails getFaculty() {
//		return faculty;
//	}
//	public void setFaculty(EmployeeDetails faculty) {
//		this.faculty = faculty;
//	}
//	public CourseDetails getCourse() {
//		return course;
//	}
//	public void setCourse(CourseDetails course) {
//		this.course = course;
//	}
	public int getCentreId() {
		return centreId;
	}
	public void setCentreId(int centreId) {
		this.centreId = centreId;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStarting_date() {
		return starting_date;
	}
	public void setStarting_date(String starting_date) {
		this.starting_date = starting_date;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	@Id
	@Column(name="batch_id")
	String batchId;
     
//	@ManyToOne
//	@JoinColumn(name="faculty_id")
//	EmployeeDetails faculty;
//	@ManyToOne
//	@JoinColumn(name="course_id")
//	@JsonManagedReference
//	CourseDetails course;
	@Column(name="centre_id")
	int centreId;
	String days;
	String time;
	String starting_date;
	String is_active;
			
	
}
