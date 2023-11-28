package com.callor.hello.arrays;

public class ArraysD {
	public static void main(String[] args) {

		int[] nums = new int[10];
		int index = 0;
		for (index = 0; index < 10; index++) {
			nums[index] = (int) (Math.random() * 50) + 51;
		}
		for (index = 0; index < 10; index++) {
			if (nums[index] % 2 == 0) {
				System.out.printf("%d 번 요소의 값 : %d \n", index, nums[index]);
			}
		}
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}

		System.out.println("합계 : " + sum);
	}
}