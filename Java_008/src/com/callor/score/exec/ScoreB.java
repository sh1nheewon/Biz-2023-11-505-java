package com.callor.score.exec;

import com.callor.score.service.ScoreServiceA;

public class ScoreB {
	public static void main(String[] args) {
		ScoreServiceA scoreService = new ScoreServiceA(); // 생성자 method
		scoreService.loadScores();
		scoreService.printScores(); // printScores() method 생성 후 출력
	}
	
}
