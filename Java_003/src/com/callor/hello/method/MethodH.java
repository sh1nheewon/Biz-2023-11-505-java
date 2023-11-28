package com.callor.hello.method;

public class MethodH {

	public static boolean isPrime(int num) {
		for (int i = 0; i < 5; i++) {
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 2;
		boolean isPrime() = 
	}
}
