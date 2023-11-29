package com.callor.hello.arrays;

public class ArraysE {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];
		
		int[] sums = new int [STUDENT_LENGTH];
		float[] evgs = new float [STUDENT_LENGTH];
		
		int sumKors = 0;
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			scoreKors[i]= (int)(Math.random() * 50) + 51 ;
			sumKors += scoreKors[i];
		}
		
		int sumEngs = 0;
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			scoreEngs[i]= (int)(Math.random() * 50) + 51 ;
			sumEngs += scoreEngs[i];
		}
		
		int sumMaths = 0;
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			scoreMaths[i]= (int)(Math.random() * 50) + 51 ;
			sumMaths += scoreMaths[i];
		}
		
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEngs[i];
			sums[i] += scoreMaths[i];
		}
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			evgs[i] = (float)sums[i] / 3 ;
		}
		
		System.out.println("=".repeat(80));
		System.out.println(" 샛별반 성적표");
		System.out.println("-".repeat(80));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			System.out.printf("%3d\t", i + 1);
			System.out.printf("%3d\t", scoreKors[i]);
			System.out.printf("%3d\t", scoreEngs[i]);
			System.out.printf("%3d\t", scoreMaths[i]);
			System.out.printf("%3d\t", sums[i]);
			System.out.printf("%5.2f\n", evgs[i]);
			
		}
		System.out.println("-".repeat(80));
		System.out.printf("총점\t%3d\t %3d\t %3d\t", sumKors, sumEngs, sumMaths);
	}
}
