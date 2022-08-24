package com.stud.service;

import java.util.Optional;

import com.stud.modal.Student;

public interface IStudentService {
	public String saveStudent(Student student);
	public Optional<Student> fetchStudentById(Integer id);

}
