package com.callor.student.service;

//interface : class 의 설계도
/*
 * StudentService 클래스를 만드는 데 꼭 필요한 method 들은 무엇인가?
 * 
 * inputStudent()
 * inputStudents()
 * loadStudent()
 * printStudent()
 * 
 * interface 는 class 의 설계도 이다
 * interface 를 impliments 한 클래스는 interface 에 정의된
 * method 를 반드시 만들어야(구현해야) 한다
 */
public interface StudentService {
	
	// class 를 설계할 때 참조할 method 의 prototype 정의
	// 코드블럭( {} ) 없음
	public boolean inputStudent(); // 한 학생의 정보를 입력하여 메모리에 보관
	public void inputStudents(); // 여러 학생의 정보를 입력하여 메모리에 보관
	public void loadStudent(); // 파일에 저장된 학생 정보 메모리로 load
	public void saveStudent(); // 메모리에 보관된 학생 정보를 파일에 저장하기
	public void printStudent(); // 메모리에 보관된 학생 정보 출력하기
}
