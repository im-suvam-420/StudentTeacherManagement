package com.api.studentteachermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.studentteachermanagement.entities.Student1;
import com.api.studentteachermanagement.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	public StudentServiceImpl() {
		
	}
	
	@Override
	public List<Student1> getStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student1 addstudent(Student1 student) {
		return studentRepository.save(student);
	}

}
