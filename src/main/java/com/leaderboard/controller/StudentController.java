package com.leaderboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leaderboard.model.Student;
import com.leaderboard.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentservice.addStudent(student);
	}
	@GetMapping("/id/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentservice.getStudentById(id);
	}
	@GetMapping("/all")
	public List<Student> getAll(){
		return studentservice.getStudentList();
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentservice.updateStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		studentservice.deleteStudent(id);
	}
}
