package com.callor.hello.prime;

public class PrimeC {
	public static void main(String[] args) {
		int num = 7;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.printf("%d MOD %d = %d\n", num, i, num % i);
				System.out.println(num + "는 소수임");
				
				
				}
			
				else if(num % i != 0) {
					System.out.printf("%d MOD %d = %d\n" , num, i , num % i);
					System.out.println(num + "는 소수가 아님");
					break;
				}
			}
		
	}
}