package com.leaderboard.service;

import java.util.List;

import com.leaderboard.model.Leaderboard;

public interface LeaderboardService {
	public void add();

	public List<Leaderboard> fetch();

	public void delete();
}
