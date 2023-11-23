package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		
		/*
		 * 우리나라 화폐는
		 * 5만, 1만, 5천, 1천, 1백, 5십, 1십 원 단위이다.
		 * 아래 pay 에 저장된 값에서
		 * 각각 화폐단위만큼 몇개씩이 포함되는지 출력.
		 */
		
		
		int pay = 3587960;
		
		System.out.println("===================");
		System.out.print("5만원권 : ");
		System.out.println(pay / 10000 / 5);
		System.out.print("1만원권 : ");
		System.out.println(pay / 10000 % 5);
		System.out.print("5천원권 : ");
		System.out.println(pay % 10000 / 5000);
		System.out.print("1천원권 : ");
		System.out.println(pay % 10000 % 5000 / 1000);
		System.out.print("5백원권 : ");
		System.out.println(pay % 1000 / 500);
		System.out.print("1백원권 : ");
		System.out.println(pay % 1000 % 500 / 100);
		System.out.print("5십원권 : ");
		System.out.println(pay % 100 / 50);
		System.out.print("1십원권 : ");
		System.out.println(pay % 100 % 50 / 10);
		System.out.println("===================");
	}
}
