package practice;

import java.util.Scanner;

//4장 연습문제
public class practice01_2 {

	public static void main(String[] args) {
		Ex3();
		Ex4();
		Ex5();
		Ex6();
		Ex7();
		
		
	}
	
	//4장 연습문제 #7
	private static void Ex7() {
		boolean run = true; //run while 문 반복
		int balance = 0;
		Scanner scanner = new Scanner(System.in);// ctrl+shift+o
				
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고| 4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
				case 1: 
					System.out.println("예금액> ");
					balance += scanner.nextInt();
					break;
				case 2:
					System.out.println("출금액> ");
					balance -=scanner.nextInt();
					break;
				case 3: 
					System.out.println("잔고> ");
					System.out.println(balance);
					break;
				case 4: 
					run = false;
					break;
					
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		scanner.close();
		
	}
	
	//4장 연습문제 #6 - 별로 삼각형
	private static void Ex6() {
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
				if (j==i) {
					System.out.println();
					
				}
			}
		}
	}
	
	//4장 연습문제 #5 - 해 구하기
	private static void Ex5() {
		for (int x=1; x<=10; x++) {
			for (int y=1; y<=10; y++) {
				if (4*x+5*y==60) {
					System.out.println("(" + x + "," +y + ")");
				}
			}
		}
		
		
	}
	
	//4장 연습문제 #4 -두 주사위 합이 5가 되면 멈추기
	private static void Ex4() {
		while (true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2= (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + "," +num2 + ")");
			
			if (num1+ num2 ==5) {
				break;
			}
		}
		
		
	}
	
	//4장 확인문제 #3 1~100까지중 3의 배수의 합 구하기
	private static void Ex3() {
		int sum=0;
		
		 for (int i=1;i<=100;i++) {
			 
			 if (i%3==0) {
				 sum+=i;
		
	 }
	}
		 System.out.println("3의 배수의 합 : " + sum);
	}
	
}
