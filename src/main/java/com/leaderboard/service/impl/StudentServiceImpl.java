package com.leaderboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaderboard.dao.StudentRepository;
import com.leaderboard.model.Student;
import com.leaderboard.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private  StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.findByStudentId(id);
	}

	@Override
	public List<Student> getStudentList() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
		
	}
	
}
