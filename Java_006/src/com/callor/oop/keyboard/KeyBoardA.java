package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardA {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.println("정수 >> ");
			String str = scan.nextLine();

			for (int i = 1; i <= num; i++) {
				if (i / 2 == 0) {
					System.out.printf(" 1 ~ %d 범위에서 짝수는 ? " , i);
					break;
				}
			}
			
			

		}

	}

}
