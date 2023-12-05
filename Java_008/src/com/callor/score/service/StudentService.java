package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentDto;
import com.callor.score.utils.Line;

public class StudentService {
	private Scanner scan = null;
	private List<StudentDto> student = null;
	
	public StudentService (String dataFile) {
		InputStream is = null;
		
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		student = new ArrayList<>();
		
	}// end 생성자
	public void loadStudents() {
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			StudentDto studentDto = new StudentDto();
			
			try {
				studentDto.stdNum = lines[0];
				studentDto.name = lines[1];
				studentDto.dept = lines[2];
				studentDto.grade = lines[3];
				studentDto.prof = lines[4];
				studentDto.tel = lines[5];
				studentDto.addr = lines[6];
				
			} catch (Exception e) {
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}
			
			
			student.add(studentDto);
			
			
		}// end while
	}//end loadStudents()
	
	public void countStudents() {
		System.out.println(student.size());
	}
	public void printStudents() {
		Line.dLine(200);
		System.out.println("학번\t	이름\t	학과\t	학년\t	담임교수\t	전화번호\t	주소");
		Line.sLine(200);
		for(int i = 0 ; i < student.size() ; i++ ) {
			StudentDto studentDto = student.get(i);
			
			System.out.printf("%s\t",studentDto.stdNum);
			System.out.printf("	%s\t",studentDto.name);
			System.out.printf("	%s\t",studentDto.dept);
			System.out.printf("	%s\t",studentDto.grade);
			System.out.printf("	%s\t",studentDto.prof);
			System.out.printf("	%5s\t",studentDto.tel);
			System.out.printf("	%s\t",studentDto.addr);
			System.out.println();
		}
		Line.dLine(100);
	}
}
