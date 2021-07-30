package com.api.studentteachermanagement.service;

import java.util.List;

import com.api.studentteachermanagement.entities.Student1;

public interface StudentService {

	public List<Student1> getStudent();

	public Student1 addstudent(Student1 student);

}
