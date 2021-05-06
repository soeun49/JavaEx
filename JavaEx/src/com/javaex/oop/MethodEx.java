package com.javaex.oop;

//매서드 관련 예제 정리
public class MethodEx {
	public static void main (String[] args) {
		printMessage();
		System.out.println("Square:" + square(2));
		System.out.println("4+5 = " + getSum(4,5));
		
		printDivide(7,3);
		printDivide(7,0);
	}
	
	//return 문을 만나면 매서드 실행을 중단하고 호출한 쪽으로 돌아감
	private static void printDivide (int num1, int num2) {
		if (num2==0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return; //if가 성립할 시, 아래쪽을 수행하지 않고 출력함 
		}
		System.out.printf("%d/%d = %d%n", num1,num2,num1/num2);
	}
	
	//매개 변수의 갯수는 필요한 만큼!
	private static double getSum(double num1, double num2) {
		return num1+ num2;
	}
	
	//입력이 있고, 반환이 있는 매서드 
	private static double square (double num) {
		//매개변수는 매서드를 벗어나면 효력이 없음
		//반환 타입과 일치하는 데이터를 return 해야 함 
		return num*num; 
		
	}
	
	//입력이 없고, 반환이 없는 매서드 (void)	
private static void printMessage() {
	System.out.println("Message");
	
}
	
}
