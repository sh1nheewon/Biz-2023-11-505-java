package com.callor.oop.input;

import java.io.InputStream;
import java.util.Scanner;

public class InputE {
	public static void main(String[] args) {
		int[] nums = new int[3];

		Scanner scan = new Scanner(System.in);
		InputStream in = System.in;
		Scanner scan2 = new Scanner(in);

		System.out.print("정수 1 : >> ");
		String str1 = scan.nextLine();
		nums[0] = Integer.valueOf(str1);
		Float.valueOf(str1);

		System.out.print("정수 2 : >> ");
		String str2 = scan.nextLine();
		nums[1] = Integer.valueOf(str2);
		Float.valueOf(str2);

		System.out.print("정수 3 : >> ");
		String str3 = scan.nextLine();
		nums[2] = Integer.valueOf(str3);
		Float.valueOf(str3);

		System.out.println("=".repeat(50));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.printf("%s %s %s", str1, str2, str3);

		scan.close();
	}
}