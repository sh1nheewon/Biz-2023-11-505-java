package com.callor.oop.input;

import java.util.Scanner;

public class InputG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.print("정수 (종료:QUIT) >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				break;
			}
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				System.out.println("입력한 값 : " + str);
				continue;
			}

			if (num < 2) {
				System.out.println("값은 2 이상 입력하시오");
				System.out.println("입력한 값 : " + num);
				continue;
			}

			boolean isPrime = isPrime(num);
			if (isPrime) {
				System.out.println(num + " 는 소수");
			} else {
				System.out.println(num + " 는 소수가 아님");

			}
		}
	}

	public static boolean isPrime(int num) {
		int index = 0;

		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

}
