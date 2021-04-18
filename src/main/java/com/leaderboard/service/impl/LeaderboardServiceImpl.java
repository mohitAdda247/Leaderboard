package com.leaderboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leaderboard.dao.LeaderboardRepository;
import com.leaderboard.model.Leaderboard;
import com.leaderboard.service.LeaderboardService;

@Service
public class LeaderboardServiceImpl implements LeaderboardService {
	
	@Autowired
	private LeaderboardRepository leaderboardRepository;

	@Override
	public void add() {
		leaderboardRepository.addRecord();
		
	}

	@Override
	public List<Leaderboard> fetch() {
		return leaderboardRepository.getRecords();
	}

	@Override
	public void delete() {
		leaderboardRepository.deleteRecords();
		
	}

}
