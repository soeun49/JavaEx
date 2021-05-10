package practice.home.practice;

import java.util.Scanner;

public class practice02 {
// 배열 연습문제
	
	public static void main(String[] args) {
		//problem01();
		//problem02();
		//problem05();
		//problem04();
		//problem03();
		
		
	}
	
	private static void problem03() {
		   char []  c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};  
	       
	       System.out.println(c);
	       
	       String str = new String(c);
	       String text = str.replace(' ',',');
	       char[] arrChar = text.toCharArray();
	    	  	    	
		   System.out.println(arrChar);
	}
	
	   	
// 로또 추첨(!)
	private static void problem04() {
		    		int[] no = new int[6];
	        
	    		int idx = 0;
	    		
	    		while (idx < no.length) {
	        		int choice = (int)(Math.random() * 45) + 1;
	        		boolean isDuplicated = false;	//	중복 체크를 위한 체크 변수
	        		
	        		        		
	        		no[idx] = choice;
	        		idx++;
	        }
	        
	        for(int i = 0; i < no.length; i++){
	            System.out.print(no[i] + "  ");
	        }
	        System.out.println();
	    }

	
	
	private static void problem05() {

		int scoreboard [][] = {
				{80,75,90,75,78},
				{92,88,89,92,70},
				{78,80,85,86,63},
				{83,84,89,87,75},
				{89,83,93,94,78}
			};
		
		int total = 0;
		int count =0;
		
		for (int i=0; i<scoreboard.length; i++) {
			for (int j=0; j<scoreboard[i].length;j++) {
				if (scoreboard[i][j]>=85) {
					total += scoreboard[i][j]; 
					count++;

				}
				System.out.println(scoreboard[i][j]>=85);
			}
		
		}
		
			System.out.printf("85점 이상의 총합은 %d, 평균은 %f 입니다.%n", total, (float)total/count);
			
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
	int sum=0;
	double avg=0;
	
	Scanner scanner= new Scanner (System.in);
	System.out.print("숫자를 입력하세요");
	int num[] = new int[5];
	
	for (int i=0; i<num.length;i++) {
		num[i]=scanner.nextInt();

	sum += num[i];
	avg = (double)sum/ num.length ;
	
	
	}
		
	System.out.println("평균은" + avg);
	scanner.close();
	}
}
				
			


	
	
	
	
	
	
	
	
	
	

	
