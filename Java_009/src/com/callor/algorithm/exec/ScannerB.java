package com.callor.algorithm.exec;

import java.util.Scanner;

public class ScannerB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 >> ");
		String str = scan.nextLine();
		int num1 = 0;
		while(true) {
		try {
			num1 = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("** 정수를 정확히 입력하여 주세요 **");
			continue;	
		}
		
		
		System.out.print("두번째 정수를 입력하세요 >> ");
		str = scan.nextLine();
		int num2 = 0;
		try {
			num2 = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("** 정수를 정확히 입력하여 주세요 **");
			continue;
		}
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d × %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		}
	}

}
