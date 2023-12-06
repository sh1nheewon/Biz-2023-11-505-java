package com.callor.algorithm.exec;

import java.util.Scanner;

public class ScannerE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 구구단 단수를 입력해 주세요 >> ");
		String str = scan.nextLine();
		int num = 0;
		num = Integer.valueOf(str);
	
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
	}
}
