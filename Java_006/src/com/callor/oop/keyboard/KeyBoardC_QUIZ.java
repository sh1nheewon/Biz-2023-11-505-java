package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardC_QUIZ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 0;
		int num = 0;
		int rndNum = (int) (Math.random() * 50) + 1;

		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 황금열쇠를 찾아라");
		System.out.println("=".repeat(50));

		while (true) {
			System.out.println("1~50 까지의 숫자 중 황금열쇠를 입력하세요");
			for (i = 1; i <= 5; i++) {
				System.out.print("황금열쇠 >> ");
				String str = scan.nextLine();
				try {
					num = Integer.valueOf(str);
				} catch (Exception e) {
					System.out.println("정확한 정수값을 입력하세요");
					System.out.printf("입력한 값 : (%s)\n", str);
					continue;
				}
				if (num < 1 || num > 50) {
					System.out.println("1~50 범위의 정수를 입력하세요");
					continue;
				}
				if (i >= 5) {
					System.out.printf("%d 회 시도. 황금열쇠 찾기에 실패했습니다. 정답 : %d\n", i, rndNum);
					System.out.println("다시 실행하기는 '재시작' 입력");
					System.out.println("게임 종료는 '종료' 입력");
					System.out.print("입력 >> ");
					str = scan.nextLine();
					break;	
				}
				if (rndNum == num) {
					System.out.printf("참 잘했어요 :  %d  (%d 번의 입력으로 정답 맞춤)\n", num, i);
					break;
				} else if (rndNum < num) {
					System.out.printf("값이 너무 커요 (%d) 번 째 시도\n", i);
					System.out.println("다시 한번 시도해 보세요");
					continue;
				} else if (rndNum > num) {
					System.out.printf("값이 너무 작아요 (%d) 번 째 시도\n", i);
					System.out.println("다시 한번 시도해 보세요");
					continue;
				}
				if (str.equals("재시작")) {
					return;
				}else {
					break;
				}
			}
		} // while end
	} // main end
}
//	if (str.equals("재시작")) 