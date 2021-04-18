package com.leaderboard.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leaderboard.model.Leaderboard;
import com.leaderboard.service.LeaderboardService;

@RestController
@RequestMapping("/leaderboard")
public class LeaderBoardController {
	
	Logger log = LoggerFactory.getLogger(LeaderBoardController.class);
	
	@Autowired
	LeaderboardService leaderboardService;
	
	@GetMapping("/show")
	@Scheduled(cron = "0 */1 * * * *")
	public List<Leaderboard> show(){
		
		log.info("Cron working on minute basis");
		leaderboardService.delete();
		leaderboardService.add();
		return leaderboardService.fetch();
	}
}
