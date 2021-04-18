package com.leaderboard.service;

import java.util.List;

import com.leaderboard.model.Student;

public interface StudentService {

	public Student addStudent(Student student);

	public Student getStudentById(Integer id);

	public List<Student> getStudentList();

	public Student updateStudent(Student student);

	public void deleteStudent(Integer id);
}
