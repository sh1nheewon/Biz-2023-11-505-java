package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;

public class ScoreService {
	// 클래스 영역에서는 선언만 하고
	private List<ScoreDto> scores = null;
	private NumberService numService = null;

	// 생성자에서
	public ScoreService() {
		// 초기화(사용할 준비하기)
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}

	public void inputScore(String title) { //점수 범위 상관 X
		int scoreKor = numService.inputNumber("국어점수");
		int scoreEng = numService.inputNumber("영어점수");
		int scoreMath = numService.inputNumber("수학점수");
		
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		
		scores.add(scoreDto);
	} // end inputScore()
	
	public void inputScore(int start,int end) { // 점수 범위 설정
		int scoreKor = numService.inputNumber("국어점수",start,end);
		int scoreEng = numService.inputNumber("영어점수",start,end);
		int scoreMath = numService.inputNumber("수학점수",start,end);
	}

}
