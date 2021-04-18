package com.leaderboard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaderboard.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
	Subject findBySubjectId(int subjectId);
}
