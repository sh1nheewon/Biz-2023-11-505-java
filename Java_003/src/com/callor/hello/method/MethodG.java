package com.callor.hello.method;

public class MethodG {

	public static boolean isPrime(int num) {
		int i = 0;

		for (i = 0; i < 100; i++) {
			if (num % i == 0) {
				break;
			}
		}
		if (i >= num) {
			boolean noPrime = true;
			return noPrime;

		}else{
			false;
		}
	}

	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 100) + 1;
		isPrime(rndNum);
	}
}
