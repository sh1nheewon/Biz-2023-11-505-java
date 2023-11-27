package com.callor.hello.algorithm;

public class AlgA {
	public static void main(String[] args) {
		
		/*
		 * 1~100까지 숫자 중의 3의 배수의 합
		 */
		int sum = 0;
		for(int i = 0; i < 100 ; i++) {
			int num = i+1;
			if(num % 3 == 0) {
				sum += num ;
				// num 의 값이 3의 배수인 경우에만 실행되는 코드
			}
		}
		
		System.out.println("1~100 까지의 수 중 3의 배수끼리의 합 : " + sum );
	}
}
