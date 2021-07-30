package com.api.studentteachermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.studentteachermanagement.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
