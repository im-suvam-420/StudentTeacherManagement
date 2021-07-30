package com.api.studentteachermanagement.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.studentteachermanagement.dto.StudentDto;
import com.api.studentteachermanagement.entities.Student1;
import com.api.studentteachermanagement.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getStudent")
	public List<StudentDto>getStudent(){
		return studentService.getStudent().stream().map(student1 -> modelMapper
				.map(student1, StudentDto.class)).collect(Collectors.toList());
	}
	
	@PostMapping("/addStudent")
	public Student1 addStudent(@RequestBody StudentDto studentDto) {
		Student1 studentRequest=modelMapper.map(studentDto, Student1.class);
		Student1 student1=studentService.addstudent(studentRequest);
		
		StudentDto studentResponse=modelMapper.map(student1, StudentDto.class);
		
		return student1;
	}
}
