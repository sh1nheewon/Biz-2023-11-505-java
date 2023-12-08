package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {
	private List<ScoreDto> scores = null;
	

	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
	
	}

	public void inputScores(int start, int end) {
		String strStdNum = "23000";
		if (scores.size() > 0) {
			strStdNum = scores.get(scores.size() - 1).stdNum;
		}
		int intStdNum = Integer.valueOf(strStdNum.substring(2));
		intStdNum++;
		
		strStdNum = String.format("23%03d", intStdNum);
		
		int scoreKor = (int) (Math.random() * 50) + 51;
		int scoreEng = (int) (Math.random() * 50) + 51;
		int scoreMath = (int) (Math.random() * 50) + 51;
		int scoreMusic = (int) (Math.random() * 50) + 51;
		int scoreArt = (int) (Math.random() * 50) + 51;
		

		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		scoreDto.music = scoreMusic;
		scoreDto.art = scoreArt;
		
		
		

		scores.add(scoreDto);
	}

	

	public void printScore() {
		Line.dLine(80);
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		Line.dLine(80);
		System.out.println("학번	\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(80);
		for (ScoreDto dto : scores) 	{
			System.out.printf("%s	\t", dto.stdNum);
			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\t", dto.music);
			System.out.printf("%3d\t", dto.art);
			System.out.printf("%3d\t", dto.getTotal());
			System.out.printf("%3.2f\n", dto.getAvg());
			
		
		}
		Line.sLine(80);
		
		System.out.println();
		System.out.print("평균");
		System.out.println();
		Line.dLine(80);
		
		
	}

}
