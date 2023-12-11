package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListA {
	public static void main(String[] args) {
		List<Integer> nums = null;
		nums = new ArrayList<Integer>();
		int[] num = new int [10];
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = (int)(Math.random() * 50) + 51 ;
			System.out.print(num[i]);
		}
	}
}
