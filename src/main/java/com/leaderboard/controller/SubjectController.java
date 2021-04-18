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

import com.leaderboard.model.Subject;
import com.leaderboard.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	SubjectService subjectService;
	
	@PostMapping("/add")
	public Subject addSubject(@RequestBody Subject subject) {
		return subjectService.addSubject(subject);
	}
	@GetMapping("/find/{id}")
	public Subject findSubjectBySubjectId(@PathVariable Integer id) {
		return subjectService.getSubjectById(id);
	}
	@GetMapping("/all")
	public List<Subject> findAllSubjects(){
		return subjectService.getSubjectList();
	}
	@PutMapping("/update")
	public Subject updateSubject(@RequestBody Subject subject) {
		return subjectService.updateSubject(subject);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteSubject(@PathVariable Integer id) {
		 subjectService.deleteSubject(id);
	}
}
