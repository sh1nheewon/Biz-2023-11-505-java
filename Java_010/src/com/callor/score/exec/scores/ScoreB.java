package com.callor.score.exec.scores;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {
	public static void main(String[] args) {
		NumberService numberService = new NumberService();
		int num1 = numberService.inputNumber("국어 점수를",50,100);
		int num2 = numberService.inputNumber("영어 점수를",50,100);
		int num3 = numberService.inputNumber("수학 점수를",50,100);
		
		ScoreDto scoreDto = new ScoreDto();
		
		scoreDto.kor = num1;
		scoreDto.eng = num2;
		scoreDto.math = num3; 
		
		System.out.printf("총점 : %d",scoreDto.getTotal());
				
	}
}
