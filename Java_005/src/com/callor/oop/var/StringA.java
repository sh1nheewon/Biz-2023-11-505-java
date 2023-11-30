package com.callor.oop.var;

public class StringA {
	public static void main(String[] args) {
		
		int num1 = 30; 
		int num2 = 30;
		System.out.println(num1 == num2);
		
		String str1 = "대한민국";
		String str2 = "대한민국";
		System.out.println(str1 == str2);
		
		String str3 = new String("우리나라");
		String str4 = new String("우리나라");
		System.out.println(str3 == str4); 
		// 문자열에는 == 사용 안함.
		
		System.out.println(str3.equals(str4));
		// 문자열 변수 값이 같은지 확인할 때 : .equals() / 대소문자 구분
		System.out.println(str3.equalsIgnoreCase(str4));
	}
}
