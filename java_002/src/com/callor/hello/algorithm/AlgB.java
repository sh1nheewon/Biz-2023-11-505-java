package com.callor.hello.algorithm;

public class AlgB {
	
	/*
	 * 1~100 까지 수 중에서 3의 배수의 합과 5의 배수의 합
	 */
	public static void main(String[] args) {

		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 3 == 0) {
				sumA += (i + 1);
			}
			if ((i + 1) % 5 == 0) {
				sumB += (i + 1);

			}
		}
		System.out.println("3의 배수 : " + sumA);
		System.out.println("5의 배수 : " + sumB);
		System.out.println("=========================");
		System.out.println("3의 배수 + 5의 배수 : " + (sumA + sumB));
		System.out.println("3의 배수 - 5의 배수 : " + (sumA - sumB));
		System.out.println("3의 배수 x 5의 배수 : " + (sumA * sumB));
		System.out.println("3의 배수 / 5의 배수 : " + (sumA / sumB));
		System.out.println("3의 배수 % 5의 배수 : " + (sumA % sumB));

	}

}
