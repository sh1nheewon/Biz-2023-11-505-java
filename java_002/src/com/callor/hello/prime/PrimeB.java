package com.callor.hello.prime;

public class PrimeB {
	public static void main(String[] args) {
		int num = 17;
		
		for(int i = 2 ; i < num ; i++) {
			
			if(num % i == 0) {
				
				System.out.printf("%d MOD %d = %d, ", num , i , num % i, num);
				System.out.println(num + "는 소수가 아님");
				
				break; // break 를 넣어주면 if 반복문의 값이 나오게 되었을 때 멈추게 됨.
				
			}
		}
	}
}
