package com.callor.hello.pay;

public class PayD {
	public static void main(String[] args) {
		int pay = 3587960;

		int note50000 = pay / 50000;
		pay = pay % 50000;
		
		int note10000 = pay / 10000;
		pay = pay % 10000;
		
		int note5000 = pay / 5000;
		pay = pay % 5000;
		
		int note1000 = pay / 1000;
		pay = pay % 1000;
		
		int note500 = pay / 500;
		pay = pay % 500;
		
		int note100 = pay / 100;
		pay = pay % 100;
		
		int note50 = pay / 50;
		pay = pay % 50;
		
		int note10 = pay / 10;
		pay = pay % 10;
		
		System.out.println("====================");
		System.out.println("5 만원권 : " + note50000);
		System.out.println("1 만원권 : " + note10000);
		System.out.println("5 천원권 : " + note5000);
		System.out.println("1 천원권 : " + note1000);
		System.out.println("5 백원권 : " + note500);
		System.out.println("1 백원권 : " + note100);
		System.out.println("5 십원권 : " + note50);
		System.out.println("1 십원권 : " + note10);
		
		
	}
}
