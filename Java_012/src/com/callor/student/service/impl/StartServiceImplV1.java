package com.callor.student.service.impl;

import java.util.Scanner;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StartServiceImplV1 implements StartService {

	protected Scanner scan = null;
	protected StudentService stService = null;
	
	public StartServiceImplV1() {
		scan = new Scanner(System.in);
		stService = new StudentServiceImplV1();
	}

	@Override
	public void mainMenu() {
		Line.dLine(100);
		System.out.println("한울고교 학사관리");
		Line.dLine(100);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(100);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 종료");
		Line.sLine(100);
	}

	@Override
	public Integer selectMenu() {
		
		scan = new Scanner(System.in);

		System.out.print("업무 선택 >> ");
		String str = scan.nextLine();
		int num = Integer.valueOf(str);

		if (num < 1 && num > 3) {
			System.out.println("1~3의 숫자를 입력하세요");
		}
		if (str.equals("QUIT")) {
			System.out.println("업무 종료");

		}

		return null;

	}

	@Override
	public void startApp() {
		// TODO Auto-generated method stub

	}

}
