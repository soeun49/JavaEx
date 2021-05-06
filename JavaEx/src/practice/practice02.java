package practice;

import java.util.Scanner;

public class practice02 {
// 배열 연습문제
	
	public static void main(String[] args) {
		problem01();
		problem02();

	}

	private static void problem01() {
		
			        int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

		        int count = 0;
		        int sum = 0;


		        for (int i=0; i<data.length; i++) {
		   
		        	System.out.println(data[i]);
		            
		        	if (data[i]%3==0) {
		                count++;
		                sum += data[i];
		            }

		        }
		        System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
		        System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
		    }


private static void problem02() {
	int sum=1;
	int num=1;
	int average=1;
	
	Scanner scanner= new Scanner (System.in);
	do {System.out.print("숫자를 입력하세요");
	num = scanner.nextInt();
	sum += num;
	average = sum/5;

	}
		
	while(num!=0);	
	for (int i=0;i<Math.random();i++) {
		System.out.println(i);
	 System.out.println("평균은" + average);
	scanner.close();
	}
}
				
			
}

	
	
	
	
	
	
	
	
	
	

	
