package com.api.studentteachermanagement.service;

import java.util.List;

import com.api.studentteachermanagement.entities.Teacher;

public interface TeacherService {

	public List<Teacher> getTeacher();

	public Teacher addteacher(Teacher teacher);



}
