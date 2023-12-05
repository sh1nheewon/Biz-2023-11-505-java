package com.callor.score.exec;

import com.callor.score.service.StudentService;

public class Student {
	public static void main(String[] args) {
		String data = "src/com/callor/score/service/student.txt";
		StudentService studentService = new StudentService(data);
		studentService.loadStudents();
		studentService.printStudents();
	}
}
