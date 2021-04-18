package com.leaderboard.service;

import java.util.List;

import com.leaderboard.model.Marks;

public interface MarksService {
	public Marks addMarks(Marks marks, Integer studentId, Integer subjectId);
	public List<Marks> getall();
	//public List<MarksDTO> getLeaderBoard();
	public void deleteMarks(Integer marksId);
	public Marks getMarksById(Integer id);
	public Marks updateMarks(Marks marks,Integer studentId, Integer subjectId);
}
