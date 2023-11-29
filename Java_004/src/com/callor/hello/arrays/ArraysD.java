package com.callor.hello.arrays;

public class ArraysD {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int [STUDENT_LENGTH];
		int[] scoreEng = new int [STUDENT_LENGTH];
		int[] scoreMath = new int [STUDENT_LENGTH];
		
		int sum = 0;
		float evg = 0;
		
		for(int i = 0 ; i < scoreKors.length ; i++) {
			int rndKors = (int)(Math.random() * 50 ) + 51;
			scoreKors[i] = rndKors;
			
			
		}
		
		for(int i = 0 ; i < scoreEng.length ; i++) {
			int rndEng = (int)(Math.random() * 50 ) + 51;
			scoreEng[i] = rndEng;
			
			
		}
		
		for(int i = 0 ; i < scoreMath.length ; i++) {
			int rndMath = (int)(Math.random() * 50 ) + 51;
			scoreMath[i] = rndMath;
			
			
		}
		System.out.println("=".repeat(50));
		System.out.println("	샛별반 성적표");
		System.out.println("-".repeat(50));
		System.out.println("국어	영어	수학	총점	평균");
		System.out.println("-".repeat(50));
		
		for(int i = 0 ; i < STUDENT_LENGTH ; i++ ){
			evg = (float)sum / 3;			
			sum = scoreKors[i] + scoreEng[i] + scoreMath[i];
			System.out.printf("%2d	 %2d	%2d	%2d	%.2f\n", scoreKors[i] , scoreEng[i], scoreMath[i], sum, evg) ;
		}
		System.out.println("=".repeat(50));
	}
}
