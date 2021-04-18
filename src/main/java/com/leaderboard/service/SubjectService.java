package com.leaderboard.service;

import java.util.List;

import com.leaderboard.model.Subject;

public interface SubjectService {
	public Subject addSubject(Subject subject);

	public Subject getSubjectById(Integer id);

	public List<Subject> getSubjectList();

	public Subject updateSubject(Subject subject);

	public void deleteSubject(Integer id);

}
