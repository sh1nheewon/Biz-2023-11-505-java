package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;
import com.callor.oop.utils.Line;

public class ScoreC {

	public static void main(String[] args) {
		Line.title(50,"성적표");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		ScoreService[] scores = new ScoreService[10];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();
		}
		// 10개 배열의 각 과목 점수를 random 으로 생성하고자 한다.
		for (int i = 0; i < scores.length; i++) {
			scores[i].scoreKor = (int) (Math.random() * 50) + 51;
			scores[i].scoreEng = (int) (Math.random() * 50) + 51;
			scores[i].scoreMath = (int) (Math.random() * 50) + 51;

			System.out.printf("%2d	%2d	%2d	%2d	%2.2f\n", scores[i].scoreKor, scores[i].scoreEng, scores[i].scoreMath,
					scores[i].getScoreTotal(), scores[i].getScoreAvg());
		}
		System.out.println("=".repeat(50));
	}
}
// 배열에 저장된 점수 화면에 출력하기