package com.cloudsca.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="course_details")
public class CourseDetails {

	@Id
	@Column(name="course_id")
	int courseId;
	@Column(name="course_name")
	String courseName;
	@Column(name="no_of_lectures")
	int noOfLectures;
	@Column(name="course_fee")
	int courseFee;
//	@OneToMany(mappedBy="course")
//	@JsonBackReference
//	List<BatchDetails> batches=new ArrayList<>();
//	public List<BatchDetails> getBatches() {
//		return batches;
//	}
//	public void setBatches(List<BatchDetails> batches) {
//		this.batches = batches;
//	}
	public int getCourseId() {
		return courseId;
	}
	public CourseDetails(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public CourseDetails() {
		super();
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getNoOfLectures() {
		return noOfLectures;
	}
	public void setNoOfLectures(int noOfLectures) {
		this.noOfLectures = noOfLectures;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	
}
