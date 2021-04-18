package com.leaderboard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaderboard.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	Student findByStudentId(int studentId);
}
