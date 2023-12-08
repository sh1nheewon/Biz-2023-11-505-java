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
		for (int i = 0; i < 10; i++) {

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
	}


	public void printScore() {
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int musicSum = 0;
		int artSum = 0;
		int totalSum = 0;
		
		float korAvg = 0;
		float engAvg = 0;
		float mathAvg = 0;
		float artAvg = 0;
		float musicAvg = 0;
		float avgAvg = 0;
		
		Line.dLine(80);
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		Line.dLine(80);
		System.out.println("학번	\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(80);
		for (ScoreDto dto : scores) {

			System.out.printf("%s	\t", dto.stdNum);
			System.out.printf("%3d\t", dto.kor);
			System.out.printf("%3d\t", dto.eng);
			System.out.printf("%3d\t", dto.math);
			System.out.printf("%3d\t", dto.music);
			System.out.printf("%3d\t", dto.art);
			System.out.printf("%3d\t", dto.getTotal());
			System.out.printf("%3.2f\n", dto.getAvg());

			korSum += dto.kor;
			engSum += dto.eng;
			mathSum += dto.math;
			musicSum += dto.music;
			artSum += dto.art;

			totalSum = korSum + engSum + mathSum + musicSum + artSum;

			korAvg = (float) korSum / 10f;
			engAvg = (float) engSum / 10f;
			mathAvg = (float) mathSum / 10f;
			musicAvg = (float) musicSum / 10f;
			artAvg = (float) artSum / 10f;

			avgAvg = (korAvg + engAvg + mathAvg + musicAvg + artAvg) / 5;
		}
		Line.sLine(80);
		System.out.printf("총점	\t%3d\t%3d\t%3d\t%3d\t%3d\t%3d\n", korSum, engSum, mathSum, musicSum, artSum, totalSum);
		System.out.printf("평균	\t%3.2f\t%3.2f\t%3.2f\t%3.2f\t%3.2f\t	%3.2f\n", korAvg, engAvg, mathAvg, musicAvg,
				artAvg, avgAvg);
		;
		Line.dLine(80);
	}

}
