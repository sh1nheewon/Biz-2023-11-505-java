package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreC {

	public static void main(String[] args) {

		ScoreService[] scores = new ScoreService[10];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreService();
		}
		
		// 10개 배열의 각 과목 점수를 random 으로 생성하고자 한다.
		
		for (int i = 0; i < scores.length; i++) {
			
			scores[i].scoreKor = (int) (Math.random() * 50) + 51;			
			scores[i].scoreEng = (int) (Math.random() * 50) + 51;
			scores[i].scoreMath = (int) (Math.random() * 50) + 51;
			
			System.out.println(scores[i].scoreKor);
			System.out.println(scores[i].scoreEng);
			System.out.println(scores[i].scoreMath);
			
		}
	}
}
