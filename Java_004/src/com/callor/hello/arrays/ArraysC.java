package com.callor.hello.arrays;

public class ArraysC {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int scoreKors[] = new int[STUDENT_LENGTH];

		System.out.println("=".repeat(50));
		System.out.println("샛별반 국어 점수");
		System.out.println("-".repeat(50));

		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
			System.out.printf("%d 번 : %d\n", i, scoreKors[i]);
		}
		System.out.println("-".repeat(50));
		int sum = 0;
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			sum += scoreKors[i];
		}

		float evg = 0;
		evg = (float) sum / STUDENT_LENGTH;

		System.out.printf("총점 : %d , 평균 : %.2f\n", sum, evg);
		System.out.println("=".repeat(50));
	}
}
