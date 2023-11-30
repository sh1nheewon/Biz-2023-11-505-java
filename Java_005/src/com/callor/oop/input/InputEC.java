package com.callor.oop.input;

import java.util.Scanner;

/*
 * 입력받은 문자열형 정수를 정수를 변환하는 과정에서 Exception 이 자주 발생하여 Exception 처리를 하려고 하자.
 */

public class InputEC {
	public static void main(String[] args) {

		int[] nums = new int[3];

		Scanner scan = new Scanner(System.in);

		System.out.println("=".repeat(30));
		for (int i = 0; i < nums.length; i++) {
			System.out.println("끝내려면 QUIT 를 입력하세요");
			System.out.printf("정수 %d >> ", i + 1);
			String str = scan.nextLine();
			if(str.equals("QUIT")) break;
			
			try {
				nums[i] = Integer.valueOf(str);
				
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				// for 문 에서는 continue 이후 i++ 를 실행하게 됨. 이를 방지하기 위해서 i-- continue 전에 입력.
				i--; 
				continue; 
			}
			
		}
		System.out.println("=".repeat(30));
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("=".repeat(30));
	}
}
