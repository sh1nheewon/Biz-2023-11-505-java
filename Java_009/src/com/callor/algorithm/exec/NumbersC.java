package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersC {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("숫자를");
		
		for (int main = num; main > 0 ; main-- ) {
			System.out.print(main);
			for(int sub = num ; sub < main ; sub--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}
