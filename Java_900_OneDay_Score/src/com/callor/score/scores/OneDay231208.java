package com.callor.score.scores;

import com.callor.score.service.ScoreService;

public class OneDay231208 {
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();

		scoreService.inputScores(51, 100);

		scoreService.printScore();
		
	}
}
