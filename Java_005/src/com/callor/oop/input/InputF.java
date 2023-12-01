package com.callor.oop.input;

import java.util.Scanner;

public class InputF {
	public static void main(String[] args) {
		
		int num = 2;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 (QUIT : 끝내기) >> ");
			String str1 = scan.nextLine();
			System.out.println(str1 == "Quit");
			if (str1.equals("QUIT")) {
				break;
			}
			try {
		
			} catch (Exception e) {
				System.out.println("정수값을 정확히 입력하시오");

			}
		}

	}
}
