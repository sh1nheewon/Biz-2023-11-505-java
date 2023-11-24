package com.callor.hello.algorithm;

public class LoopL {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i++) { //i 는 0부터 100까지 증가 반복.
			if ((i+1) % 2 == 0) {  // 만약 (i+1) 의 값을 나눈 나머지가 0 이라면 (짝수) 아래 변수로 들어감.
					sum += (i + 1); // i+1이 0부터 100까지의 짝수를 더한 값을 sum에 저장.   

			}
		}
		System.out.println(sum); // 짝수 값을 출력
	}
}