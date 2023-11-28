package com.callor.hello.method;

public class MethodI {

	public static int isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int sum = 0;
		int index = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + index;
			int num = (int) (Math.random() * 100) + 2;
			index = isPrime(num);
			if (index > 0) {
				System.out.printf("%d 는 소수임\n", num);

			} else {
				System.out.printf("%d 는 소수가 아님\n", num);
			}
		}
		System.out.println("===========================");
		System.out.printf("소수의 합 : %d\n", sum);

	}

}
