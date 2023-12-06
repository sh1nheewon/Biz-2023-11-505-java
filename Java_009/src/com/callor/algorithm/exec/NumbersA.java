package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersA {
	public static void main(String[] args) {
		int num = 0;
		Line.dLine(50);
		while(true) {
			num++;
			if(num > 10) {
				break;
			}
			System.out.printf("%d\t",num);
			
		}
	}
}
