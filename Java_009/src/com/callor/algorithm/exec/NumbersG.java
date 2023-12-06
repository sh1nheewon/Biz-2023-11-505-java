package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersG {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(30);
		int num = numService.inputNum("점수를");
		Line.sLine(30);

		if (100 >= num && num > 94) {
			System.out.println("A+ 입니다.");
		} else if (94 >= num && num > 89) {
			System.out.println("A 입니다.");
		} else if (89 >= num && num > 84) {
			System.out.println("B+ 입니다.");
		} else if (84 >= num && num > 80) {
			System.out.println("B 입니다.");
		} else if (79 >= num && num > 74) {
			System.out.println("C+ 입니다.");
		} else if (74 >= num && num > 69) {
			System.out.println("C 입니다.");
		} else if (69 >= num && num > 64) {
			System.out.println("D+ 입니다.");
		} else if (64 >= num && num > 59) {
			System.out.println("D 입니다.");
		} else if (59 >= num && num > 0) {
			System.out.println("F 입니다.");
		}

		if (num >= 80) {
			System.out.println("축하합니다");
		} else if (79 >= num && num >= 70) {
			System.out.println("더 분발하세요");
		} else if (num < 60) {
			System.out.println("낙제입니다");
		}
		Line.dLine(30);
	}
}
