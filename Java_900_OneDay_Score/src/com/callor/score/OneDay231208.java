package com.callor.score;

import com.callor.score.service.ScoreService;

public class OneDay231208 {
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		
		for(int i = 0 ; i < 10 ; i++) {
			scoreService.inputScores(51, 100);
		}
		
		scoreService.printScore();
		
	}
}
