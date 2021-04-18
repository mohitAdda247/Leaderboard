package com.leaderboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaderboard.dao.SubjectRepository;
import com.leaderboard.model.Subject;
import com.leaderboard.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	SubjectRepository subjectRepository;

	@Override
	public Subject addSubject(Subject subject) {
		return subjectRepository.save(subject);
	}

	@Override
	public Subject getSubjectById(Integer id) {
		return subjectRepository.findBySubjectId(id);
	}

	@Override
	public List<Subject> getSubjectList() {
		return (List<Subject>) subjectRepository.findAll();
	}

	@Override
	public Subject updateSubject(Subject subject) {
		
		return subjectRepository.save(subject);
	}

	@Override
	public void deleteSubject(Integer id) {
		subjectRepository.deleteById(id);
		
	}
	
	
}
