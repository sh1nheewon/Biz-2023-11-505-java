package com.callor.hello.algorithm;

public class AlgB {
	public static void main(String[] args) {
		
		
		int num1 = 30;
		int num2 = 40;
		
		boolean bYes = false;

		
		
		bYes = num1 == num2; // F
		bYes = num1 >= num2; // F
		bYes = num1 <= num2; // T
		bYes = num1 != num2; // T (!는 같지 않냐 라는 뜻) 
		
		bYes = num1 > num2; // F
		bYes = num1 < num2; // T
		
		// =====================================
		
		num1 = 30;
		num2 = 30;

		bYes = num1 == num2; // T
		bYes = num1 >= num2; // T
		bYes = num1 <= num2; // T
		bYes = num1 != num2; // F 
		
		bYes = num1 > num2; // F
		bYes = num1 < num2; // F
		
		
		
		
	}
}
