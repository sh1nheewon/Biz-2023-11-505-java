package com.callor.hello.arrays;

public class ArraysA {
	public static void main(String[] args) {
		int[] nums = new int[10];

		for (int index = 0; index < 10; index++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums[index] = rndNum;
		}
		
		for (int i = 0; i < 10; i++) {
			if (nums[i] > 80) {
				System.out.printf("index : %d , 배열의 요소 값 : %d", i, nums[i]);
				break;
			}
		}
	}
}
