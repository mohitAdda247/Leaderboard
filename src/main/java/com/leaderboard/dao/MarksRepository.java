package com.leaderboard.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leaderboard.model.Marks;

@Repository
public interface MarksRepository extends JpaRepository<Marks, Integer> {
	

	List<Marks> findAll();
	Marks findByMarksId(int marksId);
}
