package com.callor.hello.prime;

public class PrimeG {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			for (int num = i+1 ; i < num ; num++) {
				if (i % num == 0) {
					break;
				}
				System.out.printf("%d MOD %d = %d\n", num, i, i % num);

			}

		}

	}
}
