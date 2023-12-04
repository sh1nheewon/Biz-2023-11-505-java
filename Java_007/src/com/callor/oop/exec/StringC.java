package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringC {
	public static void main(String[] args) {

		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null; // 공통

		/*
		 * ...data.txt 파일을 읽어서 무언가 처리를 하려고 한다. Java 에서 파일을 읽어서 무언가 처리를 하려면 먼저 파일을 open
		 * 해야 한다. 이때 파일을 open 하는 도구 중에 FileInputStream 이라는 도구를 사용할 것이다.
		 * 
		 * 그런데, 파일을 open 하는 과정에서 어떠한 이유로든지 open 하고자 하는 파일이 없을 수 있거나 갑자기 사라질 수 있다. 때문에
		 * Java 에서는 파일을 open 하는 명령(도구)을 사용하는 코드에서는 반드시 try..catch 를 사용하여 exception 예방을
		 * 하도록 강제함.
		 */
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// open 한 data.txt 파일에 대한 정보(연결)를 Scanner 와 연결해주기.
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine(); 
			String[] result = line.split(","); // line.split(" ") : "" 안에 들어가는 문자 전부 삭제
			for (int i = 1; i < result.length; i++) {
				System.out.printf("%s	", result[i]);
			}
			int sum = 0;
			for (int i = 1; i < result.length; i++) {
				sum += Integer.valueOf(result[i]);
			}
			System.out.println("총점 : " + sum);
		}
		scan.close();
	}
}
