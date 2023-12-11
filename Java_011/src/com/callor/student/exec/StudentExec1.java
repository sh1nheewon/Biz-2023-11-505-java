package com.callor.student.exec;

import com.callor.student.service.StudentService;

public class StudentExec1 {
	public static void main(String[] args) {
		StudentService stService = new StudentService();
		stService.inputStudents();
	}
}
