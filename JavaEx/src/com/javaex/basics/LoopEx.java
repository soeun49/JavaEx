package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
	//	forLoopEx();
		continueEx();
	}
private static void continueEx() {
	//1부터 20까지의 수 중에서 2의배수 3의 배수를 제외한 숫자를 출력
	for (int i=1; i<=20; i++) {
		if (i%2==0 || i%3 ==0)  continue;//숫자가 2의 배수 혹은 3의 배수이면 실행하지 않고 다음 루프를 수행함
		System.out.println(i);
		
	}
	
}
	
	
	private static void forLoopEx() {
		//구구표 출력 (for 문 버전) -> While Gugu와 비교
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		//for (제어변수초기화; 반복조건 체크; 증감식)
		for (int num=1; num <10; num++) {
			System.out.println(dan + "*" + num + "=" + (dan*num));
	
				}
		scanner.close();
		
	}
}
