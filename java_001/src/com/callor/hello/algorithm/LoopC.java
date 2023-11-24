package com.callor.hello.algorithm;

public class LoopC {
	public static void main(String[] args) {
		int count = 0;
		for(int index = 0; index < 100 ; index++) {
			System.out.print("* ");
			// 별을 출력 할 때 마다 count 를 1 씩 증가시키고
			count++;
			// 카운트가 10을 넘어가면 Enter 와 함께 count 를 다시 초기화
			if(count >= 10) {
				System.out.println();
				count = 0;
			}
			// 10개의 별을 출력한 후 줄바꿈(Enter)을 해 주면 된다. 
			if(index % 10 == 9) { 
				 System.out.println();	
			}
		}
	}
}