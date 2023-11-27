package com.callor.hello.prime;

public class PrimeD {
	public static void main(String[] args) {
		int rndNum = (int)(Math.random() * 10) + 1;
		
		System.out.println(rndNum + "는 Prime Number 인가?");
		int index = 0;
		for(index = 2 ; index < rndNum ; index++) {
			if(rndNum % index == 0) {
				break;
			}	
		}
		if(index < rndNum) {
			
			System.out.println(rndNum + " 는 소수가 아님");
		}else {
			System.out.println(rndNum + " 는 소수");
		}
	}
}
