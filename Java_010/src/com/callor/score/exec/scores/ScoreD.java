package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreD {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		
		int start = 50;
		int end = 100;
		String strNum = null;
		for(int index = 0 ; index < 3 ; index++) {
			int stNum  = index + 1;
			int scoreKor = numService.inputNumber(stNum + "번의 국어 점수",start,end);
			int scoreEng = numService.inputNumber(stNum + "번의 영어 점수",start,end);
			int scoreMath = numService.inputNumber(stNum + "번의 수학 점수",start,end);
			
			ScoreDto scoreDto = new ScoreDto();
			
			strNum = String.format("S%04d", stNum);
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			
			scores.add(scoreDto);
		}
		
		
		for(int i = 0 ; i < scores.size() ; i++) {
			ScoreDto dto = scores.get(i);
			System.out.printf("%s\t",strNum);
			System.out.printf("%d\t",dto.kor);
			System.out.printf("%d\t",dto.eng);
			System.out.printf("%d\t",dto.math);
			System.out.printf("%d\t",dto.getTotal());
			System.out.println();
		}
		
	}
}
