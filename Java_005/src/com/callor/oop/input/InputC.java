package com.callor.oop.input;

import java.util.Scanner;
/*
 * scanner를 사용하여 키보드로 값을 입력받을때는 Scanner Object 를 생성한 후 nextLine() method 를 사용하여 입력을 받고 입력받은 문자열을 변수에 할당한다.
 * Scanner 에는 nextInt(), nextFloat() 등 키보드로 입력한 문자열형 숫자를 숫자로 변환하여 return 하는 method 가 있다.
 * 하지만 이 method 들은 bug 가 있어서 작동이 잘 못 되는 경우가 있다.
 * 그래서 그냥 nextLine() 을 사용하여 숫자를 문자열로 입력 받고 나중에 다시 숫자형으로 변환하여 코드애 적용한다.
 * 
 * Scanner.nextLine() 을 통하여 입력 받은 "문자열형 숫자"( "88" )"를 실제 정수, 실수 등으로 변환하여 연산에 사용하게 되는데
 * 이때 Integer.valueOf(), Float.valueOf(), Long.valueOf(), Double.valueOf() 등 method 를 사용하여 문자열형 숫자를 실제 숫자로 변환한다.
 * 
 * Integer.parseInt(), Float.parseFloat(), Long.parseLong(), Double.parseDouble() 등의 method 도 있다.   
 */
public class InputC {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=".repeat(50));
		System.out.println("4칙연산 계산기");
		System.out.println("-".repeat(50));

		System.out.println("두 개의 정수를 입력받아");
		System.out.println("사칙연산을 수행합니다");
		System.out.println("두 개의 정수를 입력해 주세요");
		
		System.out.print("정수 1 >> ");
		String str1 = scan.nextLine();
		
		num1 = Integer.parseInt(str1); // 문자열로 되어있는 str1을 정수형으로 바꾸어줌
		Float.parseFloat(str1);
		
		System.out.print("정수 2 >> ");
		String str2 = scan.nextLine();
		
		num2 = Integer.valueOf(str2); // Integer.parseInt() 와 같음.
		Float.valueOf(str2);
		
		System.out.printf("입력한 정수는 %s, %s 입니다\n" , str1, str2);
		System.out.println(str1 + str2);
		
		System.out.println("=".repeat(50));
		System.out.printf("%d + %d = %d\n" , num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n" , num1, num2, num1 - num2);
		System.out.printf("%d × %d = %d\n" , num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n" , num1, num2, num1 / num2);
		System.out.println("=".repeat(50));
		
		scan.close();
	}
}
