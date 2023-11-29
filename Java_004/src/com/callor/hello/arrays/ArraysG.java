package com.callor.hello.arrays;

public class ArraysG {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;

		int[] scoreKors = new int[STUDENT_LENGTH];
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			
			scoreKors[i] = (int) (Math.random() * 50) + 51;

			if (scoreKors[i] >= 95) {
				System.out.printf("%d\tA+\n", scoreKors[i]);

			} else {
				
			}
			if (scoreKors[i] >= 90) {
				System.out.printf("%d\tA\n", scoreKors[i]);

			}
			if (scoreKors[i] >= 85) {
				System.out.printf("%d\tB+\n", scoreKors[i]);

			}
			if (scoreKors[i] >= 80) {
				System.out.printf("%d\tB\n", scoreKors[i]);

			}
			if (scoreKors[i] >= 75) {
				System.out.printf("%d\tC+\n", scoreKors[i]);

			}
			if (scoreKors[i] >= 70) {
				System.out.printf("%d\tC\n", scoreKors[i]);

			}
			if (scoreKors[i] >= 65) {
				System.out.printf("%d\tD+\n", scoreKors[i]);

			}
			if (scoreKors[i] >= 60) {
				System.out.printf("%d\tD\n", scoreKors[i]);

			}
			if (scoreKors[i] < 60) {
				System.out.printf("%d\tF\n", scoreKors[i]);

			}

		}

	}
}
