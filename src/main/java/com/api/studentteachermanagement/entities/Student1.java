package com.api.studentteachermanagement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Student1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String studentName;
	private Long studentRollNumber;
	private String address;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student1() {
		
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
