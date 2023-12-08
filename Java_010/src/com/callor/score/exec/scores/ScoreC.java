package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreC {


	public static void main(String[] args) {
		 List<ScoreDto> scores = new ArrayList<>();
		NumberService numService = new NumberService();
		ScoreDto scoreDto = new ScoreDto();

		int start = 50;
		int end = 100;

		for (int i = 0; i < 3; i++) {

			int scoreKor = numService.inputNumber( (i+1) + " 번째 국어 점수를 ",start, end);
			int scoreEng = numService.inputNumber( (i+1) + "번째 영어 점수를 ", start, end);
			int scoreMath = numService.inputNumber( (i+1) + "번째 수학 점수를 ", start, end);

			
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			
			scores.add(scoreDto);
		}
		scores.size();
		System.out.println(scoreDto.kor);
		System.out.println(scoreDto.eng);
		System.out.println(scoreDto.math);
		}
		

	}

