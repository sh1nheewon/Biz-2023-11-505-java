package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class ScannerBC {
	public static void main(String[] args) {
		NumberService KeyService = new NumberService();
		
		int num1 = KeyService.inputNum("첫 번째 정수를");
		int num2 = KeyService.inputNum("두 번째 정수를");
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}
}
