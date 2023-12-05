package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

// 생성자 method 를 선언하고 Scanner 를 통하여 dataFile(data.txt) 파일을 열어 데이터를 읽을 준비를 하는 코드
// class 영역에서 sysout 불가능(method 내에서만 가능)
// 변수는 class, method 영역 다 선언 가능
// method 내부에 method 생성 불가능
public class ScoreServiceB {
	private Scanner scan = null;
	
	//service class 안에 있는 것은 private 를 사용
	private List<ScoreDto> scores = null;  
	// scores 의 type : List type / scores 의 요소 : <ScoreDto> // 배열의 개수 : null(0)
	// private List<Integer> nums = null;
	
	/*
	 * ScoreServiceB 클래스의 생성자 method
	 * 어떤 도구들을(미리)준비하는 일을 수행한다 
	 */
	
	public ScoreServiceB(String dataFile) { //< 생성자 method //(dataFile) 에 대한 정보를 전달 받기. 
		// String dataFile = "";
		InputStream is = null;
		try {
			is = new FileInputStream(dataFile); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is); // () 안에 무조건 넣어야함. class 재생 . is : InputStream
		
		/*
		 * item(요소) 수가 0인 상태의 List 가 준비된다
		 */
		scores = new ArrayList<>(); // <> 안에 Integer 생략
		//scores = new LinkedList<>();
		//scores = new Vector<>();
		
		
	}// end 생성자
	
	public void loadScores() {
		while(scan.hasNext()) {
			String line = scan.nextLine();
			//System.out.println(line);
			
			String[] lines = line.split(",");
			ScoreDto scoreDto = new ScoreDto();
			try {
				scoreDto.stdNum = lines[0];
				
				scoreDto.kor = Integer.valueOf(lines[1]);
				scoreDto.eng = Integer.valueOf(lines[2]);
				scoreDto.math = Integer.valueOf(lines[3]);
				scoreDto.music = Integer.valueOf(lines[4]);
				scoreDto.art = Integer.valueOf(lines[5]);
				scoreDto.sw = Integer.valueOf(lines[6]);
				scoreDto.db = Integer.valueOf(lines[7]);
				
			} catch (Exception e) { // 오류가 발생하면 println과 함께 break
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}
			
			// List type 의 데이터 목록에 ScoreDto 요소를 추가하기
			// List type 의 데이터 맨 끝에 추가된다
			scores.add(scoreDto); // 0부터 다시 시작
			
		}// end while
		
	}// end loadScore()
	
	public void countScore() {
		System.out.println( scores.size() );
	}
	public void printScore() {
		Line.dLine(100);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(100);
		for(int i = 0 ; i < scores.size() ; i++) {  // 배열은 .length / add 는 .size
			ScoreDto scoreDto = scores.get(i);
			
			System.out.printf("%s\t",scoreDto.stdNum);
			System.out.printf("%3d\t",scoreDto.kor);
			System.out.printf("%3d\t",scoreDto.eng);
			System.out.printf("%3d\t",scoreDto.math);
			System.out.printf("%3d\t",scoreDto.getTotal());
			System.out.printf("%5.2f\n",scoreDto.getAvg());
			
			
		}
		
	}// end printScore
}