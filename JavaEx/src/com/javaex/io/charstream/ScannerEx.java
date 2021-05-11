package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	//Scanner는 여러가지 입력 소스로부터 데이터를 입력 받는 클래스
	static String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename= rootPath + "thieves.txt";
	
	public static void main(String[] args) {

		//파일 정보 설정
		File file = new File(filename);
		
		try { 
			Scanner scanner = new Scanner (file);
			String name; 
			float height; 
			float weight;
			
			// 한 줄 단위로 읽어오기 
			//cf. StringTokenzier -> scanner가 변환 메서드(.nextFloat(), next())를 지원하여 더 편리하게 사용 가능함 
			while (scanner.hasNextLine()) {
				name = scanner.next(); // 문자열
				height = scanner.nextFloat(); //실수열
				weight = scanner.nextFloat();
				
				System.out.printf("%s, 키:%f, 체중: %f%n", name, weight, height);
				scanner.nextLine(); 
			}
			scanner.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
