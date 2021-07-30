package com.api.studentteachermanagement.dto;

import com.api.studentteachermanagement.entities.Teacher;

public class StudentDto {

	private Long id;
	private String studentName;
	private Long studentRollNumber;
	private String address;
	
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public StudentDto() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Long getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(Long studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
