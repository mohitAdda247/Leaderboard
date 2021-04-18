package com.leaderboard.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leaderboard")
public class Leaderboard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8177016228863997862L;
	
	@Id
	private String name;
	
	@Column
	private int total;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
