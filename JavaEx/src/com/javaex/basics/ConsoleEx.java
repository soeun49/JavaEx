package com.javaex.basics;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();
		
	}
private static void consoleOutputEx() {
	//콘솔 출력
	//System.out -> 표준 출력
	//System.err -> 표준 에러
	
	// print 매서드 -> 출력 후 개행 안 함
	// println 매서드 -> 출력 후 개행 함 
	// printf 매서드 -> 형식화된 출력 -> TODO; 뒤쪽 String 항목에서 정리
	
	System.out.print("Hello ");
	System.out.println("Java");
	
	//이스케이프 문자: 특수한 의미를 가진 문자
	System.out.println("Hello\nJava"); // \n -> 강제 개행
	System.out.println("Hello\tJava"); // \t -> 탭문자
	
	System.out.println("Hello, \"Java\""); // \"~"\ 따옴표 묶기
	String dir = "C:\\Windows:\\System"; // \\ -> \ 자체를 표기하고자 할 때 
	System.out.println (dir);
	
	System.err.println("표준 에러 출력");
	
	}


}
