package com.callor.hello.pay;

public class PayE {
	public static void main(String[] args) {
		int pay = 3587960;
		System.out.println("====================");
		
		System.out.println("5 만원권 : " + pay / 50000);
		pay = pay % 50000;
		
		System.out.println("1 만원권 : " + pay / 10000);
		pay = pay % 10000;
		
		System.out.println("5 천원권 : " + pay / 5000);
		pay = pay % 5000;
		
		System.out.println("1 천원권 : " + pay / 1000);
		pay = pay % 1000;
		
		System.out.println("5 백원권 : " + pay / 500);
		pay = pay % 500;
		
		System.out.println("1 백원권 : " + pay / 100);
		pay = pay % 100;
		
		System.out.println("5 십원권 : " + pay / 50);
		pay = pay % 50;
		
		System.out.println("1 십원권 : " + pay / 10);
		pay = pay % 10;

		
	}
}
