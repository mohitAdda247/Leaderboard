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

import com.leaderboard.model.Marks;
import com.leaderboard.service.MarksService;

@RestController
@RequestMapping("/marks")
public class MarksController {
	
	@Autowired 
	private MarksService marksService;
	
	@PostMapping("/add/{studentId}/{subjectId}")
	public Marks addMarks(@RequestBody Marks marks,@PathVariable Integer studentId,@PathVariable Integer subjectId ) {
		return marksService.addMarks(marks, studentId, subjectId);
	}
	
	@GetMapping("/all")
	public List<Marks> getall(){
		return marksService.getall();
	}
	
	@GetMapping("/find/{id}")
	public Marks getMarks(@PathVariable Integer id) {
		return marksService.getMarksById(id);
	}
	
	@PutMapping("/update/{studentId}/{subjectId}")
	public Marks updateMarks(@RequestBody Marks marks, @PathVariable Integer studentId , @PathVariable Integer subjectId) {
		return marksService.updateMarks(marks, studentId, subjectId);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteMarks(@PathVariable Integer id) {
		marksService.deleteMarks(id);
	}
	
}
