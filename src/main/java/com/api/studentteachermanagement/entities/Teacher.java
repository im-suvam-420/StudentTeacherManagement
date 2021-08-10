package com.api.studentteachermanagement.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String teacherName;
	private String phoneNum;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "teacher")
	private List<Student1>student;
	
	public List<Student1> getStudent() {
		return student;
	}

	public void setStudent(List<Student1> student) {
		this.student = student;
	}

	public Teacher() {
		
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
