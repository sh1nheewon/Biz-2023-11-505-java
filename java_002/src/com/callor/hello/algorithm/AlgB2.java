package com.callor.hello.algorithm;

public class AlgB2 {
	
	/*
	 * 1~100 까지 수 중에서 3의 배수의 합과 5의 배수의 합
	 */
	public static void main(String[] args) {

		int sum3 = 0;
		int sum5 = 0;
		for (int i = 0; i < 100; i++) {
			/*
			 * i+1 연산을 여러번 수행해야 하는데 이 연산을 미리 한번 수행하여
			 * 결과를 변수에 보관해 두고 재활용하기. 
			 * int num = (i + 1);
			 */
			int num = (i+1);
			if (num % 3 == 0) {
				sum3 += num;
			}
			if (num % 5 == 0) {
				sum5 += num;

			}
		}
		System.out.printf("%d + %d = %d\n", 
					sum3, sum5, sum3 + sum5);
		System.out.printf("%d - %d = %d\n", 
					sum3, sum5, sum3 - sum5);
		System.out.printf("%d x %d = %d\n", 
					sum3, sum5, sum3 * sum5);
		System.out.printf("%d ÷ %d = %d\n", 
					sum3, sum5, sum3 / sum5);
	}

}
