package com.callor.student.exec;

import com.callor.student.service.impl.StartServiceImplV1;

public class StartExA {	
	public static void main(String[] args) {
		StartServiceImplV1 sService = new StartServiceImplV1(); 
		sService.mainMenu();
		sService.selectMenu();
	}
}
