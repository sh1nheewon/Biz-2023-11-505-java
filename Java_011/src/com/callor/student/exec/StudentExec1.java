package com.callor.student.exec;

import com.callor.student.service.StudentServiceV3;

public class StudentExec1 {
	public static void main(String[] args) {
		StudentServiceV3 stService = new StudentServiceV3();
		//stService.inputStudents();
		stService.loadStudent();
	}
}
