package com.callor.oop.input;

import java.io.InputStream;
import java.util.Scanner;

public class InputB {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);

		InputStream in = System.in; // InputStream = 키보드로
		Scanner scan2 = new Scanner(in);
		
		/*
		 * Scanner.nextLine()
		 * 키보드로부터 문자열 + Enter 가 입력 될 때 까지 마냥 기다리는 method()
		 * Scanner.nextLint() 명령이 실행되면 코드는 blocking 상태가 된다. (마냥 waiting 하는 상태)
		 * 
		 * Scanner.nextLine() 코드 이전에 반드시 사용자에게 prompt 를 보여주어야 한다. 
		 */
		
		System.out.print("문자열을 입력 >> ");
		String str = scan1.nextLine(); 
		System.out.println("newxLine() 이 return 한 문자열 : " + str);
	}
}
