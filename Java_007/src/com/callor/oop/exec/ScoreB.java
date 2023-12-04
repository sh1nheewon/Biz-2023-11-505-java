package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreB {
	public static void main(String[] args) {
		/*
		 * 5명 학생의 성적처리를 하기 위하여 ScoreService 클래스를 (설계도로 하여) 사용하여 5개의 scores 배열을 "선언만" 한다.
		 */
		ScoreService[] scores = new ScoreService[5];
		
		// 0 철수 , 1 영희 , 2 민수, 3 길동, 4 꺽정
		// 객체 배열은 선언만 되어 있을 때 내부에 포함하는 변수, method 를 사용할 수 없다.
		// 각각의 배열 요소를 다시 한 번 객체로 생성(new)해 주어야 한다.
		scores[0] = new ScoreService();
		scores[0].scoreKor = 100;
		scores[0].scoreEng = 90;
		scores[0].scoreMath = 80;
		
		scores[1] = new ScoreService();
		scores[1].scoreKor = 90;
		scores[1].scoreEng = 75;
		scores[1].scoreMath = 85;
		
		scores[2] = new ScoreService();
		scores[2].scoreKor = 95;
		scores[2].scoreEng = 80;
		scores[2].scoreMath = 90;
		
		// 영희 (1번 배열)의 총점과 평균 출력
		
		//scoreTotla 변수는 private 으로 설정되어 있어서 변수에 값을 직접 참조(읽기) 할 수 없다. 
		//scoreTotal 변수의 값을 사용하려면 반드시 getScoreTotal() method 를 통해서만 가능하다.
		//System.out.println(scores[1].ScoreTotal());
		System.out.println(scores[1].getScoreAvg());
		System.out.println(scores[1].getScoreTotal());
		
	}
}
