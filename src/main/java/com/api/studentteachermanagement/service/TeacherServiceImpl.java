package com.api.studentteachermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.studentteachermanagement.entities.Teacher;
import com.api.studentteachermanagement.repository.TeacherRepository;
@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepository;
	
	public TeacherServiceImpl() {
		
	}

	@Override
	public List<Teacher> getTeacher() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher addteacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}
	
}
