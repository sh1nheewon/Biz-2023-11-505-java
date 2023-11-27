package com.callor.hello.prime;

public class PrimeA {
	public static void main(String[] args) {
		

	int num = 9;
	System.out.println("================");
	System.out.println((num) + "는 Prime Number 인가?");
	System.out.println("----------------");
	
	for(int i = 2; i < num; i++ ) {
		
		System.out.printf("%d MOD %d = %d\n", num, i, num % i);
		
	}
	System.out.println("================");
}
}