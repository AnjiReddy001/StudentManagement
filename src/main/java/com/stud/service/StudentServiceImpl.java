package com.stud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stud.modal.Student;
import com.stud.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentRepository studentRepository;

	@Override
	public String saveStudent(Student student) {
		Student stud=studentRepository.save(student);
		return "Student record saved based on Id"+stud.getId();
	}

	@Override
	public Optional<Student> fetchStudentById(Integer id) {
		Optional<Student> std= studentRepository.findById(id);
		return std;
	}

}
