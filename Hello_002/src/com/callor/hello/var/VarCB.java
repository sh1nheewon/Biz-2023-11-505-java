package com.callor.hello.var;

public class VarCB {
	public static void main(String[] args) {
		
		// 변수 선언하는 곳
		int scoreKor = 90;
		int scoreEng = 70;
		int scoreMath = 80;
		
		int total = scoreKor + scoreEng + scoreMath;
		int avg = total / 3;
		// 입력해도 상관없으나 CA버전이 더 나음.
		
		
		
		// 데이터를 변수에 할당하는 곳
		scoreKor = 90;
		scoreEng = 80;
		scoreMath = 70;
		
		// 계산하는 부분
		total = scoreKor + scoreEng + scoreMath;
		avg = total / 3;
		
		// 출력하는 부분
		System.out.println("===============");
		System.out.println("성적표");
		System.out.println("국어 : " + scoreKor);
		System.out.println("영어 : " + scoreEng);
		System.out.println("수학 : " + scoreMath);
		System.out.println("===============");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("===============");
		
		
	}
}
