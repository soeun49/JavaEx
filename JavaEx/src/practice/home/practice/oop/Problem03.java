package practice.home.practice.oop;

import java.util.Scanner;

public class Problem03 {

public static void main(String[] args) {
				Ex3();
}

	private static void Ex3() {
			boolean run = true; 
			int balance = 0;
			Scanner scanner = new Scanner(System.in);
					
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
					default:
						System.out.println("다시 입력해주세요.");
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
	}


