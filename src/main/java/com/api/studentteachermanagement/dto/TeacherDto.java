package com.api.studentteachermanagement.dto;

import java.util.List;

import com.api.studentteachermanagement.entities.Student1;

public class TeacherDto {

	private Long id;
	private String teacherName;
	private String phoneNum;
	
	private List<Student1>student;
	
	
	
	public List<Student1> getStudent() {
		return student;
	}
	public void setStudent(List<Student1> student) {
		this.student = student;
	}
	public TeacherDto() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
}
