package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int rndNum = 0;
		while (true) {
			System.out.println("1~10 까지의 정수를 입력하세요");
			System.out.print("정수 >> ");
			String str = scan.nextLine();

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("1~10 사이의 정수를 입력하세요");
				continue;
			}
			if (num > 10) {
				System.out.println("10 이하의 정수를 입력하세요");
				continue;

			}

			rndNum = (int) (Math.random() * 10) + 1;

			if (rndNum == num) {
				if (str.equals(str)) {
					System.out.printf("참 잘했어요 : ( %d )\n", rndNum);
				}
			} else {
				
				System.out.printf("다시 한번 시도해 보세요 : ( %d )\n", rndNum);

			}
		}
	}
}