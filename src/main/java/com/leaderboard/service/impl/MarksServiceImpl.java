package com.leaderboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaderboard.dao.MarksRepository;
import com.leaderboard.dao.StudentRepository;
import com.leaderboard.dao.SubjectRepository;
import com.leaderboard.model.Marks;
import com.leaderboard.model.Student;
import com.leaderboard.model.Subject;
import com.leaderboard.service.MarksService;


@Service
public class MarksServiceImpl implements MarksService {

	@Autowired
	private MarksRepository marksRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	
	@Override
	public Marks addMarks(Marks marks, Integer studentId, Integer subjectId) {
		Student student = studentRepository.findByStudentId(studentId);
		Subject subject = subjectRepository.findBySubjectId(subjectId);
		
		marks.setStudent(student);
		marks.setSubject(subject);
		return marksRepository.save(marks);
	}

	@Override
	public List<Marks> getall() {
		return marksRepository.findAll();
	}

	@Override
	public void deleteMarks(Integer marksId) {
		marksRepository.deleteById(marksId);;
		
	}

	@Override
	public Marks getMarksById(Integer id) {
		
		return marksRepository.findByMarksId(id);
	}

	@Override
	public Marks updateMarks(Marks marks, Integer studentId, Integer subjectId) {

		Student student = studentRepository.findByStudentId(studentId);
		Subject subject = subjectRepository.findBySubjectId(subjectId);
		marks.setStudent(student);
		marks.setSubject(subject);
		return marksRepository.save(marks);
	}

}
