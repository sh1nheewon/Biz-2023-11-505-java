package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentService {
	private Scanner scan = null;

	public StudentService() {
		scan = new Scanner(System.in);
	}

	public boolean inputStudent() {

		System.out.print("학번을 입력하세요 >> ");
		String stdNum = scan.nextLine();
		if (stdNum.equals("QUIT")) {
			return false;
		}

		System.out.print("이름을 입력하세요 >> ");
		String stdName = scan.nextLine();
		if (stdName.equals("QUIT")) {
			return false;
		}

		System.out.print("학과를 입력하세요 >> ");
		String stdDept = scan.nextLine();
		if (stdDept.equals("QUIT")) {
			return false;
		}

		System.out.print("학년을 입력하세요 >> ");
		String stdGrade = scan.nextLine();
		if (stdGrade.equals("QUIT")) {
			return false;
		}

		System.out.print("전화번호를 입력하세요 >> ");
		String stdTel = scan.nextLine();
		if (stdTel.equals("QUIT")) {
			return false;
		}

		System.out.print("주소를 입력하세요 >> ");
		String stdAddr = scan.nextLine();
		if (stdAddr.equals("QUIT")) {
			return false;
		}

		StudentDto stdDto = new StudentDto();
		stdDto.num = stdNum;
		stdDto.name = stdName;
		stdDto.dept = stdDept;
		stdDto.grade = stdGrade;
		stdDto.tel = stdTel;
		stdDto.addr = stdAddr;
		return true;
		
		if(stdDto.num == stdNum.equals()) {
			
		}
		
	}

	public void inputStudents() {
		boolean result = true;
		
		while (result) {
			result = inputStudent();
			for(int i = 0 ; i < 10 ; i++) {
				StudentDto stdDto = new StudentDto();
			}
			
		}
		System.out.println("입력 종료");
	}
}
