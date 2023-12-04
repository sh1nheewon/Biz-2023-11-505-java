package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreCA {

	public static void main(String[] args) {
		// Line.title("성적표");
		Line.title(50,"성적표");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		ScoreService[] scores = new ScoreService[10];

		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%3d\t",scores[i].scoreKor);
			System.out.printf("%3d\t",scores[i].scoreEng);
			System.out.printf("%3d\t",scores[i].scoreMath);
			
			System.out.printf("%3d\t",scores[i].getScoreTotal());
			System.out.printf("%5.2f\n",scores[i].getScoreAvg());
		}
	
	}
}
// 배열에 저장된 점수 화면에 출력하기