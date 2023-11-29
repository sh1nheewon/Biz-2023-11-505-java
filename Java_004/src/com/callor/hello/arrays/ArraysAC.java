package com.callor.hello.arrays;

/*
 * 매직스트링(코드)에서 어떤 값(숫자, 문자열 등)을 literal 방식으로 바로 코딩하는 것.
 * ex) int[] nums = new int[10] 이라는 코드에서 10 이라는 값을 "매직스트링" 이라고 한다.
 * 매직스트링이 코드에서 2번 이상 등장하면 변수로 선언하여 사용하는 것이 좋다. 
 * 매직스트링이 있는 코드는 코드를 변경(업그레이드, 기능 수정)할 때 오류를 일으킬 확률이 매우 높다.  
 */
public class ArraysAC {
	public static void main(String[] args) {

		// 매직스트링 대신 변수를 선언하여 사용하기
		int arrayLength = 10;
		int searchVar = 80;

		int[] nums = new int[arrayLength];
		/*
		 * Java 에서 배열을 생성(new ..)하면 자동으로 .length 라는 변수가 배열 내부에 부착된다. 배열.length 라는 변수를
		 * 활용하여 배열의 전체 개수를 알 수 있다. (nums.length = 배열의 전체 개수를 알고 있는 변수)
		 */
		for (int i = 0; i < nums.length; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums[i] = rndNum;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > searchVar) {
				System.out.printf("index %d 번 요소값 : %d\n", i, nums[i]);
				break;
			}
		}
	}
}
