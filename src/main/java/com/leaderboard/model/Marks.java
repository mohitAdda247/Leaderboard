package com.leaderboard.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "marks")
public class Marks implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -345803339996684028L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int marksId;
	
	@Column 
	private int marks;

	@OneToOne
	@JoinColumn(name = "studentId")
	private Student student;
	
	@OneToOne
	@JoinColumn(name = "subjectId")
	private Subject subject;

	public int getMarksId() {
		return marksId;
	}

	public void setMarksId(int marksId) {
		this.marksId = marksId;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
}
