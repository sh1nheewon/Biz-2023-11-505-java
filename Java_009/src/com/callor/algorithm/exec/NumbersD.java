package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.service.NumberService;

public class NumbersD {
	public static void main(String[] args) {
		NumberService numberService = new NumberService();
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int count = 0;
		
		while (true) {
			if(sum<1000) {
				num = numberService.inputNum("숫자를");				
				sum += num;
				count++;
				continue;
			}else {
				break;
			}			
		}
		System.out.printf("%d 번 입력한 숫자 총 합 : %d",count,sum);
	}
}
