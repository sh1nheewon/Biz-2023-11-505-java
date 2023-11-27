package com.callor.hello.prime;

public class PrimeAA {
	public static void main(String[] args) {
		// 어떤 수가 prime 인가를 판별하기 위해서 선언한 변수.
		int num = 9;
		System.out.println("==================");
		System.out.println(num + " 는 Prime Number 인가?");
		System.out.println("------------------");
		for (int i = 2; i < num; i++) {
			System.out.printf("%d MOD %d = %d\n" ,num, i, num % i );
			
		}
		System.out.println("==================");
	}
}
