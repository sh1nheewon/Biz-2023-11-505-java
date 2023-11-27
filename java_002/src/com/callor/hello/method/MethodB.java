package com.callor.hello.method;

public class MethodB {

	public static void main(String[] args) {
		double num1 = 0;
		
		for(int i = 0; i < 10 ; i++) {			
			num1 = Math.random(); // 파란색은 도구 모음 / Math. 는 수학 관련 / random - 난수, 랜덤수
			num1 *= 100;
			
			int num2 = (int)num1; // float = int : 자동형변환 / int = float x -> (int) 붙이기 : 강제형변환
			
			System.out.println(num2);
		}
	}
}
