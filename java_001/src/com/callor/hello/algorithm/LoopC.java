package com.callor.hello.algorithm;

public class LoopC {
	public static void main(String[] args) {
		for(int index = 0; index < 100 ; index++) {
			System.out.print("* ");
			if(index % 10 == 9) {
				 System.out.println();	
			}		
		}
	}
}