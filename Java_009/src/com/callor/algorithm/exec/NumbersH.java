package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class NumbersH {
	public static void main(String[] args) {

		NumberService numService = new NumberService();
		int score1 = numService.inputNum("첫 번째 점수를");
		int score2 = numService.inputNum("두 번째 점수를");
		int score3 = numService.inputNum("세 번째 점수를");

		int scoreSum = score1 + score2 + score3;
		int scoreAvg = scoreSum / 3;
		
		System.out.printf("평균 : %d점\n",scoreAvg);
		
		if (scoreAvg >= 60) System.out.println("합격입니다");			
		else System.out.println("낙제입니다");			
		

	}
}
