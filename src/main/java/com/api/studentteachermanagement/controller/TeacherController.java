package com.api.studentteachermanagement.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.studentteachermanagement.dto.TeacherDto;
import com.api.studentteachermanagement.entities.Teacher;
import com.api.studentteachermanagement.service.TeacherService;
@RestController
public class TeacherController {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/getTeacher")
	public List<TeacherDto>getTeacher(){
		return teacherService.getTeacher().stream().map(teacher -> modelMapper
				.map(teacher,TeacherDto.class)).collect(Collectors.toList());
	}
	
	@PostMapping("/addTeacher")
	public ResponseEntity<TeacherDto>addTeacher(@RequestBody TeacherDto teacherDto){
		Teacher teacherRequest=modelMapper.map(teacherDto, Teacher.class);
		Teacher teacher=teacherService.addteacher(teacherRequest);
		
		TeacherDto teacherResponse=modelMapper.map(teacher, TeacherDto.class);
		
		return new ResponseEntity<TeacherDto>(teacherResponse,HttpStatus.CREATED);
	}
}
